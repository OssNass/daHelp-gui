package org.sarc.dahelp.database.clinic;

import javax.persistence.*;

@Entity
@Table(name = "medicine_out", schema = "clinic", catalog = "dahelp")
@IdClass(MedicineOutEntityPK.class)
public class MedicineOutEntity {
    private int medicineId;
    private int shipmentId;
    private Integer quantity;
    private int movementId;

    @Id
    @Column(name = "medicine_id", nullable = false)
    public int getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    @Id
    @Column(name = "shipment_id", nullable = false)
    public int getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(int shipmentId) {
        this.shipmentId = shipmentId;
    }

    @Basic
    @Column(name = "quantity", nullable = true)
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Id
    @Column(name = "movement_id", nullable = false)
    public int getMovementId() {
        return movementId;
    }

    public void setMovementId(int movementId) {
        this.movementId = movementId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MedicineOutEntity that = (MedicineOutEntity) o;

        if (medicineId != that.medicineId) return false;
        if (shipmentId != that.shipmentId) return false;
        if (movementId != that.movementId) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = medicineId;
        result = 31 * result + shipmentId;
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + movementId;
        return result;
    }
}
