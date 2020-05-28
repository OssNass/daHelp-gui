package org.sarc.dahelp.database.relief;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class CobonEntityPK implements Serializable {
    private int cobonId;
    private int cobontypeId;

    @Column(name = "cobon_id", nullable = false)
    @Id
    public int getCobonId() {
        return cobonId;
    }

    public void setCobonId(int cobonId) {
        this.cobonId = cobonId;
    }

    @Column(name = "cobontype_id", nullable = false)
    @Id
    public int getCobontypeId() {
        return cobontypeId;
    }

    public void setCobontypeId(int cobontypeId) {
        this.cobontypeId = cobontypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CobonEntityPK that = (CobonEntityPK) o;

        if (cobonId != that.cobonId) return false;
        if (cobontypeId != that.cobontypeId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cobonId;
        result = 31 * result + cobontypeId;
        return result;
    }
}
