package org.sarc.dahelp.database.clinic;

import javax.persistence.*;

@Entity
@Table(name = "examination", schema = "clinic", catalog = "dahelp")
public class ExaminationEntity {
    private int examinationId;
    private int visitId;
    private int doctorId;
    private Integer clinicId;

    @Id
    @Column(name = "examination_id", nullable = false)
    public int getExaminationId() {
        return examinationId;
    }

    public void setExaminationId(int examinationId) {
        this.examinationId = examinationId;
    }

    @Basic
    @Column(name = "visit_id", nullable = false)
    public int getVisitId() {
        return visitId;
    }

    public void setVisitId(int visitId) {
        this.visitId = visitId;
    }

    @Basic
    @Column(name = "doctor_id", nullable = false)
    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    @Basic
    @Column(name = "clinic_id", nullable = true)
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

        ExaminationEntity that = (ExaminationEntity) o;

        if (examinationId != that.examinationId) return false;
        if (visitId != that.visitId) return false;
        if (doctorId != that.doctorId) return false;
        if (clinicId != null ? !clinicId.equals(that.clinicId) : that.clinicId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = examinationId;
        result = 31 * result + visitId;
        result = 31 * result + doctorId;
        result = 31 * result + (clinicId != null ? clinicId.hashCode() : 0);
        return result;
    }
}
