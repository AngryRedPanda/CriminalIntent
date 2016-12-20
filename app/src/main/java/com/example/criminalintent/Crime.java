package com.example.criminalintent;


import java.util.Date;
import java.util.UUID;

public class Crime {

    private String crimeTitle;
    private UUID mId;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public Crime(String crimeTitle) {
        this.crimeTitle = crimeTitle;
    }

    public void setCrimeTitle(String crimeTitle) {
        this.crimeTitle = crimeTitle;
    }

    public String getCrimeTitle() {
        return crimeTitle;
    }

    public void setId(UUID mId) {
        this.mId = mId;
    }

    public UUID getId() {
        return mId;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }
}
