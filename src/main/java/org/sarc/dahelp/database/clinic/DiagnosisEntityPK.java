package org.sarc.dahelp.database.clinic;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class DiagnosisEntityPK implements Serializable {
    private Integer examinationId;
    private Integer diseaseId;
    private Integer visitId;

    @Column(name = "examination_id", nullable = false)
    @Id
    public Integer getExaminationId() {
        return examinationId;
    }

    public void setExaminationId(Integer examinationId) {
        this.examinationId = examinationId;
    }

    @Column(name = "disease_id", nullable = false)
    @Id
    public Integer getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(Integer diseaseId) {
        this.diseaseId = diseaseId;
    }

    @Column(name = "visit_id", nullable = false)
    @Id
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

        DiagnosisEntityPK that = (DiagnosisEntityPK) o;

        if (examinationId != null ? !examinationId.equals(that.examinationId) : that.examinationId != null)
            return false;
        if (diseaseId != null ? !diseaseId.equals(that.diseaseId) : that.diseaseId != null) return false;
        if (visitId != null ? !visitId.equals(that.visitId) : that.visitId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = examinationId != null ? examinationId.hashCode() : 0;
        result = 31 * result + (diseaseId != null ? diseaseId.hashCode() : 0);
        result = 31 * result + (visitId != null ? visitId.hashCode() : 0);
        return result;
    }
}
