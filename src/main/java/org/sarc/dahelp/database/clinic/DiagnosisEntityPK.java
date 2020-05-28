package org.sarc.dahelp.database.clinic;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class DiagnosisEntityPK implements Serializable {
    private int examinationId;
    private int diseaseId;
    private int visitId;

    @Column(name = "examination_id", nullable = false)
    @Id
    public int getExaminationId() {
        return examinationId;
    }

    public void setExaminationId(int examinationId) {
        this.examinationId = examinationId;
    }

    @Column(name = "disease_id", nullable = false)
    @Id
    public int getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(int diseaseId) {
        this.diseaseId = diseaseId;
    }

    @Column(name = "visit_id", nullable = false)
    @Id
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

        DiagnosisEntityPK that = (DiagnosisEntityPK) o;

        if (examinationId != that.examinationId) return false;
        if (diseaseId != that.diseaseId) return false;
        if (visitId != that.visitId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = examinationId;
        result = 31 * result + diseaseId;
        result = 31 * result + visitId;
        return result;
    }
}
