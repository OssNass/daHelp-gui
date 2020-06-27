package org.sarc.dahelp.database.clinic;

import org.sarc.dahelp.database.administration.InternationorganizationEntity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "shipment", schema = "clinic", catalog = "dahelp")
public class ShipmentEntity {
    private Integer shipmentId;
    private Date shipmentDate;
    private Integer shipmentSourceId;
    private Collection<PharmacyStockEntity> pharmacyStocksByShipmentId;
    private InternationorganizationEntity internationorganizationByShipmentSourceId;

    @Id
    @Column(name = "shipment_id", nullable = false)
    public Integer getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(Integer shipmentId) {
        this.shipmentId = shipmentId;
    }

    @Basic
    @Column(name = "shipment_date", nullable = false)
    public Date getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(Date shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    @Basic
    @Column(name = "shipment_source_id", nullable = true)
    public Integer getShipmentSourceId() {
        return shipmentSourceId;
    }

    public void setShipmentSourceId(Integer shipmentSourceId) {
        this.shipmentSourceId = shipmentSourceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShipmentEntity that = (ShipmentEntity) o;

        if (shipmentId != null ? !shipmentId.equals(that.shipmentId) : that.shipmentId != null) return false;
        if (shipmentDate != null ? !shipmentDate.equals(that.shipmentDate) : that.shipmentDate != null) return false;
        if (shipmentSourceId != null ? !shipmentSourceId.equals(that.shipmentSourceId) : that.shipmentSourceId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = shipmentId != null ? shipmentId.hashCode() : 0;
        result = 31 * result + (shipmentDate != null ? shipmentDate.hashCode() : 0);
        result = 31 * result + (shipmentSourceId != null ? shipmentSourceId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "shipmentByShipmentId")
    public Collection<PharmacyStockEntity> getPharmacyStocksByShipmentId() {
        return pharmacyStocksByShipmentId;
    }

    public void setPharmacyStocksByShipmentId(Collection<PharmacyStockEntity> pharmacyStocksByShipmentId) {
        this.pharmacyStocksByShipmentId = pharmacyStocksByShipmentId;
    }

    @ManyToOne
    @JoinColumn(name = "shipment_source_id", referencedColumnName = "id", insertable = false, updatable = false)
    public InternationorganizationEntity getInternationorganizationByShipmentSourceId() {
        return internationorganizationByShipmentSourceId;
    }

    public void setInternationorganizationByShipmentSourceId(InternationorganizationEntity internationorganizationByShipmentSourceId) {
        this.internationorganizationByShipmentSourceId = internationorganizationByShipmentSourceId;
    }
}
