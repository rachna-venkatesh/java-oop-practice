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

class College extends School {
    void collegeInfo() {
        System.out.println("College offers undergraduate programs.");
    }
}

class HighSchool extends School {
    void highSchoolInfo() {
        System.out.println("High School follows the state board curriculum.");
    }
}

class JuniorCollege extends HighSchool {
    void juniorCollegeInfo() {
        System.out.println("Junior College is a bridge between high school and college.");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        System.out.println("---- College ----");
        College c = new College();
        System.out.println(c.noOfBenches);
        System.out.println(c.noOfDesks);
        System.out.println(c.smartBoard);
        c.teachers();
        c.subjects();
        c.collegeInfo();

        System.out.println("\n---- Junior College ----");
        JuniorCollege jc = new JuniorCollege();
        System.out.println(jc.noOfBenches);
        System.out.println(jc.noOfDesks);
        System.out.println(jc.smartBoard);
        jc.teachers();
        jc.subjects();
        jc.highSchoolInfo();      
        jc.juniorCollegeInfo();   
    }
}