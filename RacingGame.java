public class RacingGame {
    public static void main(String[] args) {

        // 1. Declare a reference variable
        // 2. Instantiate an object -> create an object -> new
        // 3. Assign the object to the reference variable

        // 1    3   2
        Car c1 = new Car();
        Car c2 = new Car(2023, "Ford", "Mustang", 34001);
        Car c3 = new Car(1977);


        c1.setYear(2016);
        c1.setMake("Honda");
        c1.setModel("Civic");
        c1.setMileage(-1);

 //       System.out.println(c1.getYear());
 //       System.out.println(c1.getMake());
 //       System.out.println(c1.getModel());
        System.out.println(c1.getMileage());


 //       System.out.println(c1.getYear());
 //       System.out.println(c1.getMake());
 //       System.out.println(c1.getModel());
        System.out.println(c2.getMileage());


 //       System.out.println(c1.getYear());

        c1.drive(65);
        c1.drive(3333);

        System.out.println("--------------------");
        System.out.println(c1.getMileage());
        System.out.println(c2.getMileage());


        c1.honk("BEEP");
        c2.honk("HOOONK");
    }
}
