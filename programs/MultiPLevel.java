package OOPS;
//parent class -vehicle
class Vehicle{
    //private class property
    private String brand;
    private int year;
    //parent constructor with class property
    public Vehicle (String brand,int year){
        this.brand=brand;
        this.year=year;
    }
    //non static default parent()
    public void display(){
        //print parent class property
        System.out.println("Brand name is :"+brand);
        System.out.println("year is:"+year);
    }
}

//child class
//reference - two entity have different properties 
class Car extends Vehicle {
    //child class property
    private int NumOfDoors;
    private int Speed;
    //child class contructor
    public Car(String brand, int year,int NumOfDoors,int Speed) {//extends all vehicle  and car properties
        super(brand, year); //whenever u want to refer parent properties then we use super keyword
        this.NumOfDoors=NumOfDoors; 
        this.Speed=Speed;       
    }  
     //extend non-static default parent()
     public void display(){
        super.display();
        //print child class property
        System.out.println("Number of doors"+NumOfDoors);
        System.out.println("Speed is :"+Speed);
     }
}

//grand child
class ElectricCar extends Car{
    private int BatteryCapacity;
    public ElectricCar(String brand, int year, int NumOfDoors, int speed,int BatteryCapacity) {//extends all vehicle, car,ElectricCar properties
        super(brand, year, NumOfDoors, speed);
        this.BatteryCapacity=BatteryCapacity;
    }
    //extend non-static default parent()
    public void display(){
        super.display();
        //print child class property
        System.out.println("Battery capacity will be : "+BatteryCapacity);
     }
}

public class MultiPLevel {
    public static void main(String[] args) {
        Car c= new Car("Nissan", 2024, 4, 60);//child class
        ElectricCar ec= new ElectricCar("Tesla",2023,4,80,100);
        c.display(); //invoke child class
        ec.display();

    }
}
