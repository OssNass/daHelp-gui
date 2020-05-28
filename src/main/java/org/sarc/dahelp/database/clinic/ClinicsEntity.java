package org.sarc.dahelp.database.clinic;

import javax.persistence.*;

@Entity
@Table(name = "clinics", schema = "clinic", catalog = "dahelp")
public class ClinicsEntity {
    private int clinicId;
    private String clinicName;

    @Id
    @Column(name = "clinic_id", nullable = false)
    public int getClinicId() {
        return clinicId;
    }

    public void setClinicId(int clinicId) {
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

        if (clinicId != that.clinicId) return false;
        if (clinicName != null ? !clinicName.equals(that.clinicName) : that.clinicName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = clinicId;
        result = 31 * result + (clinicName != null ? clinicName.hashCode() : 0);
        return result;
    }
}
