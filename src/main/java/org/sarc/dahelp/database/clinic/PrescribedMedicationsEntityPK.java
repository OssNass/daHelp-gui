package org.sarc.dahelp.database.clinic;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class PrescribedMedicationsEntityPK implements Serializable {
    private int prescritionId;
    private int medicineId;

    @Column(name = "prescrition_id", nullable = false)
    @Id
    public int getPrescritionId() {
        return prescritionId;
    }

    public void setPrescritionId(int prescritionId) {
        this.prescritionId = prescritionId;
    }

    @Column(name = "medicine_id", nullable = false)
    @Id
    public int getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrescribedMedicationsEntityPK that = (PrescribedMedicationsEntityPK) o;

        if (prescritionId != that.prescritionId) return false;
        if (medicineId != that.medicineId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = prescritionId;
        result = 31 * result + medicineId;
        return result;
    }
}
