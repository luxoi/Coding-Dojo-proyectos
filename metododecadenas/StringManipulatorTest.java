public class StringManipulatorTest{
/**
 String trimAndConcat(String, String): Elimina los espacios en blanco de ambos lados de las cadenas ingresadas y las concatena. Devolver la nueva cadena. Puede utilizar el método trim de la clase String. 
* */     
    public static void main(String[] args){ 
    StringManipulator manipulator = new StringManipulator();
    String str = manipulator.trimAndConcat("    Hola     ","     Mundo    ");
    System.out.println(str); 
   
//int getIndexOrNull(String, char): Obtener el índice del caracter dado y devolverlo o devolver -1. Si el caracter aparece varias veces, retornar el primer índice. Puede utilizar el método indexOf de la clase String.
   
    char letter = 'n';
    int a = manipulator.getIndexOrNull("Coding", letter);
    int b = manipulator.getIndexOrNull("Hola Mundo", letter);
    int c = manipulator.getIndexOrNull("Saludar", letter);
    System.out.println(a); // 4
    System.out.println(b); // 7
    System.out.println(c); // -1
  

    String word = "Hola";
    String subString = "la";
    String notSubString = "mundo";
    int a = manipulator.getIndexOrNull(word, subString);
    int b = manipulator.getIndexOrNull(word, notSubString);
    System.out.println(a); // 2
    System.out.println(b); // -1
    //si no se comentan los codigos de arriba no se van a ejecutar los de abajo

    String word = manipulator.concatSubstring("Hola", 1, 3, "mundo");
    System.out.println(word); // olmundo

    }
}