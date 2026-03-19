package guru.qa.homeworkwithallcollectionscycles;

import java.util.ArrayList;

public class StudentGroup {
    private ArrayList<String> students = new ArrayList<>();

    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                '}';
    }
    public boolean containsStudent(String name){
        for (int i = 0; i < students.size(); i++){
            if (students.get(i).equals(name)){
                System.out.println(name + " есть в списках");
                return true;
            }
        }
        System.out.println(name + " нет в списке");
        return false;
    }

    public void deleteStudent (String name){
        students.remove(name);
        System.out.println("Удалили " + name);}

    public void addStudent (String name){
        students.add(name);
        System.out.println("Добавили " + name);
    }
}
