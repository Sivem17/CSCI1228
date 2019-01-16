package l01b;

import java.util.Scanner;

/**
 * Check the Student class by creating some objects and manipulating them.
 *
 * @author Mark Young (A00000000)
 */
public class TestStudent {

    public static void main(String[] args) {
        // create a couple of students
        Scanner kbd = new Scanner(System.in);
        Student s1 = new Student("Dent, Stu.", 95);
        Student s2 = new Student("Tudiaunt, A.", 80);

        // show info for first two students
        System.out.println("\n....1st Student...");
        s1.printStudentRecord();
        System.out.println("\n....2nd Student...");
        s2.printStudentRecord();
        System.out.println();

        // pause
        System.out.print("\nPress Enter...");
        kbd.nextLine();
        System.out.println();

        // add e-mail information for one student
        s1.setEmail("Stu.Dent@smu.ca");

        // print e-mail info for both students
        System.out.println(s1.getName() + "'s e-mail is " + s1.getEmail());
        System.out.println(s2.getName() + "'s e-mail is " + s2.getEmail());

        // pause
        System.out.print("\nPress Enter...");
        kbd.nextLine();
        System.out.println();

        // try an invalid e-mail address
        s2.setEmail("A.Tudiant");

        // print e-mail info for both students
        System.out.println(s1.getName() + "'s e-mail is " + s1.getEmail());
        System.out.println(s2.getName() + "'s e-mail is " + s2.getEmail());

        // pause
        System.out.print("\nPress Enter...");
        kbd.nextLine();
        System.out.println();

        // now try a valid e-mail address
        s2.setEmail("Capt.Kirk@vanity.email.com");

        // print e-mail info for both students
        System.out.println(s1.getName() + "'s e-mail is " + s1.getEmail());
        System.out.println(s2.getName() + "'s e-mail is " + s2.getEmail());

        // pause
        System.out.print("\nPress Enter...");
        kbd.nextLine();
        System.out.println();
    }

}
