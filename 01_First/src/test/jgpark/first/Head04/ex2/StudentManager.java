package test.jgpark.first.Head04.ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentManager {
    private List<Student> studentList;

    private Map<String, Integer> studentMap;

    public StudentManager()
    {
        studentList = new ArrayList<Student>();
        studentMap = new HashMap<String, Integer>();
    }

    public void AddStudent(Student st, int score)
    {
        if(studentList.contains(st))
        {

            return;
        }

        studentList.add(st);
        studentMap.put(st.getName(), score);
    }

    public void removeStudent(Student name)
    {
        if(studentMap.containsKey(name.getName()) == false)
            return;

        studentMap.remove(name.getName());
        studentList.remove(name);
    }

    public void printAll()
    {
        for(Student s : studentList)
            System.out.println(s.toString());
    }

    public void printScore(String name)
    {
        if(studentMap.containsKey(name) == false)
            return;

        System.out.println(studentMap.get(name));
    }
}
