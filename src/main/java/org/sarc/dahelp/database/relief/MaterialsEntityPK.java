package org.sarc.dahelp.database.relief;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class MaterialsEntityPK implements Serializable {
    private Integer materialsId;
    private Integer internationOrganizationId;

    @Column(name = "materials_id", nullable = false)
    @Id
    public Integer getMaterialsId() {
        return materialsId;
    }

    public void setMaterialsId(Integer materialsId) {
        this.materialsId = materialsId;
    }

    @Column(name = "internation_organization_id", nullable = false)
    @Id
    public Integer getInternationOrganizationId() {
        return internationOrganizationId;
    }

    public void setInternationOrganizationId(Integer internationOrganizationId) {
        this.internationOrganizationId = internationOrganizationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaterialsEntityPK that = (MaterialsEntityPK) o;

        if (materialsId != null ? !materialsId.equals(that.materialsId) : that.materialsId != null) return false;
        if (internationOrganizationId != null ? !internationOrganizationId.equals(that.internationOrganizationId) : that.internationOrganizationId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = materialsId != null ? materialsId.hashCode() : 0;
        result = 31 * result + (internationOrganizationId != null ? internationOrganizationId.hashCode() : 0);
        return result;
    }
}
