package org.sarc.dahelp.database.clinic;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class MedicineOutEntityPK implements Serializable {
    private int medicineId;
    private int shipmentId;
    private int movementId;

    @Column(name = "medicine_id", nullable = false)
    @Id
    public int getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    @Column(name = "shipment_id", nullable = false)
    @Id
    public int getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(int shipmentId) {
        this.shipmentId = shipmentId;
    }

    @Column(name = "movement_id", nullable = false)
    @Id
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

        MedicineOutEntityPK that = (MedicineOutEntityPK) o;

        if (medicineId != that.medicineId) return false;
        if (shipmentId != that.shipmentId) return false;
        if (movementId != that.movementId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = medicineId;
        result = 31 * result + shipmentId;
        result = 31 * result + movementId;
        return result;
    }
}
