package org.sarc.dahelp.database.clinic;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "shipment", schema = "clinic", catalog = "dahelp")
public class ShipmentEntity {
    private int shipmentId;
    private Date shipmentDate;
    private Integer shipmentSourceId;

    @Id
    @Column(name = "shipment_id", nullable = false)
    public int getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(int shipmentId) {
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

        if (shipmentId != that.shipmentId) return false;
        if (shipmentDate != null ? !shipmentDate.equals(that.shipmentDate) : that.shipmentDate != null) return false;
        if (shipmentSourceId != null ? !shipmentSourceId.equals(that.shipmentSourceId) : that.shipmentSourceId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = shipmentId;
        result = 31 * result + (shipmentDate != null ? shipmentDate.hashCode() : 0);
        result = 31 * result + (shipmentSourceId != null ? shipmentSourceId.hashCode() : 0);
        return result;
    }
}
