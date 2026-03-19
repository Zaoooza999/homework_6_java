package guru.qa;

public class Car {
    String model;
    int maxSpeed;
    private static final String s1 = "Ferrari";
    private static final String s2 = "Ferrari";

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.model = "Ferrari";
        car1.maxSpeed = 300;

        Car car2 = new Car();
        car2.model = "Ferrari";
        car2.maxSpeed = 300;

        System.out.println(car1.equals(car2));
        System.out.println(s1.equals(s2));
        if (s1 == "Ferrari") {
            System.out.println("s1==Ferrari");
        }

        String s3 = new String("abc");
        String s4 = new String("abc");;
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
    }
}
