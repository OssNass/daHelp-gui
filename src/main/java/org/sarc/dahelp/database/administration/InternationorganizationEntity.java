package org.sarc.dahelp.database.administration;

import org.sarc.dahelp.database.relief.MaterialsEntity;
import org.sarc.dahelp.database.clinic.ShipmentEntity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "internationorganization", schema = "administration", catalog = "dahelp")
public class InternationorganizationEntity {
    private Integer id;
    private String name;
    private Collection<ShipmentEntity> shipmentsById;
    private Collection<MaterialsEntity> materialsById;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InternationorganizationEntity that = (InternationorganizationEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "internationorganizationByShipmentSourceId")
    public Collection<ShipmentEntity> getShipmentsById() {
        return shipmentsById;
    }

    public void setShipmentsById(Collection<ShipmentEntity> shipmentsById) {
        this.shipmentsById = shipmentsById;
    }

    @OneToMany(mappedBy = "internationorganizationByInternationOrganizationId")
    public Collection<MaterialsEntity> getMaterialsById() {
        return materialsById;
    }

    public void setMaterialsById(Collection<MaterialsEntity> materialsById) {
        this.materialsById = materialsById;
    }
}
