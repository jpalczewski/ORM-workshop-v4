package workshop.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;

/**
 * Created by erxyi on 06.01.16.
 */
@Entity
@Table(name = "CARS", schema = "JPALCZEW", catalog = "")
public class CarsEntity {
    private Byte carId;
    private Byte ownerId;
    private Byte motorId;
    private Serializable brand;
    private Serializable model;
    private Time productionYear;

    @Id
    @Column(name = "CAR_ID", nullable = false, precision = 0)
    public Byte getCarId() {
        return carId;
    }

    public void setCarId(Byte carId) {
        this.carId = carId;
    }

    @Basic
    @Column(name = "OWNER_ID", nullable = false, precision = 0)
    public Byte getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Byte ownerId) {
        this.ownerId = ownerId;
    }

    @Basic
    @Column(name = "MOTOR_ID", nullable = false, precision = 0)
    public Byte getMotorId() {
        return motorId;
    }

    public void setMotorId(Byte motorId) {
        this.motorId = motorId;
    }

    @Basic
    @Column(name = "BRAND", nullable = true, length = 20)
    public Serializable getBrand() {
        return brand;
    }

    public void setBrand(Serializable brand) {
        this.brand = brand;
    }

    @Basic
    @Column(name = "MODEL", nullable = true, length = 20)
    public Serializable getModel() {
        return model;
    }

    public void setModel(Serializable model) {
        this.model = model;
    }

    @Basic
    @Column(name = "PRODUCTION_YEAR", nullable = true)
    public Time getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Time productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarsEntity that = (CarsEntity) o;

        if (carId != null ? !carId.equals(that.carId) : that.carId != null) return false;
        if (ownerId != null ? !ownerId.equals(that.ownerId) : that.ownerId != null) return false;
        if (motorId != null ? !motorId.equals(that.motorId) : that.motorId != null) return false;
        if (brand != null ? !brand.equals(that.brand) : that.brand != null) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (productionYear != null ? !productionYear.equals(that.productionYear) : that.productionYear != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = carId != null ? carId.hashCode() : 0;
        result = 31 * result + (ownerId != null ? ownerId.hashCode() : 0);
        result = 31 * result + (motorId != null ? motorId.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (productionYear != null ? productionYear.hashCode() : 0);
        return result;
    }
}
