package workshop.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by erxyi on 06.01.16.
 */
@Entity
@Table(name = "CAR_PARTS_CATEGORIES", schema = "JPALCZEW", catalog = "")
public class CarPartsCategoriesEntity {
    private Byte categoryId;
    private Byte markup;
    private Serializable description;

    @Id
    @Column(name = "CATEGORY_ID", nullable = false, precision = 0)
    public Byte getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Byte categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "MARKUP", nullable = true, precision = 0)
    public Byte getMarkup() {
        return markup;
    }

    public void setMarkup(Byte markup) {
        this.markup = markup;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 50)
    public Serializable getDescription() {
        return description;
    }

    public void setDescription(Serializable description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarPartsCategoriesEntity that = (CarPartsCategoriesEntity) o;

        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (markup != null ? !markup.equals(that.markup) : that.markup != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = categoryId != null ? categoryId.hashCode() : 0;
        result = 31 * result + (markup != null ? markup.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
