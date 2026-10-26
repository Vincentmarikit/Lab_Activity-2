public class Truck extends Vehicle{
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

}