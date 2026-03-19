package guru.qa;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Human dima = new Human("Alex", 23, true);
        Human arkadiy = new Human("Alex", 24, false);
//        System.out.println(dima);
//        dima = dima.incrementAge();
//        System.out.println(dima);
//        Human.sayHello();
//        List<String> lectures =
//                new ArrayList<>();
//        lectures.add("git");
//        lectures.add("java");
//        lectures.add("files");
//        lectures.add("junit");
//        int hours = 12;
//        String hello = "Hello";
//        Human.printSomeValues(hours, hello, lectures);
//        for (String lectureName : lectures) {
//            if (lectureName.startsWith("j")) {
//                System.out.println(lectureName);
//                return;
//            }
//        }
        if (dima.equals(arkadiy)) {
            System.out.println("ok");
            SomeStringify obj = new SomeStringify("test");
            Set<Object> set = new HashSet<>();
            set.add(obj);
            String s = "test";
            System.out.println("obj.equals(str): " + obj.equals(s));  // true
            System.out.println("str.equals(obj): " + s.equals(obj));
            System.out.println(set.contains(s));
            ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
            Point p2 = new Point(1, 2);
            ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);

            System.out.println(p1.equals(p2));
            System.out.println(p2.equals(p3));
            System.out.println(p1.equals(p3));
            System.out.println(p1.asPoint().equals(p2));
            System.out.println(p2.equals(p1.asPoint()));
            String book1 = "Java";
            String book2 = "Selenide";
            String book3 = "Java";
            System.out.println(book1.hashCode()+" "+book2.hashCode()+" "+book3.hashCode());
            System.out.println(book1.hashCode()==book2.hashCode());
            System.out.println(book1.hashCode()==book3.hashCode());
            String car = "merc";
            int year = 1970;
            LuxuryAuto merc = new LuxuryAuto("merc", 1970, 20000);
            System.out.println(car.hashCode()+1970+20000);
            System.out.println(merc.hashCode());
        }
    }
}
