public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Schoolname = "JVM";
        Student s2 = new Student();
        System.out.println(s2.Schoolname);
        Student s3 = new Student();
        s3.Schoolname = "JVMLLLL";
    }
}
class Student{
    int roll;
    String name;
    static String Schoolname;
    
    void setname(String name){
        this.name = name;
    }
    String getname(){
        return this.name;
    }
}
