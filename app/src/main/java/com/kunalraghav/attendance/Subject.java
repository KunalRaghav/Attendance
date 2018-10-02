package com.kunalraghav.attendance;

import java.util.UUID;

class Subject {

    private UUID mId;
    private String mSubjectName;
    private int mTotalclasses;
    private int mClassesAttended;
    private String mSubjectColor;

    private Subject() {
        mId = UUID.randomUUID();
    }

    public String getmSubjectName() {
        return mSubjectName;
    }

    public void setmSubjectName(String mSubjectName) {
        this.mSubjectName = mSubjectName;
    }

    public int getmTotalclasses() {
        return mTotalclasses;
    }

    public void setmTotalclasses(int mTotalclasses) {
        this.mTotalclasses = mTotalclasses;
    }

    public int getmClassesAttended() {
        return mClassesAttended;
    }

    public void setmClassesAttended(int mClassesAttended) {
        this.mClassesAttended = mClassesAttended;
    }

    public String getmSubjectColor() {
        return mSubjectColor;
    }

    public void setmSubjectColor(String mSubjectColor) {
        this.mSubjectColor = mSubjectColor;
    }

    public UUID getmId() {
        return mId;
    }

    public void setmId(UUID mId) {
        this.mId = mId;
    }
}