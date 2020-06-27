package org.sarc.dahelp.database.clinic;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class MedicineOutEntityPK implements Serializable {
    private Integer medicineId;
    private Integer shipmentId;
    private Integer movementId;

    @Column(name = "medicine_id", nullable = false)
    @Id
    public Integer getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Integer medicineId) {
        this.medicineId = medicineId;
    }

    @Column(name = "shipment_id", nullable = false)
    @Id
    public Integer getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(Integer shipmentId) {
        this.shipmentId = shipmentId;
    }

    @Column(name = "movement_id", nullable = false)
    @Id
    public Integer getMovementId() {
        return movementId;
    }

    public void setMovementId(Integer movementId) {
        this.movementId = movementId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MedicineOutEntityPK that = (MedicineOutEntityPK) o;

        if (medicineId != null ? !medicineId.equals(that.medicineId) : that.medicineId != null) return false;
        if (shipmentId != null ? !shipmentId.equals(that.shipmentId) : that.shipmentId != null) return false;
        if (movementId != null ? !movementId.equals(that.movementId) : that.movementId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = medicineId != null ? medicineId.hashCode() : 0;
        result = 31 * result + (shipmentId != null ? shipmentId.hashCode() : 0);
        result = 31 * result + (movementId != null ? movementId.hashCode() : 0);
        return result;
    }
}
