public class ConstructorTypes {
    public static void main(String[] args) {
        Student s1 = new Student();                     //Non-Parametrized Constructor
        Student s2 = new Student("Samsher");           //Parametrized Constructor
        System.out.println(s2.name);
        Student s3 = new Student(34);                  //Parametrized Constructor
        System.out.println(s3.Roll);
    }
}
class Student{
    int Roll;
    String name;

    Student(){                                         //Non-Parametrized Constructor
        System.out.println("Anurag Singh");
    }

    Student(String name){                              //Parametrized Constructor
        this.name = name;
    }

    Student(int Roll){                                  //Parametrized Constructor
        this.Roll = Roll;
    }
}
