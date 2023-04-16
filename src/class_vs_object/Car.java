package class_vs_object;

public class Car {



    // Create car object => Car car1 = new Car(); Default constructor Car()
    // create 4 instance variables as make, model, year, price and make them all public
    public String make;
    public String model;
    public int year;
    public double price;


    // create 4-args constructor
    public Car(String make, String model, int year, double price) {
        // in the parentheses called local variable
        this.make = make; // this key refers to CURRENT object/ car1
        this.model = model; // instance variable
        this.year = year;
        this.price = price;
      // Car car1 = new Car (); this means car1

    // Too much to type. Right click, Generate, constructor,
        // select all,
    }


    // override toString method
    @Override
    public String toString() {
        return "Car{" +
           "make='" + make + '\'' +
           ", model='" + model + '\'' +
           ", year=" + year +
           ", price=" + price +
           '}';



    }
}
