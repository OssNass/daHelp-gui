package org.sarc.dahelp.database.clinic;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "disease", schema = "clinic", catalog = "dahelp")
public class DiseaseEntity {
    private Integer diseaseId;
    private String diseaseCode;
    private String diseaseName;
    private Collection<DiagnosisEntity> diagnosesByDiseaseId;

    @Id
    @Column(name = "disease_id", nullable = false)
    public Integer getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(Integer diseaseId) {
        this.diseaseId = diseaseId;
    }

    @Basic
    @Column(name = "disease_code", nullable = false, length = 20)
    public String getDiseaseCode() {
        return diseaseCode;
    }

    public void setDiseaseCode(String diseaseCode) {
        this.diseaseCode = diseaseCode;
    }

    @Basic
    @Column(name = "disease_name", nullable = true, length = 40)
    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DiseaseEntity that = (DiseaseEntity) o;

        if (diseaseId != null ? !diseaseId.equals(that.diseaseId) : that.diseaseId != null) return false;
        if (diseaseCode != null ? !diseaseCode.equals(that.diseaseCode) : that.diseaseCode != null) return false;
        if (diseaseName != null ? !diseaseName.equals(that.diseaseName) : that.diseaseName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = diseaseId != null ? diseaseId.hashCode() : 0;
        result = 31 * result + (diseaseCode != null ? diseaseCode.hashCode() : 0);
        result = 31 * result + (diseaseName != null ? diseaseName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "diseaseByDiseaseId")
    public Collection<DiagnosisEntity> getDiagnosesByDiseaseId() {
        return diagnosesByDiseaseId;
    }

    public void setDiagnosesByDiseaseId(Collection<DiagnosisEntity> diagnosesByDiseaseId) {
        this.diagnosesByDiseaseId = diagnosesByDiseaseId;
    }
}
