public class Car extends Vehicle implements Serviceable{
   private int numberOfDoors  ;
   
   public Car(
      String brand,
      String model,
      int year,
      int numberOfDoors
   ){
      super(brand, model, year);
      this.numberOfDoors = numberOfDoors;  
   }
      @Override
      public void displayInfo(){
         super.displayInfo();
         System.out.println("Doors: " + numberOfDoors);
      }
      
       @Override
      public void moveForward() {
         System.out.println("Motorcycle is Running");
         
         }
         
         @Override
      public void moveLeft() {
         System.out.println("Motorcycle turn Left");
         }
         
         @Override
      public void moveBackward() {
         System.out.println("Motorcycle is doing Reverse");
         
         }
         
         @Override
      public void moveRight() {
         System.out.println("Motorcycle turn Right");
         
         }
      
      
      @Override
      public void service(){
         System.out.println("Car is being serviced");
         }
         
      @Override
      public boolean needsService(){
      return true;
      }
}

