package org.sarc.dahelp.database.relief;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class MaterialInCobonEntityPK implements Serializable {
    private int materialId;
    private int internantionalOrganizationId;
    private int cobonId;
    private int cobonTypeId;

    @Column(name = "material_id", nullable = false)
    @Id
    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    @Column(name = "internantional_organization_id", nullable = false)
    @Id
    public int getInternantionalOrganizationId() {
        return internantionalOrganizationId;
    }

    public void setInternantionalOrganizationId(int internantionalOrganizationId) {
        this.internantionalOrganizationId = internantionalOrganizationId;
    }

    @Column(name = "cobon_id", nullable = false)
    @Id
    public int getCobonId() {
        return cobonId;
    }

    public void setCobonId(int cobonId) {
        this.cobonId = cobonId;
    }

    @Column(name = "cobon_type_id", nullable = false)
    @Id
    public int getCobonTypeId() {
        return cobonTypeId;
    }

    public void setCobonTypeId(int cobonTypeId) {
        this.cobonTypeId = cobonTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaterialInCobonEntityPK that = (MaterialInCobonEntityPK) o;

        if (materialId != that.materialId) return false;
        if (internantionalOrganizationId != that.internantionalOrganizationId) return false;
        if (cobonId != that.cobonId) return false;
        if (cobonTypeId != that.cobonTypeId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = materialId;
        result = 31 * result + internantionalOrganizationId;
        result = 31 * result + cobonId;
        result = 31 * result + cobonTypeId;
        return result;
    }
}
