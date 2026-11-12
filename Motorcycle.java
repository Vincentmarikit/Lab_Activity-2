public class Motorcycle extends Vehicle implements Serviceable{
   private String engineType;
   
   public Motorcycle(
      String brand, 
      String model, 
      int year, 
      String engineType
      
      ){
      
      super(brand, model, year);
      this.engineType = engineType;
   
   }
   
   @Override
   public void displayInfo(){
      super.displayInfo();
      System.out.println("Engine: " + engineType);
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
         System.out.println("Motorcycle is being serviced");
         }
         
      @Override
      public boolean needsService(){
      return true;
      }

}