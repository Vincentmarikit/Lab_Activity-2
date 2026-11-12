public class main {

   public static void serviceItem(Serviceable item){
   item.service();
   
      System.out.println("Needs Service: " + item.needsService());
   }

   public static void printDetails(Vehicle vehicle){
   
   System.out.println("Age: " + vehicle.calculateAge());
   System.out.println("Vintage: " + vehicle.isVintage());
   vehicle.moveForward();  
   vehicle.moveLeft();
   vehicle.moveBackward();
   vehicle.moveRight(); 
   }
   
   public static void main (String[] args){
   
   Vehicle vehicle = new Car("Honda", "Civic", 2014, 4);
   vehicle.displayInfo();
   System.out.println();
      
   vehicle = new Motorcycle("Yamaha", "Aerox", 2025, "Liquid-Cooled");
   vehicle.displayInfo();
   System.out.println();
   
   vehicle = new Truck ("Isuzu", "Elf", 2020 , 10.5);
   vehicle.displayInfo();
   System.out.println();
   
      
   System.out.println("\n=== 2. Method Parameter ===");
   
   
   Car car = new Car("Toyota", "Supra", 2014, 4);
   Motorcycle motor = new Motorcycle("Yamaha", "Mio-125", 2026, "air-cooled");
   Truck truck = new Truck ("Hino", "L500", 2022, 10.0);
   
   printDetails(car);
   System.out.println();
   
   printDetails(motor);
   System.out.println();
   
   printDetails(truck);
   System.out.println();
   
   System.out.println("\n--- 3. Polymorphic Array ---");

        Vehicle[] vehicles = {
            new Car("Toyota", "GR Supra", 2026, 2),
            new Motorcycle("HONDA", "Click 125", 2022, "Single-Cylinder"),
            new Truck("Isuzu", "FTR", 1994, 7.3)
        };

        for(Vehicle currentVehicle : vehicles){
            printDetails(currentVehicle);
            System.out.println();
             }
             
             System.out.println("\n --- 4. Interface Polymorphism --- ");
             
             Serviceable[] serviceItems = {
             new Car ("Toyota", "GR Supra", 2026, 2),
             new Motorcycle ("Honda", "Click 125", 2023, "Single-Cylinder"),
             new Truck ("Isuzu", "FTR TRUCK",2018 ,7.3),
             new Printer()
             };
             
             for (Serviceable item : serviceItems){
                  serviceItem(item);
                  System.out.println();
                  
             }
     }
}



