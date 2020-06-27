package org.sarc.dahelp.database.relief;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class MaterialInCobonEntityPK implements Serializable {
    private Integer materialId;
    private Integer internantionalOrganizationId;
    private Integer cobonId;
    private Integer cobonTypeId;

    @Column(name = "material_id", nullable = false)
    @Id
    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    @Column(name = "internantional_organization_id", nullable = false)
    @Id
    public Integer getInternantionalOrganizationId() {
        return internantionalOrganizationId;
    }

    public void setInternantionalOrganizationId(Integer internantionalOrganizationId) {
        this.internantionalOrganizationId = internantionalOrganizationId;
    }

    @Column(name = "cobon_id", nullable = false)
    @Id
    public Integer getCobonId() {
        return cobonId;
    }

    public void setCobonId(Integer cobonId) {
        this.cobonId = cobonId;
    }

    @Column(name = "cobon_type_id", nullable = false)
    @Id
    public Integer getCobonTypeId() {
        return cobonTypeId;
    }

    public void setCobonTypeId(Integer cobonTypeId) {
        this.cobonTypeId = cobonTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaterialInCobonEntityPK that = (MaterialInCobonEntityPK) o;

        if (materialId != null ? !materialId.equals(that.materialId) : that.materialId != null) return false;
        if (internantionalOrganizationId != null ? !internantionalOrganizationId.equals(that.internantionalOrganizationId) : that.internantionalOrganizationId != null)
            return false;
        if (cobonId != null ? !cobonId.equals(that.cobonId) : that.cobonId != null) return false;
        if (cobonTypeId != null ? !cobonTypeId.equals(that.cobonTypeId) : that.cobonTypeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = materialId != null ? materialId.hashCode() : 0;
        result = 31 * result + (internantionalOrganizationId != null ? internantionalOrganizationId.hashCode() : 0);
        result = 31 * result + (cobonId != null ? cobonId.hashCode() : 0);
        result = 31 * result + (cobonTypeId != null ? cobonTypeId.hashCode() : 0);
        return result;
    }
}
