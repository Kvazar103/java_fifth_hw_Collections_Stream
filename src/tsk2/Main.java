package tsk2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Car> cars=new ArrayList<>();
        cars.add(new Car("BMW",450,2014,16000,
                new Owner("Vasya",19,1)));
        cars.add(new Car("Mercedez",200,2010,10000,
                new Owner("Kaban",55,33)));
        cars.add(new Car("Opel",140,2007,7000,
                new Owner("Stepan",40,20)));
        cars.add(new Car("Audi",320,2011,13000,
                new Owner("Masha",28,4)));
        cars.add(new Car("Zhihuli",70,1994,900,
                new Owner("Vanya",55,33)));
        cars.add(new Car("Tesla",300,2018,18000,
                new Owner("Nastya",30,2)));
        cars.add(new Car("Volkswagen",200,2014,10000,
                new Owner("Sanek",30,11)));
        cars.add(new Car("Volvo",180,2016,10000,
                new Owner("Petya",60,43)));
        cars.add(new Car("BMW",240,2012,12000,
                new Owner("Taras",42,20)));
        cars.add(new Car("Ford",200,2010,10000,
                new Owner("Jon",38,18)));

        cars.get(0).engine_repair(cars.get(0));
        cars.get(1).engine_repair(cars.get(1));
        cars.get(2).engine_repair(cars.get(2));
        cars.get(3).engine_repair(cars.get(3));
        cars.get(4).engine_repair(cars.get(4));

        cars.stream().forEach(car -> {
            if (car.getCar_owner().getDriving_experience()<5&&car.getCar_owner().getAge()>25){
                car.getCar_owner().training_courses(car.getCar_owner());
            }
        });
        System.out.println(cars);

        List<Integer> suma=new ArrayList<>();
        cars.stream().forEach(car ->suma.add(car.getPrice()));

       int all= suma.stream().mapToInt(Integer::intValue).sum();
       System.out.println("Price of all cars: "+all);
    }
}
