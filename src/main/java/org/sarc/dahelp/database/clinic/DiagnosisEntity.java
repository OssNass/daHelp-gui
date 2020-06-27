package org.sarc.dahelp.database.clinic;

import javax.persistence.*;

@Entity
@Table(name = "diagnosis", schema = "clinic", catalog = "dahelp")
@IdClass(DiagnosisEntityPK.class)
public class DiagnosisEntity {
    private Integer examinationId;
    private Integer diseaseId;
    private String notes;
    private Integer visitId;
    private DiseaseEntity diseaseByDiseaseId;

    @Id
    @Column(name = "examination_id", nullable = false)
    public Integer getExaminationId() {
        return examinationId;
    }

    public void setExaminationId(Integer examinationId) {
        this.examinationId = examinationId;
    }

    @Id
    @Column(name = "disease_id", nullable = false)
    public Integer getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(Integer diseaseId) {
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
    public Integer getVisitId() {
        return visitId;
    }

    public void setVisitId(Integer visitId) {
        this.visitId = visitId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DiagnosisEntity that = (DiagnosisEntity) o;

        if (examinationId != null ? !examinationId.equals(that.examinationId) : that.examinationId != null)
            return false;
        if (diseaseId != null ? !diseaseId.equals(that.diseaseId) : that.diseaseId != null) return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;
        if (visitId != null ? !visitId.equals(that.visitId) : that.visitId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = examinationId != null ? examinationId.hashCode() : 0;
        result = 31 * result + (diseaseId != null ? diseaseId.hashCode() : 0);
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + (visitId != null ? visitId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "disease_id", referencedColumnName = "disease_id", nullable = false, insertable = false, updatable = false)
    public DiseaseEntity getDiseaseByDiseaseId() {
        return diseaseByDiseaseId;
    }

    public void setDiseaseByDiseaseId(DiseaseEntity diseaseByDiseaseId) {
        this.diseaseByDiseaseId = diseaseByDiseaseId;
    }
}
