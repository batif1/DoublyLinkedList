
public class Driver_DoublyLinkdedList {
    public static void myFooter(int labE_number, int q_number) {
        System.out.println("_____________________________________________________________________");
        System.out.println("Completion of Assignment " + "Lab Excersize " + labE_number + "Q" + q_number + " is successful!");
        System.out.println("Signing off - Bashshar Atif.");

    }

    public static void myHeader(int labE_number, int q_number) {
        System.out.println("______________________________________________________________________________________________________________________________________");
        System.out.println("Lab Excersize " + labE_number + "Q" + q_number);
        System.out.println("Prepared By: Bashshar Atif");
        System.out.println("Student Number: 251219057");
        System.out.println("The goal of this exercise to is to create a doubly linked list");
        System.out.println("______________________________________________________________________________________________________________________________________");

    }

    public static void main(String[] args) {
        myHeader(3, 1);
        DoublyLinkedList<MyStudent> bashsharList = new DoublyLinkedList<MyStudent>();

        MyStudent s0 = new MyStudent();
        MyStudent s1 = new MyStudent("Harry", 67.35);
        MyStudent s2 = new MyStudent("Luna", 87.5);
        MyStudent s3 = new MyStudent("Vincent", 60.5);
        MyStudent s4 = new MyStudent("Hermione", 89.2);
        bashsharList.addLast(s0);
        bashsharList.addLast(s1);
        bashsharList.addLast(s2);
        bashsharList.addLast(s3);
        System.out.println("The List Content: ");
        System.out.println(bashsharList.toString());


        DoublyLinkedList.Node<MyStudent> student1 = bashsharList.findNode(s2);
        DoublyLinkedList.Node<MyStudent> student2 = bashsharList.findNode(s3);
        bashsharList.addBetween(s4, student1, student2);

        System.out.println("Adding Hermione to the list in between Luna and Vincent...");

        System.out.println(bashsharList.toString());
        myFooter(3, 1);
    }
}

