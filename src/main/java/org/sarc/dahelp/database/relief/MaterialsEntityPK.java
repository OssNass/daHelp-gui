package org.sarc.dahelp.database.relief;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class MaterialsEntityPK implements Serializable {
    private int materialsId;
    private int internationOrganizationId;

    @Column(name = "materials_id", nullable = false)
    @Id
    public int getMaterialsId() {
        return materialsId;
    }

    public void setMaterialsId(int materialsId) {
        this.materialsId = materialsId;
    }

    @Column(name = "internation_organization_id", nullable = false)
    @Id
    public int getInternationOrganizationId() {
        return internationOrganizationId;
    }

    public void setInternationOrganizationId(int internationOrganizationId) {
        this.internationOrganizationId = internationOrganizationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaterialsEntityPK that = (MaterialsEntityPK) o;

        if (materialsId != that.materialsId) return false;
        if (internationOrganizationId != that.internationOrganizationId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = materialsId;
        result = 31 * result + internationOrganizationId;
        return result;
    }
}
