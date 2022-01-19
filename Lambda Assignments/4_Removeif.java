import java.util.*;

public class Mobile {
    public static void main(String args[]){

        List<String> words = new ArrayList<>();
        words.add("REDMI");
        words.add("REALMI");
        words.add("OPPO");
        words.add("VIVO");
        words.add("APPLE");
        words.add("SAMSUNG");
        
        words.removeIf(w-> w.length()%2!=0);
        words.forEach(System.out::println);
    }
}
