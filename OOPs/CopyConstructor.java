public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Anurag Singh";
        s1.Roll = 23;
        s1.Password = "Anu";
        s1.marks[0] = 100;
        s1.marks[1] = 67;
        s1.marks[2] = 90;

        Student s2 = new Student(s1);
        s2.Password = "Anurag";
        s1.marks[2] = 100;
        for(int i = 0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Student{
    int Roll;
    String name;
    String Password;
    int[] marks;

    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.Roll = s1.Roll;
        this.marks = s1.marks;
    }

    Student(){
        marks = new int[3];
        System.out.println("Anurag Singh");
    }

    Student(String name){
        marks = new int[3];
        this.name = name;
    }

    Student(int Roll){
        marks = new int[3];
        this.Roll = Roll;
    }
}
