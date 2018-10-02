package com.kunalraghav.attendance;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.kunalraghav.attendance.AttendanceDbSchema.AttendanceTable;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SubjectLab {
    public static SubjectLab sSubjectLab;

    private Context mContext;
    private SQLiteDatabase mDatabase;

    private static void get(Context context){

    } ;

    private SubjectLab(Context context){
        mContext = context;
        mDatabase = new AppDatabaseHelper(mContext).getWritableDatabase();
    }

    //Adding a Subject
    public void addSubject(Subject s){
        ContentValues values = getContentValues(s);
        mDatabase.insert(AttendanceTable.name,null,values);

    }
    //Updating A subject
    public void updateSubject(Subject s){
        String uuriString = s.getmId().toString();
        ContentValues values = getContentValues(s);
        mDatabase.update(AttendanceTable.name,values,
                AttendanceTable.Cols.UUID + " = ?",
                new String[]{uuriString});
    }

    public List<Subject> getSubjects(){
        return new ArrayList<>();
    }

    public Subject getSubject(UUID id){
        return null;
    }

    private static ContentValues getContentValues(Subject subject){
        ContentValues contentValues = new ContentValues();
        contentValues.put(AttendanceTable.Cols.UUID,subject.getmId().toString());
        contentValues.put(AttendanceTable.Cols.SUBJECTNAME,subject.getmSubjectName());
        contentValues.put(AttendanceTable.Cols.TOTALCLASSES,subject.getmTotalclasses());
        contentValues.put(AttendanceTable.Cols.CLASSESATTENDED,subject.getmClassesAttended());
        contentValues.put(AttendanceTable.Cols.SUBJECTCOLOR,subject.getmSubjectColor());
        return contentValues;
    }

    public Cursor querySubjects(String whereClause, String[] whereArgs){
        Cursor cursor = mDatabase.query(
                AttendanceTable.name,
                null,
                whereClause,
                whereArgs,
                null,
                null,
                null
        );
        return cursor;
    }

}
