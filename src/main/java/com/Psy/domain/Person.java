package com.Psy.domain;

import java.util.List;

/**
 * Created by Camille on 06.08.2016.
 */
public class Person {

    private long personId;
    private String personFirstName;
    private String persomLastName;
    private List<Attribute> atributesList;
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

    public String getPersomLastName() {
        return persomLastName;
    }

    public void setPersomLastName(String persomLastName) {
        this.persomLastName = persomLastName;
    }

    public List<Attribute> getAtributesList() {
        return atributesList;
    }

    public void setAtributesList(List<Attribute> atributesList) {
        this.atributesList = atributesList;
    }

    public List<Description> getDescriptionList() {
        return descriptionList;
    }

    public void setDescriptionList(List<Description> descriptionList) {
        this.descriptionList = descriptionList;
    }
}
