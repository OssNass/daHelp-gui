package org.sarc.dahelp.database.clinic;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "pharmacy_stock", schema = "clinic", catalog = "dahelp")
@IdClass(PharmacyStockEntityPK.class)
public class PharmacyStockEntity {
    private Integer shipmentId;
    private Integer medicineId;
    private Date productionDate;
    private Date expirationDate;
    private Integer quantity;
    private Integer currentQuantity;
    private Collection<MedicineOutEntity> medicineOuts;
    private ShipmentEntity shipmentByShipmentId;
    private MedicineEntity medicineByMedicineId;

    @Id
    @Column(name = "shipment_id", nullable = false)
    public Integer getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(Integer shipmentId) {
        this.shipmentId = shipmentId;
    }

    @Id
    @Column(name = "medicine_id", nullable = false)
    public Integer getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Integer medicineId) {
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
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "current_quantity", nullable = false)
    public Integer getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(Integer currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PharmacyStockEntity that = (PharmacyStockEntity) o;

        if (shipmentId != null ? !shipmentId.equals(that.shipmentId) : that.shipmentId != null) return false;
        if (medicineId != null ? !medicineId.equals(that.medicineId) : that.medicineId != null) return false;
        if (productionDate != null ? !productionDate.equals(that.productionDate) : that.productionDate != null)
            return false;
        if (expirationDate != null ? !expirationDate.equals(that.expirationDate) : that.expirationDate != null)
            return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        if (currentQuantity != null ? !currentQuantity.equals(that.currentQuantity) : that.currentQuantity != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = shipmentId != null ? shipmentId.hashCode() : 0;
        result = 31 * result + (medicineId != null ? medicineId.hashCode() : 0);
        result = 31 * result + (productionDate != null ? productionDate.hashCode() : 0);
        result = 31 * result + (expirationDate != null ? expirationDate.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (currentQuantity != null ? currentQuantity.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "pharmacyStock")
    public Collection<MedicineOutEntity> getMedicineOuts() {
        return medicineOuts;
    }

    public void setMedicineOuts(Collection<MedicineOutEntity> medicineOuts) {
        this.medicineOuts = medicineOuts;
    }

    @ManyToOne
    @JoinColumn(name = "shipment_id", referencedColumnName = "shipment_id", nullable = false, insertable = false, updatable = false)
    public ShipmentEntity getShipmentByShipmentId() {
        return shipmentByShipmentId;
    }

    public void setShipmentByShipmentId(ShipmentEntity shipmentByShipmentId) {
        this.shipmentByShipmentId = shipmentByShipmentId;
    }

    @ManyToOne
    @JoinColumn(name = "medicine_id", referencedColumnName = "medicine_id", nullable = false, insertable = false, updatable = false)
    public MedicineEntity getMedicineByMedicineId() {
        return medicineByMedicineId;
    }

    public void setMedicineByMedicineId(MedicineEntity medicineByMedicineId) {
        this.medicineByMedicineId = medicineByMedicineId;
    }
}
