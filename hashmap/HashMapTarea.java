 import java.util.HashMap;
 
public class HashMapTarea {
    public static void main(String[] args) {
        HashMap<String, String> Canciones = new HashMap<String, String>();
        Canciones.put("Best of you", "I've got another confession to make");
        Canciones.put("Everlong", "Hello");
        Canciones.put("La camisa negra", "Así como lo oyes, mi'ja");
        Canciones.put("Despacito", "Oh, oh no, oh no (oh)");

        System.out.println(Canciones.get("La camisa negra"));
    }
}