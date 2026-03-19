package guru.qa.homeworkwithallcollectionscycles;

import java.util.Arrays;

public class ToDoList {
    private String[] toDolist = new String[10];

    public void addTask(String task){
        for (int i = 0; i < toDolist.length; i++){
            if (toDolist[i] == null){
            toDolist[i] = task;
            break;
            }
        }
    }

    public boolean containsTask(String task){
        for (String taskFromMassive : toDolist){
            if (taskFromMassive != null && taskFromMassive.equals(task)){
                return true;
            }
    }
        return false;
    }

    public void deleteTask(String task){
        for (int i = 0; i < toDolist.length; i++){
            if (toDolist[i] != null && toDolist[i].equals(task)){
                toDolist[i] = null;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "ToDoList{" +
                "toDolist=" + Arrays.toString(toDolist) +
                '}';
    }
}
