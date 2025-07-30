class School{
    int noOfBenches=30;
    int noOfDesks=30;
    int smartBoard=1;
    
    void Teachers(){
        System.out.println("There are 30 teachers");
    }

    void Subjects(){
        System.out.println("Maths,Chemistry,Physics");
    }
}

class College extends School{
    void Print(){
        System.out.println("College consists of benches,desks,smartboards,teachers and subjects");
    }
}

public class singleLevel{
    public static void main(String[] args) {
        College c=new College();
        System.out.println(c.noOfBenches);
        System.out.println(c.noOfDesks);
        System.out.println(c.smartBoard);

        c.Teachers();
        c.Subjects();
        c.Print();
    }
}