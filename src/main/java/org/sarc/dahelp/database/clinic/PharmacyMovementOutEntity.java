package org.sarc.dahelp.database.clinic;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "pharmacy_movement_out", schema = "clinic", catalog = "dahelp")
public class PharmacyMovementOutEntity {
    private Integer movementId;
    private Integer movemnetType;
    private Date movementDate;
    private String notes;
    private Integer prescritionId;
    private Collection<MedicineOutEntity> medicineOutsByMovementId;
    private PrescriptionEntity prescriptionByPrescritionId;

    @Id
    @Column(name = "movement_id", nullable = false)
    public Integer getMovementId() {
        return movementId;
    }

    public void setMovementId(Integer movementId) {
        this.movementId = movementId;
    }

    @Basic
    @Column(name = "movemnet_type", nullable = false)
    public Integer getMovemnetType() {
        return movemnetType;
    }

    public void setMovemnetType(Integer movemnetType) {
        this.movemnetType = movemnetType;
    }

    @Basic
    @Column(name = "movement_date", nullable = true)
    public Date getMovementDate() {
        return movementDate;
    }

    public void setMovementDate(Date movementDate) {
        this.movementDate = movementDate;
    }

    @Basic
    @Column(name = "notes", nullable = true, length = 100)
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Basic
    @Column(name = "prescrition_id", nullable = true)
    public Integer getPrescritionId() {
        return prescritionId;
    }

    public void setPrescritionId(Integer prescritionId) {
        this.prescritionId = prescritionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PharmacyMovementOutEntity that = (PharmacyMovementOutEntity) o;

        if (movementId != null ? !movementId.equals(that.movementId) : that.movementId != null) return false;
        if (movemnetType != null ? !movemnetType.equals(that.movemnetType) : that.movemnetType != null) return false;
        if (movementDate != null ? !movementDate.equals(that.movementDate) : that.movementDate != null) return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;
        if (prescritionId != null ? !prescritionId.equals(that.prescritionId) : that.prescritionId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = movementId != null ? movementId.hashCode() : 0;
        result = 31 * result + (movemnetType != null ? movemnetType.hashCode() : 0);
        result = 31 * result + (movementDate != null ? movementDate.hashCode() : 0);
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + (prescritionId != null ? prescritionId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "pharmacyMovementOutByMovementId")
    public Collection<MedicineOutEntity> getMedicineOutsByMovementId() {
        return medicineOutsByMovementId;
    }

    public void setMedicineOutsByMovementId(Collection<MedicineOutEntity> medicineOutsByMovementId) {
        this.medicineOutsByMovementId = medicineOutsByMovementId;
    }

    @ManyToOne
    @JoinColumn(name = "prescrition_id", referencedColumnName = "prescription_id", insertable = false, updatable = false)
    public PrescriptionEntity getPrescriptionByPrescritionId() {
        return prescriptionByPrescritionId;
    }

    public void setPrescriptionByPrescritionId(PrescriptionEntity prescriptionByPrescritionId) {
        this.prescriptionByPrescritionId = prescriptionByPrescritionId;
    }
}
