import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DriverForStudentClass {


    public static void myFooter(int labE_number, int q_number) {
        System.out.println("_____________________________________________________________________");
        System.out.println("Completion of Assignment " + "Lab Excersize " + labE_number + "Q" + q_number + " is successful!");
        System.out.println("Signing off - Bashshar Atif.");

    }

    public static void myHeader(Student myInfo, int labE_number, int q_number) {
        System.out.println("______________________________________________________________________________________________________________________________________");
        System.out.println("Lab Excersize " + labE_number + "Q" + q_number);
        System.out.println("Prepared By: "+ myInfo.getFirstName() +" " + myInfo.getLastName());
        System.out.println("Student Number: 251219057");
        System.out.println("The goal of this exercise to is to create a doubly linked list that uses methods from the Comparable Interface.");
        System.out.println("______________________________________________________________________________________________________________________________________");
    }

    public static void main(String[] args) {
        ArrayList<Student> studentDemoList = new ArrayList<>();
        Student student0 = new Student();
        Student student1 = new Student("Harry","Potter",75.5);
        Student student2 = new Student("Ronald","Weasley",86.0);
        Student student3 = new Student("Hermione","Granger",91.7);
        Student student4 = new Student("Parvati","Patil",93.75);
        studentDemoList.add(student0);
        studentDemoList.add(student1);
        studentDemoList.add(student2);
        studentDemoList.add(student3);
        studentDemoList.add(student4);
        myHeader(student0,3,2);
        System.out.println("The Score Card:");
        for(int i =0; i<5;i++){
            System.out.println("\t" +studentDemoList.get(i).toString());
        }

        System.out.println("\nThe sorted list in terms of score in descending order....");
        Collections.sort(studentDemoList);
        Collections.reverse(studentDemoList);
        for(int i =0; i<5;i++){
            System.out.println("\t" +studentDemoList.get(i).toString());
        }

        System.out.println("\n The sorted list in terms of Last  Names....");
        HelperClassCompareLastNames lastNameCompare= new HelperClassCompareLastNames();
        Collections.sort(studentDemoList,lastNameCompare);
        for(int i =0; i<5;i++){
            System.out.println("\t" +studentDemoList.get(i).toString());
        }
        System.out.println("\n The sorted list in terms of First  Names....");
        HelperClassCompareFirstNames firstNameCompare= new HelperClassCompareFirstNames();
        Collections.sort(studentDemoList,firstNameCompare);
        for(int i =0; i<5;i++){
            System.out.println("\t" +studentDemoList.get(i).toString());
        }
        myFooter(3,2);
    }



}
