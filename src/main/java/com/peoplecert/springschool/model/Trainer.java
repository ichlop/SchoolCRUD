package com.peoplecert.springschool.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "trainer", schema = "pcschool")
//@XmlRootElement
//@NamedQueries({
//        @NamedQuery(name = "Trainer.findAll", query = "SELECT tr FROM Trainer tr"),
//        @NamedQuery(name = "Trainer.findById", query = "SELECT tr FROM Trainer tr WHERE tr.id = :id"),
//        @NamedQuery(name = "Trainer.findByFirstname", query = "SELECT tr FROM Trainer tr WHERE tr.firstname = :firstname"),
//        @NamedQuery(name = "Trainer.findByLastname", query = "SELECT tr FROM Trainer tr WHERE tr.lastname = :lastname")})
public class Trainer implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Size(min=1, max=45)
    @Column(name = "firstname", nullable = false, length = 45)
    private String firstname;
    @Basic
    @Size(min=1, max=45)
    @Column(name = "lastname", nullable = false, length = 45)
    private String lastname;

    public Trainer() {
    }

    public Trainer(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainer that = (Trainer) o;
        return id == that.id && Objects.equals(firstname, that.firstname) && Objects.equals(lastname, that.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname);
    }
}
