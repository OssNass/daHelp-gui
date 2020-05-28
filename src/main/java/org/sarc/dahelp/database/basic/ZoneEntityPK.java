package org.sarc.dahelp.database.basic;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ZoneEntityPK implements Serializable {
    private int personId;
    private int cardNumber;
    private int organizationId;
    private int subbranchId;

    @Column(name = "person_id", nullable = false)
    @Id
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    @Column(name = "card_number", nullable = false)
    @Id
    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Column(name = "organization_id", nullable = false)
    @Id
    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    @Column(name = "subbranch_id", nullable = false)
    @Id
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

        ZoneEntityPK that = (ZoneEntityPK) o;

        if (personId != that.personId) return false;
        if (cardNumber != that.cardNumber) return false;
        if (organizationId != that.organizationId) return false;
        if (subbranchId != that.subbranchId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personId;
        result = 31 * result + cardNumber;
        result = 31 * result + organizationId;
        result = 31 * result + subbranchId;
        return result;
    }
}
