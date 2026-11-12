public class Printer implements Serviceable{
  
   @Override
   public void service(){
      System.out.println("Printer: Clean rollers and check ink.");
   }
   
   @Override
      public boolean needsService(){
      return true;
      }

}