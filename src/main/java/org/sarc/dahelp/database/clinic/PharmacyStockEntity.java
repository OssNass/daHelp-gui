package org.sarc.dahelp.database.clinic;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "pharmacy_stock", schema = "clinic", catalog = "dahelp")
@IdClass(PharmacyStockEntityPK.class)
public class PharmacyStockEntity {
    private int shipmentId;
    private int medicineId;
    private Date productionDate;
    private Date expirationDate;
    private int quantity;
    private int currentQuantity;

    @Id
    @Column(name = "shipment_id", nullable = false)
    public int getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(int shipmentId) {
        this.shipmentId = shipmentId;
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
    @Column(name = "production_date", nullable = false)
    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    @Basic
    @Column(name = "expiration_date", nullable = false)
    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Basic
    @Column(name = "quantity", nullable = false)
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "current_quantity", nullable = false)
    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PharmacyStockEntity that = (PharmacyStockEntity) o;

        if (shipmentId != that.shipmentId) return false;
        if (medicineId != that.medicineId) return false;
        if (quantity != that.quantity) return false;
        if (currentQuantity != that.currentQuantity) return false;
        if (productionDate != null ? !productionDate.equals(that.productionDate) : that.productionDate != null)
            return false;
        if (expirationDate != null ? !expirationDate.equals(that.expirationDate) : that.expirationDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = shipmentId;
        result = 31 * result + medicineId;
        result = 31 * result + (productionDate != null ? productionDate.hashCode() : 0);
        result = 31 * result + (expirationDate != null ? expirationDate.hashCode() : 0);
        result = 31 * result + quantity;
        result = 31 * result + currentQuantity;
        return result;
    }
}
