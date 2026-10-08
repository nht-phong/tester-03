public class student {
 String name;
 double GPA;

 public student(String name,double GPA){
    this.name = name;
    this.GPA = GPA;
 }

 public static boolean Pass(student s){
    return s.GPA>=5;
 }

}
