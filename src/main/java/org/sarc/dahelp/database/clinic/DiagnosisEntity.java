package org.sarc.dahelp.database.clinic;

import javax.persistence.*;

@Entity
@Table(name = "diagnosis", schema = "clinic", catalog = "dahelp")
@IdClass(DiagnosisEntityPK.class)
public class DiagnosisEntity {
    private int examinationId;
    private int diseaseId;
    private String notes;
    private int visitId;

    @Id
    @Column(name = "examination_id", nullable = false)
    public int getExaminationId() {
        return examinationId;
    }

    public void setExaminationId(int examinationId) {
        this.examinationId = examinationId;
    }

    @Id
    @Column(name = "disease_id", nullable = false)
    public int getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(int diseaseId) {
        this.diseaseId = diseaseId;
    }

    @Basic
    @Column(name = "notes", nullable = true, length = 600)
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Id
    @Column(name = "visit_id", nullable = false)
    public int getVisitId() {
        return visitId;
    }

    public void setVisitId(int visitId) {
        this.visitId = visitId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DiagnosisEntity that = (DiagnosisEntity) o;

        if (examinationId != that.examinationId) return false;
        if (diseaseId != that.diseaseId) return false;
        if (visitId != that.visitId) return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = examinationId;
        result = 31 * result + diseaseId;
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + visitId;
        return result;
    }
}
