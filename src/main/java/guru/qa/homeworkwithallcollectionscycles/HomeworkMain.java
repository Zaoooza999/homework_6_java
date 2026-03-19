package guru.qa.homeworkwithallcollectionscycles;

public class HomeworkMain {
    public static void main(String[] args) {
        //Студенты
        StudentGroup group = new StudentGroup();
        group.addStudent("alex");
        group.addStudent("ivan");
        group.containsStudent("ivan");
        group.containsStudent("kostya");
        group.containsStudent("alex");
        group.deleteStudent("ivan");
        group.containsStudent("ivan");

        //Список задач
        ToDoList toDoList = new ToDoList();
        toDoList.addTask("Помыть полы");
        System.out.println(toDoList.containsTask("Помыть полы"));
        System.out.println(toDoList.containsTask("Помыть пол"));
        toDoList.deleteTask("Помыть полы");
        System.out.println(toDoList);

        //Логины
        UserRegistry logins = new UserRegistry();
        logins.register("Patrick");
        logins.register("Wilson");
        logins.register("Wilson");
        System.out.println(logins.hasUser("Patrick"));
        System.out.println(logins.hasUser("Wilson"));
        System.out.println(logins.hasUser("Ben"));
        logins.deleteUser("Patrick");
        System.out.println(logins.hasUser("Patrick"));
        System.out.println(logins);

        //Товары
        Warehouse products = new Warehouse();
        products.addProducts("Морковка",30);
        products.addProducts("Картофель",60);
        System.out.println(products.hasProduct("Морковка"));
        products.deleteProduct("Морковка");
        System.out.println(products.hasProduct("Морковка"));
        System.out.println(products);
    }
}
