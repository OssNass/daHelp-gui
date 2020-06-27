package org.sarc.dahelp.database.clinic;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class DoctorEntityPK implements Serializable {
    private Integer doctorId;
    private Integer clinicId;

    @Column(name = "doctor_id", nullable = false)
    @Id
    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    @Column(name = "clinic_id", nullable = false)
    @Id
    public Integer getClinicId() {
        return clinicId;
    }

    public void setClinicId(Integer clinicId) {
        this.clinicId = clinicId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DoctorEntityPK that = (DoctorEntityPK) o;

        if (doctorId != null ? !doctorId.equals(that.doctorId) : that.doctorId != null) return false;
        if (clinicId != null ? !clinicId.equals(that.clinicId) : that.clinicId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = doctorId != null ? doctorId.hashCode() : 0;
        result = 31 * result + (clinicId != null ? clinicId.hashCode() : 0);
        return result;
    }
}
