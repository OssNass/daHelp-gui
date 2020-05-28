package org.sarc.dahelp.database.clinic;

import javax.persistence.*;

@Entity
@Table(name = "prescribed_medications", schema = "clinic", catalog = "dahelp")
@IdClass(PrescribedMedicationsEntityPK.class)
public class PrescribedMedicationsEntity {
    private int prescritionId;
    private int medicineId;
    private String dose;
    private int quantity;

    @Id
    @Column(name = "prescrition_id", nullable = false)
    public int getPrescritionId() {
        return prescritionId;
    }

    public void setPrescritionId(int prescritionId) {
        this.prescritionId = prescritionId;
    }

    @Id
    @Column(name = "medicine_id", nullable = false)
    public int getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    @Basic
    @Column(name = "dose", nullable = false, length = 100)
    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    @Basic
    @Column(name = "quantity", nullable = false)
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrescribedMedicationsEntity that = (PrescribedMedicationsEntity) o;

        if (prescritionId != that.prescritionId) return false;
        if (medicineId != that.medicineId) return false;
        if (quantity != that.quantity) return false;
        if (dose != null ? !dose.equals(that.dose) : that.dose != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = prescritionId;
        result = 31 * result + medicineId;
        result = 31 * result + (dose != null ? dose.hashCode() : 0);
        result = 31 * result + quantity;
        return result;
    }
}
