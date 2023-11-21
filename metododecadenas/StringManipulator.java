public class StringManipulator{
    public String trimAndConcat(String cadena1, String cadena2){ 
        return cadena1.trim() + cadena2.trim();
         }
         public static int getIndexOrNull(String a, char c){
            return a.indexOf(c);
         }
         public int getIndexOrNull(String cadena, String palabra){
            return cadena.indexOf(palabra);
         }
         public String concatSubstring(String palabra1, int inicio, int fin,
        String palabra2){
            return palabra1.substring(inicio, fin) + palabra2;
        }
}
