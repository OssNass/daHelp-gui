package org.sarc.dahelp.database.relief;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class CobonEntityPK implements Serializable {
    private Integer cobonId;
    private Integer cobontypeId;

    @Column(name = "cobon_id", nullable = false)
    @Id
    public Integer getCobonId() {
        return cobonId;
    }

    public void setCobonId(Integer cobonId) {
        this.cobonId = cobonId;
    }

    @Column(name = "cobontype_id", nullable = false)
    @Id
    public Integer getCobontypeId() {
        return cobontypeId;
    }

    public void setCobontypeId(Integer cobontypeId) {
        this.cobontypeId = cobontypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CobonEntityPK that = (CobonEntityPK) o;

        if (cobonId != null ? !cobonId.equals(that.cobonId) : that.cobonId != null) return false;
        if (cobontypeId != null ? !cobontypeId.equals(that.cobontypeId) : that.cobontypeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cobonId != null ? cobonId.hashCode() : 0;
        result = 31 * result + (cobontypeId != null ? cobontypeId.hashCode() : 0);
        return result;
    }
}
