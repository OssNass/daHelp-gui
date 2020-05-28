package org.sarc.dahelp.database.clinic;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class DoctorEntityPK implements Serializable {
    private int doctorId;
    private int clinicId;

    @Column(name = "doctor_id", nullable = false)
    @Id
    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    @Column(name = "clinic_id", nullable = false)
    @Id
    public int getClinicId() {
        return clinicId;
    }

    public void setClinicId(int clinicId) {
        this.clinicId = clinicId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DoctorEntityPK that = (DoctorEntityPK) o;

        if (doctorId != that.doctorId) return false;
        if (clinicId != that.clinicId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = doctorId;
        result = 31 * result + clinicId;
        return result;
    }
}
