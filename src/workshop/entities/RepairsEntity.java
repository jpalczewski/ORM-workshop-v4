package workshop.entities;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by erxyi on 06.01.16.
 */
@Entity
@Table(name = "REPAIRS", schema = "JPALCZEW", catalog = "")
public class RepairsEntity {
    private Byte repairId;
    private Byte carId;
    private Time repairDate;

    @Id
    @Column(name = "REPAIR_ID", nullable = false, precision = 0)
    public Byte getRepairId() {
        return repairId;
    }

    public void setRepairId(Byte repairId) {
        this.repairId = repairId;
    }

    @Basic
    @Column(name = "CAR_ID", nullable = true, precision = 0)
    public Byte getCarId() {
        return carId;
    }

    public void setCarId(Byte carId) {
        this.carId = carId;
    }

    @Basic
    @Column(name = "REPAIR_DATE", nullable = true)
    public Time getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(Time repairDate) {
        this.repairDate = repairDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RepairsEntity that = (RepairsEntity) o;

        if (repairId != null ? !repairId.equals(that.repairId) : that.repairId != null) return false;
        if (carId != null ? !carId.equals(that.carId) : that.carId != null) return false;
        if (repairDate != null ? !repairDate.equals(that.repairDate) : that.repairDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = repairId != null ? repairId.hashCode() : 0;
        result = 31 * result + (carId != null ? carId.hashCode() : 0);
        result = 31 * result + (repairDate != null ? repairDate.hashCode() : 0);
        return result;
    }
}
