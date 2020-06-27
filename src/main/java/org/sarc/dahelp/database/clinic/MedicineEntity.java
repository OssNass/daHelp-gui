package org.sarc.dahelp.database.clinic;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "medicine", schema = "clinic", catalog = "dahelp")
public class MedicineEntity {
    private Integer medicineId;
    private String medicineName;
    private String medicineCalibre;
    private Integer medicineForm;
    private String activeMaterial;
    private String code;
    private Collection<PharmacyStockEntity> pharmacyStocksByMedicineId;
    private Collection<PrescribedMedicationsEntity> prescribedMedicationsByMedicineId;

    @Id
    @Column(name = "medicine_id", nullable = false)
    public Integer getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Integer medicineId) {
        this.medicineId = medicineId;
    }

    @Basic
    @Column(name = "medicine-name", nullable = false, length = 40)
    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    @Basic
    @Column(name = "medicine_calibre", nullable = false, length = 20)
    public String getMedicineCalibre() {
        return medicineCalibre;
    }

    public void setMedicineCalibre(String medicineCalibre) {
        this.medicineCalibre = medicineCalibre;
    }

    @Basic
    @Column(name = "medicine_form", nullable = false)
    public Integer getMedicineForm() {
        return medicineForm;
    }

    public void setMedicineForm(Integer medicineForm) {
        this.medicineForm = medicineForm;
    }

    @Basic
    @Column(name = "active_material", nullable = false, length = 40)
    public String getActiveMaterial() {
        return activeMaterial;
    }

    public void setActiveMaterial(String activeMaterial) {
        this.activeMaterial = activeMaterial;
    }

    @Basic
    @Column(name = "code", nullable = false, length = 3)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MedicineEntity that = (MedicineEntity) o;

        if (medicineId != null ? !medicineId.equals(that.medicineId) : that.medicineId != null) return false;
        if (medicineName != null ? !medicineName.equals(that.medicineName) : that.medicineName != null) return false;
        if (medicineCalibre != null ? !medicineCalibre.equals(that.medicineCalibre) : that.medicineCalibre != null)
            return false;
        if (medicineForm != null ? !medicineForm.equals(that.medicineForm) : that.medicineForm != null) return false;
        if (activeMaterial != null ? !activeMaterial.equals(that.activeMaterial) : that.activeMaterial != null)
            return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = medicineId != null ? medicineId.hashCode() : 0;
        result = 31 * result + (medicineName != null ? medicineName.hashCode() : 0);
        result = 31 * result + (medicineCalibre != null ? medicineCalibre.hashCode() : 0);
        result = 31 * result + (medicineForm != null ? medicineForm.hashCode() : 0);
        result = 31 * result + (activeMaterial != null ? activeMaterial.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "medicineByMedicineId")
    public Collection<PharmacyStockEntity> getPharmacyStocksByMedicineId() {
        return pharmacyStocksByMedicineId;
    }

    public void setPharmacyStocksByMedicineId(Collection<PharmacyStockEntity> pharmacyStocksByMedicineId) {
        this.pharmacyStocksByMedicineId = pharmacyStocksByMedicineId;
    }

    @OneToMany(mappedBy = "medicineByMedicineId")
    public Collection<PrescribedMedicationsEntity> getPrescribedMedicationsByMedicineId() {
        return prescribedMedicationsByMedicineId;
    }

    public void setPrescribedMedicationsByMedicineId(Collection<PrescribedMedicationsEntity> prescribedMedicationsByMedicineId) {
        this.prescribedMedicationsByMedicineId = prescribedMedicationsByMedicineId;
    }
}
