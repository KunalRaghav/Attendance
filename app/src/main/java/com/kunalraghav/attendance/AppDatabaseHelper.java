package com.kunalraghav.attendance;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.kunalraghav.attendance.AttendanceDbSchema.AttendanceTable;

/**
 * The basic app database for this application.
 *
 * The only class that uses this class is {@link SubjectLab}
 */

class AppDatabaseHelper extends SQLiteOpenHelper {

    private static final String TAG = "AppDatabaseHelper";

    public static final String DATABASE_NAME = "AttndTracker.db";
    public static final int VERSION = 1;


    public AppDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + AttendanceTable.name + " ("+
                    "int _id PRIMARY KEY AUTOINCREMENT," +
                    AttendanceTable.Cols.UUID +", "+
                    AttendanceTable.Cols.SUBJECTNAME + ", "+
                    AttendanceTable.Cols.TOTALCLASSES + ", "+
                    AttendanceTable.Cols.CLASSESATTENDED + ", " +
                    AttendanceTable.Cols.SUBJECTCOLOR +")");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        switch(oldVersion){
            case 1:
                // onUpgrade from version 1 logic starts;
                break;
            default:
                throw new IllegalStateException("OnUpgrade called with an unknown newVersion: " + newVersion);
        }

    }
}
