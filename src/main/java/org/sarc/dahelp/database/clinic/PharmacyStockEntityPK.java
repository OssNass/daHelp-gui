package org.sarc.dahelp.database.clinic;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class PharmacyStockEntityPK implements Serializable {
    private Integer shipmentId;
    private Integer medicineId;

    @Column(name = "shipment_id", nullable = false)
    @Id
    public Integer getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(Integer shipmentId) {
        this.shipmentId = shipmentId;
    }

    @Column(name = "medicine_id", nullable = false)
    @Id
    public Integer getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Integer medicineId) {
        this.medicineId = medicineId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PharmacyStockEntityPK that = (PharmacyStockEntityPK) o;

        if (shipmentId != null ? !shipmentId.equals(that.shipmentId) : that.shipmentId != null) return false;
        if (medicineId != null ? !medicineId.equals(that.medicineId) : that.medicineId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = shipmentId != null ? shipmentId.hashCode() : 0;
        result = 31 * result + (medicineId != null ? medicineId.hashCode() : 0);
        return result;
    }
}
