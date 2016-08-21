package com.Psy.domain;

import com.Psy.EventTypeDeltas;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * quality - how useful was the contact event. The value is from -1 to 1
 * if contact was very efficient (lots communication, private information sharing etc.) quality is 1
 * if contact was not efficient (was close to person, but wasn't envolved in communication) quality might be 0.1
 * if contact was destructive (e.g. the argument occurred) quality might by -1
 */

@Entity
public class ContactEvent {


    @Id
    @GeneratedValue
    private long contactEventId;

    @Column
    private Date occurrenceDate;

    @Column
    private String contactEventType;

    @Column
    private String Description;

    @Column
    private double duration;

    @Column
    private double quality;

    @OneToMany
    private List<Transaction> transactions;

    @Column
    private double levelDelta;

    public void calculateLevelDelta() {
        int initialDelta = EventTypeDeltas.getTypeDelta(contactEventType);
        levelDelta = initialDelta * quality + getValueFromTransactions();
    }

    private int getValueFromTransactions() {
        int valueFromTransactions = 0;

        for (int i = 0; i < transactions.size(); i++) {
            Transaction transaction = transactions.get(i);
            valueFromTransactions += transaction.getValue();
        }
        return valueFromTransactions;
    }

    //Getter and Setter methods
    public double getLevelDelta() {
        return levelDelta;
    }

    public void setLevelDelta(double levelDelta) {
        this.levelDelta = levelDelta;
    }

    public long getContactEventId() {
        return contactEventId;
    }

    public void setContactEventId(long contactEventId) {
        this.contactEventId = contactEventId;
    }

    public Date getOccurrenceDate() {
        return occurrenceDate;
    }

    public void setOccurrenceDate(Date occurrenceDate) {
        this.occurrenceDate = occurrenceDate;
    }

    public String getContactEventType() {
        return contactEventType;
    }

    public void setContactEventType(String contactEventType) {
        this.contactEventType = contactEventType;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getQuality() {
        return quality;
    }

    public void setQuality(double quality) {
        this.quality = quality;
    }
}

