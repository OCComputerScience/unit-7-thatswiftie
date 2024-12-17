package _2TeacherClassList;

import java.util.ArrayList;

public class Student
{
    private String name = "";
    private Integer grade = 0;
    private static ArrayList<Student> classList = new ArrayList<>();

    public Student(String name, Integer grade)
    {
        this.name = name;
        this.grade = grade;
        classList.add(this);
    }
    public static void printClassList()
    {
        for(int i = 0; i < classList.size(); i++)
        {
            System.out.println(classList.get(i).name);
        }
    }
}
