package _2TeacherClassListMethods;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //Student variables
        Student audreyP = new Student("Audrey", 11);
        Student maxxB = new Student("Maxx", 11);
        Student kaysenH = new Student("Kaysen", 11);
        Student willK = new Student("Will", 11);
        Student seanP = new Student("Sean", 11);

        System.out.println("Class: ");
        Student.printClassList();

        System.out.println("Last student: " + Student.getLastStudent());
        System.out.println("Class Size: " + Student.getClassSize());

        System.out.println("Add a student?");
        String answer = input.nextLine();
        if(answer.toLowerCase().equals("yes"))
        {
            System.out.println("What is the Student's name?");
            String name = input.nextLine();
            System.out.println("What is the Student's grade?");
            int grade = input.nextInt();
            Student addedStudent = new Student(name, grade);
            System.out.println("Where should the student be added?");
            int index = input.nextInt();
            Student.addStudent(index, addedStudent);
            System.out.println("Updated Class");
            Student.printClassList();
        }
        System.out.println("The fourth student in the class is " + Student.getStudent(3));
    }
}
