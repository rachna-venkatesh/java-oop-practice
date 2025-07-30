class School {
    int noOfBenches = 30;
    int noOfDesks = 30;
    int smartBoard = 1;

    void teachers() {
        System.out.println("There are 30 teachers in the school.");
    }

    void subjects() {
        System.out.println("Subjects: Maths, Chemistry, Physics.");
    }
}

class HighSchool extends School {
    @Override
    void subjects() {
        System.out.println("High School subjects: English, History, State syllabus.");
    }

    void highSchoolInfo() {
        System.out.println("High School follows the state board curriculum.");
    }
}

class College extends School {
    @Override
    void subjects() {
        System.out.println("College subjects: Data Structures, DBMS, Operating Systems.");
    }

    void collegeInfo() {
        System.out.println("College offers undergraduate programs.");
    }
}

public class InheritanceMethods {
    public static void main(String[] args) {
        College c = new College();
        System.out.println("College:");
        System.out.println(c.noOfBenches);
        System.out.println(c.noOfDesks);
        System.out.println(c.smartBoard);

        c.teachers();           
        c.subjects();           
        c.collegeInfo();        

        System.out.println();

        HighSchool h = new HighSchool();
        System.out.println("High School:");
        System.out.println(h.noOfBenches);
        System.out.println(h.noOfDesks);
        System.out.println(h.smartBoard);

        h.teachers();           
        h.subjects();           
        h.highSchoolInfo();     
    }
}
