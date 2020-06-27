package org.sarc.dahelp.database.clinic;

import javax.persistence.*;

@Entity
@Table(name = "medicine_out", schema = "clinic", catalog = "dahelp")
@IdClass(MedicineOutEntityPK.class)
public class MedicineOutEntity {
    private Integer medicineId;
    private Integer shipmentId;
    private Integer quantity;
    private Integer movementId;
    private PharmacyStockEntity pharmacyStock;
    private PharmacyMovementOutEntity pharmacyMovementOutByMovementId;

    @Id
    @Column(name = "medicine_id", nullable = false)
    public Integer getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Integer medicineId) {
        this.medicineId = medicineId;
    }

    @Id
    @Column(name = "shipment_id", nullable = false)
    public Integer getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(Integer shipmentId) {
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

        MedicineOutEntity that = (MedicineOutEntity) o;

        if (medicineId != null ? !medicineId.equals(that.medicineId) : that.medicineId != null) return false;
        if (shipmentId != null ? !shipmentId.equals(that.shipmentId) : that.shipmentId != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        if (movementId != null ? !movementId.equals(that.movementId) : that.movementId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = medicineId != null ? medicineId.hashCode() : 0;
        result = 31 * result + (shipmentId != null ? shipmentId.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (movementId != null ? movementId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "medicine_id", referencedColumnName = "medicine_id", nullable = false, insertable = false, updatable = false),
            @JoinColumn(name = "shipment_id", referencedColumnName = "shipment_id", nullable = false, insertable = false, updatable = false)})
    public PharmacyStockEntity getPharmacyStock() {
        return pharmacyStock;
    }

    public void setPharmacyStock(PharmacyStockEntity pharmacyStock) {
        this.pharmacyStock = pharmacyStock;
    }

    @ManyToOne
    @JoinColumn(name = "movement_id", referencedColumnName = "movement_id", nullable = false, insertable = false, updatable = false)
    public PharmacyMovementOutEntity getPharmacyMovementOutByMovementId() {
        return pharmacyMovementOutByMovementId;
    }

    public void setPharmacyMovementOutByMovementId(PharmacyMovementOutEntity pharmacyMovementOutByMovementId) {
        this.pharmacyMovementOutByMovementId = pharmacyMovementOutByMovementId;
    }
}
