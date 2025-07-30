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
    void printCollegeDetails() {
        System.out.println("College has benches, desks, smartboards, teachers, and subjects.");
    }
}

class University extends College {
    void printUniversityDetails() {
        System.out.println("University includes multiple colleges and advanced facilities.");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        University u = new University();
        System.out.println(u.noOfBenches);
        System.out.println(u.noOfDesks);
        System.out.println(u.smartBoard);

        u.teachers();
        u.subjects();
        u.printCollegeDetails();
        u.printUniversityDetails();
    }
}