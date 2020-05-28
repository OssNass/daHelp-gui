package org.sarc.dahelp.database.basic;

import javax.persistence.*;

@Entity
@Table(name = "zone", schema = "basic", catalog = "dahelp")
@IdClass(ZoneEntityPK.class)
public class ZoneEntity {
    private int personId;
    private int cardNumber;
    private String zoneName;
    private String village;
    private int organizationId;
    private int subbranchId;

    @Id
    @Column(name = "person_id", nullable = false)
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    @Id
    @Column(name = "card_number", nullable = false)
    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Basic
    @Column(name = "zone_name", nullable = true, length = -1)
    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    @Basic
    @Column(name = "village", nullable = true, length = -1)
    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    @Id
    @Column(name = "organization_id", nullable = false)
    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    @Id
    @Column(name = "subbranch_id", nullable = false)
    public int getSubbranchId() {
        return subbranchId;
    }

    public void setSubbranchId(int subbranchId) {
        this.subbranchId = subbranchId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZoneEntity that = (ZoneEntity) o;

        if (personId != that.personId) return false;
        if (cardNumber != that.cardNumber) return false;
        if (organizationId != that.organizationId) return false;
        if (subbranchId != that.subbranchId) return false;
        if (zoneName != null ? !zoneName.equals(that.zoneName) : that.zoneName != null) return false;
        if (village != null ? !village.equals(that.village) : that.village != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personId;
        result = 31 * result + cardNumber;
        result = 31 * result + (zoneName != null ? zoneName.hashCode() : 0);
        result = 31 * result + (village != null ? village.hashCode() : 0);
        result = 31 * result + organizationId;
        result = 31 * result + subbranchId;
        return result;
    }
}
