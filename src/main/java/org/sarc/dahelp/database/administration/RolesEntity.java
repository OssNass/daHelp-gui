package org.sarc.dahelp.database.administration;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "roles", schema = "administration", catalog = "dahelp")
public class RolesEntity {
    private Integer id;
    private String name;
    private Collection<UserRolesEntity> userRolesById;

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

        RolesEntity that = (RolesEntity) o;

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

    @OneToMany(mappedBy = "rolesByRoleId")
    public Collection<UserRolesEntity> getUserRolesById() {
        return userRolesById;
    }

    public void setUserRolesById(Collection<UserRolesEntity> userRolesById) {
        this.userRolesById = userRolesById;
    }
}
