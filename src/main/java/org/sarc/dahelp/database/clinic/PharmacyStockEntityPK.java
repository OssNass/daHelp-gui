package org.sarc.dahelp.database.clinic;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class PharmacyStockEntityPK implements Serializable {
    private int shipmentId;
    private int medicineId;

    @Column(name = "shipment_id", nullable = false)
    @Id
    public int getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(int shipmentId) {
        this.shipmentId = shipmentId;
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

        PharmacyStockEntityPK that = (PharmacyStockEntityPK) o;

        if (shipmentId != that.shipmentId) return false;
        if (medicineId != that.medicineId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = shipmentId;
        result = 31 * result + medicineId;
        return result;
    }
}
