public class Constructor {
    public static void main(String[] args) {
        // Student s1 = new Student("Anurag Singh");      // (1st)
        Student s1 = new Student();                       // (2nd)
        // System.out.println(s1.name);                   //  (1st)
    }
}
class Student{
    String name;
    int roll;

    // Student(String name){
    //     this.name = name;             1st Method----->(1st)
    // }

    Student(){
        System.out.println("Constructor is called....");    //2nd Method----->(2nd)
    }
}