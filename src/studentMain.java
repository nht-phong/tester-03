public class studentMain {
    public static void main(String[] args) {
        student s1 = new student("john", 4);
        student s2 = new student("jane", 5);

        if(student.Pass(s1)){
            System.out.println(s1.name + " has PASSED with a GPA of " + s1.GPA);
        } else {
            System.out.println(s1.name + " has FAILED with a GPA of " + s1.GPA);
        }

        if(student.Pass(s2)){
            System.out.println(s2.name + " has PASSED with a GPA of " + s2.GPA);
        } else {
            System.out.println(s2.name + " has FAILED with a GPA of " + s2.GPA);
        }
        }
    }

