package com.peoplecert.springschool.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "assignment", schema = "pcschool", catalog = "")
public class Assignment {
    private int id;
    private String description;
    private Date subDate;
    private BigDecimal oralMark;
    private BigDecimal totalMark;

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "description", nullable = false, length = 45)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "subDate", nullable = false)
    public Date getSubDate() {
        return subDate;
    }

    public void setSubDate(Date subDate) {
        this.subDate = subDate;
    }

    @Basic
    @Column(name = "oralMark", nullable = true, precision = 1)
    public BigDecimal getOralMark() {
        return oralMark;
    }

    public void setOralMark(BigDecimal oralMark) {
        this.oralMark = oralMark;
    }

    @Basic
    @Column(name = "totalMark", nullable = true, precision = 1)
    public BigDecimal getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(BigDecimal totalMark) {
        this.totalMark = totalMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assignment that = (Assignment) o;
        return id == that.id && Objects.equals(description, that.description) && Objects.equals(subDate, that.subDate) && Objects.equals(oralMark, that.oralMark) && Objects.equals(totalMark, that.totalMark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, subDate, oralMark, totalMark);
    }
}
