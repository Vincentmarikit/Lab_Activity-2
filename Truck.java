public class Truck extends Vehicle implements Serviceable{
   private double loadCapacity;
   
   public Truck (String brand,
   String model, 
   int year,
   double loadCapacity
   
   ){
   super(brand, model, year);
   this.loadCapacity = loadCapacity;
   
   }

   @Override
   public void displayInfo(){
      super.displayInfo();
      System.out.println("Load Capacity: " + loadCapacity + " tons");
   }
   
   @Override
      public void moveForward() {
         System.out.println("Truck is Running");
         
         }
         
         @Override
      public void moveLeft() {
         System.out.println("Truck turn Left");
         }
         
         @Override
      public void moveBackward() {
         System.out.println("Truck is doing Reverse");
         
         }
         
         @Override
      public void moveRight() {
         System.out.println("Truck turn Right");
         
         }
         
@Override
      public void service(){
         System.out.println("Truck is being serviced ");
         }
         
      @Override
      public boolean needsService(){
      return true;
      }


}