package com.kunalraghav.attendance;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class SubjectLab {
    public static SubjectLab sSubjectLab;

    private Context mContext;
    private List<Subject> mSubjects;
    private SQLiteDatabase mDatabase;

    private SubjectLab(Context context){
        mContext = context;
        mDatabase = new AppDatabaseHelper(mContext).getWritableDatabase();
        mSubjects = new ArrayList<>();

    }
}
