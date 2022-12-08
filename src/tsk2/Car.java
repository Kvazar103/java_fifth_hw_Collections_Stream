package tsk2;

public class Car {
    private String brand;
    private double power;
    private int year;
    private int price;
    private Owner car_owner;

    public Car(String brand, double power, int year, int price, Owner car_owner) {
        this.brand = brand;
        this.power = power;
        this.year = year;
        this.price = price;
        this.car_owner = car_owner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Owner getCar_owner() {
        return car_owner;
    }

    public void setCar_owner(Owner car_owner) {
        this.car_owner = car_owner;
    }
    public void engine_repair(Car car){
      this.power=addTenPercent(car.power);
    }
    public static double addTenPercent(double i) {
        double b = (i * 0.1);
        return (b + i);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", power=" + power +
                ", year=" + year +
                ", price=" + price +
                ", car_owner=" + car_owner +
                '}';
    }
}

