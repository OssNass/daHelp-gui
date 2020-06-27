package org.sarc.dahelp.database.basic;

import javax.persistence.*;

@Entity
@Table(name = "zone", schema = "basic", catalog = "dahelp")
@IdClass(ZoneEntityPK.class)
public class ZoneEntity {
    private Integer personId;
    private Integer cardNumber;
    private String zoneName;
    private String village;
    private Integer organizationId;
    private Integer subbranchId;
    private PersonEntity person;

    @Id
    @Column(name = "person_id", nullable = false)
    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    @Id
    @Column(name = "card_number", nullable = false)
    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
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
    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    @Id
    @Column(name = "subbranch_id", nullable = false)
    public Integer getSubbranchId() {
        return subbranchId;
    }

    public void setSubbranchId(Integer subbranchId) {
        this.subbranchId = subbranchId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZoneEntity that = (ZoneEntity) o;

        if (personId != null ? !personId.equals(that.personId) : that.personId != null) return false;
        if (cardNumber != null ? !cardNumber.equals(that.cardNumber) : that.cardNumber != null) return false;
        if (zoneName != null ? !zoneName.equals(that.zoneName) : that.zoneName != null) return false;
        if (village != null ? !village.equals(that.village) : that.village != null) return false;
        if (organizationId != null ? !organizationId.equals(that.organizationId) : that.organizationId != null)
            return false;
        if (subbranchId != null ? !subbranchId.equals(that.subbranchId) : that.subbranchId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personId != null ? personId.hashCode() : 0;
        result = 31 * result + (cardNumber != null ? cardNumber.hashCode() : 0);
        result = 31 * result + (zoneName != null ? zoneName.hashCode() : 0);
        result = 31 * result + (village != null ? village.hashCode() : 0);
        result = 31 * result + (organizationId != null ? organizationId.hashCode() : 0);
        result = 31 * result + (subbranchId != null ? subbranchId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "person_id", referencedColumnName = "person_id", nullable = false, insertable = false, updatable = false),
            @JoinColumn(name = "organization_id", referencedColumnName = "organization_id", nullable = false, insertable = false, updatable = false)
            , @JoinColumn(name = "subbranch_id", referencedColumnName = "subbranch_id", nullable = false, insertable = false, updatable = false)})
    public PersonEntity getPerson() {
        return person;
    }

    public void setPerson(PersonEntity person) {
        this.person = person;
    }
}
