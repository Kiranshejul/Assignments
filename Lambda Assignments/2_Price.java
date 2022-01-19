interface price {
    public String price();
}

public class order {
    public static void main(String[] args) {

        Integer i = 5000;
        price p = () -> {
            if (i > 10000) {
                return "ACCEPATED !!!";
            } else
                return "NOT ACCEPATED !!!";

        };
        System.out.println(p.price());
    }
}
