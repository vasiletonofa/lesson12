package enums;

public interface Calculabil {

   void calculeaza();

   default void method() {
      System.out.println("Default");
   }

}
