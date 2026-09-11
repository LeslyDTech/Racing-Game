public class Car {
    // instance variables
    private int year;
    private String make;
    private String model;
    private float mileage;
 //   private String hornSoung;

    // methods
    // constructors -> help us to create (instantiate) objects
    // implicit 0-argument constructor
    public Car() {

    }
    // 4-arg constructor
    public Car(int year, String make, String model, float mileage) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }
    public Car(int year) {
        this.year = year;
    }


    // accessors and mutators a.k.a. getters and setters
    public int getYear() {
        return year;
    }
    public void setYear(int y) {
            year = y;

    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;  // this -> implicit parameter
    }
    public float getMileage() {
        return mileage;
    }
    public void setMileage(float mileage) {
        this.mileage = mileage;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    // instance method
    // drive, honk, turn on turn signals, brake, turn on A/C
    public void drive(float milesDriven) {
        mileage += milesDriven; // mileage = mileage + milesDriven
    }
    public void honk(String sound) {
        System.out.println(sound);
    }
}