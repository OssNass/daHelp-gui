package org.sarc.dahelp.database.clinic;

import javax.persistence.*;

@Entity
@Table(name = "medicine", schema = "clinic", catalog = "dahelp")
public class MedicineEntity {
    private int medicineId;
    private String medicineName;
    private String medicineCalibre;
    private int medicineForm;
    private String activeMaterial;
    private String code;

    @Id
    @Column(name = "medicine_id", nullable = false)
    public int getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(int medicineId) {
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
    public int getMedicineForm() {
        return medicineForm;
    }

    public void setMedicineForm(int medicineForm) {
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

        if (medicineId != that.medicineId) return false;
        if (medicineForm != that.medicineForm) return false;
        if (medicineName != null ? !medicineName.equals(that.medicineName) : that.medicineName != null) return false;
        if (medicineCalibre != null ? !medicineCalibre.equals(that.medicineCalibre) : that.medicineCalibre != null)
            return false;
        if (activeMaterial != null ? !activeMaterial.equals(that.activeMaterial) : that.activeMaterial != null)
            return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = medicineId;
        result = 31 * result + (medicineName != null ? medicineName.hashCode() : 0);
        result = 31 * result + (medicineCalibre != null ? medicineCalibre.hashCode() : 0);
        result = 31 * result + medicineForm;
        result = 31 * result + (activeMaterial != null ? activeMaterial.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        return result;
    }
}
