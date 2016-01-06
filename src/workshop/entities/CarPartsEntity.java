package workshop.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by erxyi on 06.01.16.
 */
@Entity
@Table(name = "CAR_PARTS", schema = "JPALCZEW", catalog = "")
public class CarPartsEntity {
    private Byte carPartId;
    private Byte categoryId;
    private Byte vendorPrice;
    private Serializable partDesc;

    @Id
    @Column(name = "CAR_PART_ID", nullable = false, precision = 0)
    public Byte getCarPartId() {
        return carPartId;
    }

    public void setCarPartId(Byte carPartId) {
        this.carPartId = carPartId;
    }

    @Basic
    @Column(name = "CATEGORY_ID", nullable = false, precision = 0)
    public Byte getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Byte categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "VENDOR_PRICE", nullable = false, precision = 2)
    public Byte getVendorPrice() {
        return vendorPrice;
    }

    public void setVendorPrice(Byte vendorPrice) {
        this.vendorPrice = vendorPrice;
    }

    @Basic
    @Column(name = "PART_DESC", nullable = true, length = 20)
    public Serializable getPartDesc() {
        return partDesc;
    }

    public void setPartDesc(Serializable partDesc) {
        this.partDesc = partDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarPartsEntity that = (CarPartsEntity) o;

        if (carPartId != null ? !carPartId.equals(that.carPartId) : that.carPartId != null) return false;
        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (vendorPrice != null ? !vendorPrice.equals(that.vendorPrice) : that.vendorPrice != null) return false;
        if (partDesc != null ? !partDesc.equals(that.partDesc) : that.partDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = carPartId != null ? carPartId.hashCode() : 0;
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        result = 31 * result + (vendorPrice != null ? vendorPrice.hashCode() : 0);
        result = 31 * result + (partDesc != null ? partDesc.hashCode() : 0);
        return result;
    }
}
