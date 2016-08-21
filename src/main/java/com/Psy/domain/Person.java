package com.Psy.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private long personId;

    @Column
    private String personFirstName;

    @Column
    private String personLastName;

    @OneToMany
    private List<Attribute> attributesList;

    @OneToMany
    private List<Description> descriptionList;

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public String getPersonFirstName() {
        return personFirstName;
    }

    public void setPersonFirstName(String personFirstName) {
        this.personFirstName = personFirstName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public List<Attribute> getAttributesList() {
        return attributesList;
    }

    public void setAttributesList(List<Attribute> attributesList) {
        this.attributesList = attributesList;
    }

    public List<Description> getDescriptionList() {
        return descriptionList;
    }

    public void setDescriptionList(List<Description> descriptionList) {
        this.descriptionList = descriptionList;
    }
}
