package org.sarc.dahelp.database.administration;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SubbranchEntityPK implements Serializable {
    private int id;
    private int organizationId;

    @Column(name = "id", nullable = false)
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "organization_id", nullable = false)
    @Id
    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubbranchEntityPK that = (SubbranchEntityPK) o;

        if (id != that.id) return false;
        if (organizationId != that.organizationId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + organizationId;
        return result;
    }
}
