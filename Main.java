public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();

        System.out.println("The car model is : "+car1.Model);
        System.out.println("The car name is : " +car1.Name);
        System.out.println("The car year is : "+car1.year);
        car1.drive();
        car1.park();


    }
}