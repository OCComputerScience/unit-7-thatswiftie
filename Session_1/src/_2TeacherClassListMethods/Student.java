package _2TeacherClassListMethods;
import java.util.ArrayList;
import java.util.Scanner;

public class Student
{
    private static Scanner input = new Scanner(System.in);
    private String name = "";
    private Integer grade = 0;
    private static ArrayList<Student> classList = new ArrayList<>();

    public Student(String name, Integer grade)
    {
        this.name = name;
        this.grade = grade;
        classList.add(this);
    }

    public static String getLastStudent()
    {
        return classList.get(classList.size()-1).name;
        //is getLast a thing?? its saying I can put it here
    }

    public static int getClassSize()
    {
        return classList.size();
    }

    public static String getStudent(int index)
    {
        return classList.get(index).name;
    }

    public static void addStudent(int index, Student student)
    {
        classList.add(index, student);
        classList.remove(classList.size()-1);
        System.out.println("Remove extra student?");
        String answer = input.nextLine();
        if(answer.toLowerCase().equals("yes"))
        {
            classList.remove(classList.size()-1);
            //also remove last pops up
        }
    }

    public static void printClassList()
    {
        for(int i = 0; i < classList.size(); i++)
        {
            System.out.println(classList.get(i).name);
        }
    }
}
