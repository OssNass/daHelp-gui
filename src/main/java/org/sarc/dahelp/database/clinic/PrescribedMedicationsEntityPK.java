package org.sarc.dahelp.database.clinic;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class PrescribedMedicationsEntityPK implements Serializable {
    private Integer prescritionId;
    private Integer medicineId;

    @Column(name = "prescrition_id", nullable = false)
    @Id
    public Integer getPrescritionId() {
        return prescritionId;
    }

    public void setPrescritionId(Integer prescritionId) {
        this.prescritionId = prescritionId;
    }

    @Column(name = "medicine_id", nullable = false)
    @Id
    public Integer getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Integer medicineId) {
        this.medicineId = medicineId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrescribedMedicationsEntityPK that = (PrescribedMedicationsEntityPK) o;

        if (prescritionId != null ? !prescritionId.equals(that.prescritionId) : that.prescritionId != null)
            return false;
        if (medicineId != null ? !medicineId.equals(that.medicineId) : that.medicineId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = prescritionId != null ? prescritionId.hashCode() : 0;
        result = 31 * result + (medicineId != null ? medicineId.hashCode() : 0);
        return result;
    }
}
