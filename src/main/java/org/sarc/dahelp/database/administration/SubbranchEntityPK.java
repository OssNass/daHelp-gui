package org.sarc.dahelp.database.administration;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SubbranchEntityPK implements Serializable {
    private Integer id;
    private Integer organizationId;

    @Column(name = "id", nullable = false)
    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "organization_id", nullable = false)
    @Id
    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubbranchEntityPK that = (SubbranchEntityPK) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (organizationId != null ? !organizationId.equals(that.organizationId) : that.organizationId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (organizationId != null ? organizationId.hashCode() : 0);
        return result;
    }
}
