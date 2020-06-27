package org.sarc.dahelp.database.clinic;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "clinics", schema = "clinic", catalog = "dahelp")
public class ClinicsEntity {
    private Integer clinicId;
    private String clinicName;
    private Collection<DoctorEntity> doctorsByClinicId;

    @Id
    @Column(name = "clinic_id", nullable = false)
    public Integer getClinicId() {
        return clinicId;
    }

    public void setClinicId(Integer clinicId) {
        this.clinicId = clinicId;
    }

    @Basic
    @Column(name = "clinic_name", nullable = false, length = 20)
    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClinicsEntity that = (ClinicsEntity) o;

        if (clinicId != null ? !clinicId.equals(that.clinicId) : that.clinicId != null) return false;
        if (clinicName != null ? !clinicName.equals(that.clinicName) : that.clinicName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = clinicId != null ? clinicId.hashCode() : 0;
        result = 31 * result + (clinicName != null ? clinicName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "clinicsByClinicId")
    public Collection<DoctorEntity> getDoctorsByClinicId() {
        return doctorsByClinicId;
    }

    public void setDoctorsByClinicId(Collection<DoctorEntity> doctorsByClinicId) {
        this.doctorsByClinicId = doctorsByClinicId;
    }
}
