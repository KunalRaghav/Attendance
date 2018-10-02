package com.kunalraghav.attendance;

class AttendanceDbSchema {
    public static final class AttendanceTable{
        public static final String name = "attendance";

        public static final class Cols{
            public static final String UUID = "uuid";
            public static final String SUBJECTNAME = "subjectName";
            public static final String TOTALCLASSES = "totalClasses";
            public static final String CLASSESATTENDED = "attendedClasses";
            public static final String SUBJECTCOLOR = "color";

        }
    }
}
