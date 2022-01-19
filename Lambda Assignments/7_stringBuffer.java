import java.util.*;
import java.util.stream.*;


public class stringBuffer {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>(5);
        map.put("name1", "val1");
        map.put("name2", "val2");
        map.put("name3", "val3");
        map.put("name4", "val4");
        map.put("name5", "val5");
        String k = map.entrySet().stream().map((entry) ->
                        "" + entry.getKey() + " \"" + entry.getValue().replaceAll("\"", "\\\\\"") + "\"")
                .collect(Collectors.joining(" "));
        System.out.println(k);
		
	}
}
