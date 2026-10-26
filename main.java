public class main {
   public static void printDetails(Vehicle vehicle){
   vehicle.displayInfo();
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
   
     }
}



