package org.sarc.dahelp.database.administration;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "users", schema = "administration", catalog = "dahelp")
public class UsersEntity {
    private Integer id;
    private String username;
    private Integer organizationId;
    private Integer subbranchId;
    private String secret;
    private Collection<UserRolesEntity> userRolesById;
    private SubbranchEntity subbranch;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 100)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "organization_id", nullable = true)
    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    @Basic
    @Column(name = "subbranch_id", nullable = true)
    public Integer getSubbranchId() {
        return subbranchId;
    }

    public void setSubbranchId(Integer subbranchId) {
        this.subbranchId = subbranchId;
    }

    @Basic
    @Column(name = "secret", nullable = false, length = 255)
    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (organizationId != null ? !organizationId.equals(that.organizationId) : that.organizationId != null)
            return false;
        if (subbranchId != null ? !subbranchId.equals(that.subbranchId) : that.subbranchId != null) return false;
        if (secret != null ? !secret.equals(that.secret) : that.secret != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (organizationId != null ? organizationId.hashCode() : 0);
        result = 31 * result + (subbranchId != null ? subbranchId.hashCode() : 0);
        result = 31 * result + (secret != null ? secret.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "usersByUserId")
    public Collection<UserRolesEntity> getUserRolesById() {
        return userRolesById;
    }

    public void setUserRolesById(Collection<UserRolesEntity> userRolesById) {
        this.userRolesById = userRolesById;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "organization_id", referencedColumnName = "organization_id", insertable = false, updatable = false),
            @JoinColumn(name = "subbranch_id", referencedColumnName = "id", insertable = false, updatable = false)})
    public SubbranchEntity getSubbranch() {
        return subbranch;
    }

    public void setSubbranch(SubbranchEntity subbranch) {
        this.subbranch = subbranch;
    }
}
