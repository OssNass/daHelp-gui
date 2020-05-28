package org.sarc.dahelp.database.relief;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "cobon", schema = "relief", catalog = "dahelp")
@IdClass(CobonEntityPK.class)
public class CobonEntity {
    private int familyId;
    private int personId;
    private int subbranchId;
    private int organizationId;
    private int numberOfItems;
    private int cobonId;
    private int cobontypeId;
    private Timestamp cobonIssueStamp;
    private Timestamp cobonRecieveStamp;

    @Basic
    @Column(name = "family_id", nullable = false)
    public int getFamilyId() {
        return familyId;
    }

    public void setFamilyId(int familyId) {
        this.familyId = familyId;
    }

    @Basic
    @Column(name = "person_id", nullable = false)
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    @Basic
    @Column(name = "subbranch_id", nullable = false)
    public int getSubbranchId() {
        return subbranchId;
    }

    public void setSubbranchId(int subbranchId) {
        this.subbranchId = subbranchId;
    }

    @Basic
    @Column(name = "organization_id", nullable = false)
    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    @Basic
    @Column(name = "number_of_items", nullable = false)
    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    @Id
    @Column(name = "cobon_id", nullable = false)
    public int getCobonId() {
        return cobonId;
    }

    public void setCobonId(int cobonId) {
        this.cobonId = cobonId;
    }

    @Id
    @Column(name = "cobontype_id", nullable = false)
    public int getCobontypeId() {
        return cobontypeId;
    }

    public void setCobontypeId(int cobontypeId) {
        this.cobontypeId = cobontypeId;
    }

    @Basic
    @Column(name = "cobon_issue_stamp", nullable = false)
    public Timestamp getCobonIssueStamp() {
        return cobonIssueStamp;
    }

    public void setCobonIssueStamp(Timestamp cobonIssueStamp) {
        this.cobonIssueStamp = cobonIssueStamp;
    }

    @Basic
    @Column(name = "cobon_recieve_stamp", nullable = true)
    public Timestamp getCobonRecieveStamp() {
        return cobonRecieveStamp;
    }

    public void setCobonRecieveStamp(Timestamp cobonRecieveStamp) {
        this.cobonRecieveStamp = cobonRecieveStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CobonEntity that = (CobonEntity) o;

        if (familyId != that.familyId) return false;
        if (personId != that.personId) return false;
        if (subbranchId != that.subbranchId) return false;
        if (organizationId != that.organizationId) return false;
        if (numberOfItems != that.numberOfItems) return false;
        if (cobonId != that.cobonId) return false;
        if (cobontypeId != that.cobontypeId) return false;
        if (cobonIssueStamp != null ? !cobonIssueStamp.equals(that.cobonIssueStamp) : that.cobonIssueStamp != null)
            return false;
        if (cobonRecieveStamp != null ? !cobonRecieveStamp.equals(that.cobonRecieveStamp) : that.cobonRecieveStamp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = familyId;
        result = 31 * result + personId;
        result = 31 * result + subbranchId;
        result = 31 * result + organizationId;
        result = 31 * result + numberOfItems;
        result = 31 * result + cobonId;
        result = 31 * result + cobontypeId;
        result = 31 * result + (cobonIssueStamp != null ? cobonIssueStamp.hashCode() : 0);
        result = 31 * result + (cobonRecieveStamp != null ? cobonRecieveStamp.hashCode() : 0);
        return result;
    }
}
