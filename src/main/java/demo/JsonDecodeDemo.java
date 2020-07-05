package demo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.math.BigDecimal;
import java.util.*;

public class JsonDecodeDemo {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
        try {
            Object obj = parser.parse(s);
            JSONArray array = (JSONArray)obj;
            System.out.println("The 2nd element of array");
            System.out.println(array.get(1));

            JSONObject obj2 = (JSONObject)array.get(1);
            System.out.println("Field \"1\"");
            System.out.println(obj2.get("1"));

            s = "{}";
            obj = parser.parse(s);
            System.out.println(obj);

            s= "[5,]";
            obj = parser.parse(s);
            System.out.println(obj);

            s= "[5,,2]";
            obj = parser.parse(s);
            System.out.println(obj);
        }catch (ParseException e){
            e.printStackTrace();
        }

        Map<String, BigDecimal> map = new HashMap();
        map.put("1", new BigDecimal(0).subtract(new BigDecimal(2.00)));
        System.out.println(map.get("1"));
        List l = new ArrayList();
        l.add("bj");
        test("HELLO", "HI", 3, l);

    }

    public static void test(Object... a){
        System.out.println(Arrays.toString(a));
    }
}
