class StudentCouncil {
    String presidentName;

    StudentCouncil(String name) {
        this.presidentName = name;
    }

    void showCouncil() {
        System.out.println("Student Council President: " + presidentName);
    }
}

class Library {
    int noOfBooks;

    Library(int books) {
        this.noOfBooks = books;
    }

    void showLibraryInfo() {
        System.out.println("Library has " + noOfBooks + " books.");
    }
}

class School {
    int noOfBenches = 30;
    int noOfDesks = 30;
    int smartBoard = 1;

    Library library;  

    School() {
        library = new Library(1000); 
    }

    void teachers() {
        System.out.println("There are 30 teachers in the school.");
    }

    void subjects() {
        System.out.println("Subjects: Maths, Chemistry, Physics.");
    }

    void showLibrary() {
        library.showLibraryInfo();
    }
}

class HighSchool extends School {
    StudentCouncil council; 

    HighSchool(StudentCouncil council) {
        this.council = council;
    }

    void highSchoolInfo() {
        System.out.println("High School follows the state board curriculum.");
        if (council != null)
            council.showCouncil();
    }
}

class College extends School {
    StudentCouncil council; 

    College(StudentCouncil council) {
        this.council = council;
    }

    void collegeInfo() {
        System.out.println("College offers undergraduate programs.");
        if (council != null)
            council.showCouncil();
    }
}

public class AggComp {
    public static void main(String[] args) {
        StudentCouncil council = new StudentCouncil("Riya Das");

        System.out.println("College:");
        College c = new College(council);
        System.out.println(c.noOfBenches);
        System.out.println(c.noOfDesks);
        System.out.println(c.smartBoard);
        c.teachers();
        c.subjects();
        c.showLibrary();   
        c.collegeInfo();  

        System.out.println("\nHigh School:");
        HighSchool h = new HighSchool(council);
        System.out.println(h.noOfBenches);
        System.out.println(h.noOfDesks);
        System.out.println(h.smartBoard);
        h.teachers();
        h.subjects();
        h.showLibrary();   
        h.highSchoolInfo(); 
    }
}
