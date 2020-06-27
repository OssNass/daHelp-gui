package org.sarc.dahelp.database.clinic;

import javax.persistence.*;

@Entity
@Table(name = "prescribed_medications", schema = "clinic", catalog = "dahelp")
@IdClass(PrescribedMedicationsEntityPK.class)
public class PrescribedMedicationsEntity {
    private Integer prescritionId;
    private Integer medicineId;
    private String dose;
    private Integer quantity;
    private PrescriptionEntity prescriptionByPrescritionId;
    private MedicineEntity medicineByMedicineId;

    @Id
    @Column(name = "prescrition_id", nullable = false)
    public Integer getPrescritionId() {
        return prescritionId;
    }

    public void setPrescritionId(Integer prescritionId) {
        this.prescritionId = prescritionId;
    }

    @Id
    @Column(name = "medicine_id", nullable = false)
    public Integer getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Integer medicineId) {
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
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrescribedMedicationsEntity that = (PrescribedMedicationsEntity) o;

        if (prescritionId != null ? !prescritionId.equals(that.prescritionId) : that.prescritionId != null)
            return false;
        if (medicineId != null ? !medicineId.equals(that.medicineId) : that.medicineId != null) return false;
        if (dose != null ? !dose.equals(that.dose) : that.dose != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = prescritionId != null ? prescritionId.hashCode() : 0;
        result = 31 * result + (medicineId != null ? medicineId.hashCode() : 0);
        result = 31 * result + (dose != null ? dose.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "prescrition_id", referencedColumnName = "prescription_id", nullable = false, insertable = false, updatable = false)
    public PrescriptionEntity getPrescriptionByPrescritionId() {
        return prescriptionByPrescritionId;
    }

    public void setPrescriptionByPrescritionId(PrescriptionEntity prescriptionByPrescritionId) {
        this.prescriptionByPrescritionId = prescriptionByPrescritionId;
    }

    @ManyToOne
    @JoinColumn(name = "medicine_id", referencedColumnName = "medicine_id", nullable = false, insertable = false, updatable = false)
    public MedicineEntity getMedicineByMedicineId() {
        return medicineByMedicineId;
    }

    public void setMedicineByMedicineId(MedicineEntity medicineByMedicineId) {
        this.medicineByMedicineId = medicineByMedicineId;
    }
}
