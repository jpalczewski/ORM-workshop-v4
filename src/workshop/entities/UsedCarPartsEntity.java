package workshop.entities;

import javax.persistence.*;

/**
 * Created by erxyi on 06.01.16.
 */
@Entity
@Table(name = "USED_CAR_PARTS", schema = "JPALCZEW", catalog = "")
@IdClass(UsedCarPartsEntityPK.class)
public class UsedCarPartsEntity {
    private Byte repairId;
    private Byte carPartId;
    private Byte quantityPieces;

    @Id
    @Column(name = "REPAIR_ID", nullable = false, precision = 0)
    public Byte getRepairId() {
        return repairId;
    }

    public void setRepairId(Byte repairId) {
        this.repairId = repairId;
    }

    @Id
    @Column(name = "CAR_PART_ID", nullable = false, precision = 0)
    public Byte getCarPartId() {
        return carPartId;
    }

    public void setCarPartId(Byte carPartId) {
        this.carPartId = carPartId;
    }

    @Basic
    @Column(name = "QUANTITY_PIECES", nullable = false, precision = 0)
    public Byte getQuantityPieces() {
        return quantityPieces;
    }

    public void setQuantityPieces(Byte quantityPieces) {
        this.quantityPieces = quantityPieces;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsedCarPartsEntity that = (UsedCarPartsEntity) o;

        if (repairId != null ? !repairId.equals(that.repairId) : that.repairId != null) return false;
        if (carPartId != null ? !carPartId.equals(that.carPartId) : that.carPartId != null) return false;
        if (quantityPieces != null ? !quantityPieces.equals(that.quantityPieces) : that.quantityPieces != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = repairId != null ? repairId.hashCode() : 0;
        result = 31 * result + (carPartId != null ? carPartId.hashCode() : 0);
        result = 31 * result + (quantityPieces != null ? quantityPieces.hashCode() : 0);
        return result;
    }
}
