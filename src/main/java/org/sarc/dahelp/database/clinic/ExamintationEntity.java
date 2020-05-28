package org.sarc.dahelp.database.clinic;

import javax.persistence.*;

@Entity
@Table(name = "examintation", schema = "clinic", catalog = "dahelp")
public class ExamintationEntity {
    private int examinationId;
    private int visitId;
    private int doctorId;
    private int prescritionId;

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
    @Column(name = "prescrition_id", nullable = false)
    public int getPrescritionId() {
        return prescritionId;
    }

    public void setPrescritionId(int prescritionId) {
        this.prescritionId = prescritionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExamintationEntity that = (ExamintationEntity) o;

        if (examinationId != that.examinationId) return false;
        if (visitId != that.visitId) return false;
        if (doctorId != that.doctorId) return false;
        if (prescritionId != that.prescritionId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = examinationId;
        result = 31 * result + visitId;
        result = 31 * result + doctorId;
        result = 31 * result + prescritionId;
        return result;
    }
}
