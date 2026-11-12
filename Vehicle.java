public abstract class Vehicle  {
   String brand;
   String model;
   int year;
   
   public Vehicle(String brand, String model, int year){
      this.brand = brand;
      this.model = model;
      this.year = year;
   }
   public void displayInfo() { 
      System.out.println("Brand: " + brand + ",Model: "+ model +",Year: " + year);
      
   }
   
   public void service(){
      System.out.println("Vehicle: Check the Vehicle");
      }
      public int calculateAge() {
    return 2026 - year;
}

public boolean isVintage() {
    return calculateAge() >= 25;
    
   }
 public abstract void moveForward();
 
 public abstract void moveLeft();
 
 public abstract void moveBackward();
 
 public abstract void moveRight();
 
}