import java.util.*;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
  
class supplier {
    public static void main(String args[])
    {
        List<String> mobiles = Arrays.asList(
            "Redmi", "Realmi", "Google", "Nokia", "Reliance");
        System.out.println("***** Predicate *****");
        Predicate<String> m = (s) -> s.startsWith("R");
        for (String st : mobiles) {
            if (m.test(st))
                System.out.println(st);
        }
        System.out.println("***** Consumer *****");
        Consumer<String> Cons = t -> System.out.println(t);
        Stream<String> lang = Stream.of("c", "c++", "java", "python");
        lang.forEach(Cons);
        
        System.out.println("***** Suplier *****");
        Supplier<Integer> s = () -> Math.abs(45);
        Optional<Integer> s1 = Optional.of(20);
        System.out.println(s1.orElseGet(s));
    }
}
