package org.sarc.dahelp.database.administration;

import org.sarc.dahelp.database.basic.DisplacementEntity;
import org.sarc.dahelp.database.basic.PersonEntity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "region", schema = "administration", catalog = "dahelp")
public class RegionEntity {
    private Integer id;
    private String name;
    private Integer parentId;
    private Integer level;
    private RegionEntity regionByParentId;
    private Collection<RegionEntity> regionsById;
    private Collection<DisplacementEntity> displacementsById;
    private Collection<PersonEntity> peopleById;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "parent_id", nullable = true)
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "level", nullable = true)
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RegionEntity that = (RegionEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (level != null ? !level.equals(that.level) : that.level != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "parent_id", referencedColumnName = "id", insertable = false, updatable = false)
    public RegionEntity getRegionByParentId() {
        return regionByParentId;
    }

    public void setRegionByParentId(RegionEntity regionByParentId) {
        this.regionByParentId = regionByParentId;
    }

    @OneToMany(mappedBy = "regionByParentId")
    public Collection<RegionEntity> getRegionsById() {
        return regionsById;
    }

    public void setRegionsById(Collection<RegionEntity> regionsById) {
        this.regionsById = regionsById;
    }

    @OneToMany(mappedBy = "regionByRegionId")
    public Collection<DisplacementEntity> getDisplacementsById() {
        return displacementsById;
    }

    public void setDisplacementsById(Collection<DisplacementEntity> displacementsById) {
        this.displacementsById = displacementsById;
    }

    @OneToMany(mappedBy = "regionByNeighborhood")
    public Collection<PersonEntity> getPeopleById() {
        return peopleById;
    }

    public void setPeopleById(Collection<PersonEntity> peopleById) {
        this.peopleById = peopleById;
    }
}
