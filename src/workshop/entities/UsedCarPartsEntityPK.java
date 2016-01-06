package workshop.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by erxyi on 06.01.16.
 */
public class UsedCarPartsEntityPK implements Serializable {
    private Byte repairId;
    private Byte carPartId;

    @Column(name = "REPAIR_ID", nullable = false, precision = 0)
    @Id
    public Byte getRepairId() {
        return repairId;
    }

    public void setRepairId(Byte repairId) {
        this.repairId = repairId;
    }

    @Column(name = "CAR_PART_ID", nullable = false, precision = 0)
    @Id
    public Byte getCarPartId() {
        return carPartId;
    }

    public void setCarPartId(Byte carPartId) {
        this.carPartId = carPartId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsedCarPartsEntityPK that = (UsedCarPartsEntityPK) o;

        if (repairId != null ? !repairId.equals(that.repairId) : that.repairId != null) return false;
        if (carPartId != null ? !carPartId.equals(that.carPartId) : that.carPartId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = repairId != null ? repairId.hashCode() : 0;
        result = 31 * result + (carPartId != null ? carPartId.hashCode() : 0);
        return result;
    }
}
