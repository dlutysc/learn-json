package demo;

import org.json.simple.JSONObject;

import java.io.StringWriter;

public class JsonEncodeDemo {
    public static void main(String[] args) throws Exception{
        JSONObject obj = new JSONObject();

        obj.put("name", "foo");
        obj.put("num", new Integer(100));
        obj.put("balance", new Double(1000.21));
        obj.put("is_vip", new Boolean(true));

        System.out.println(obj);

        StringWriter out = new StringWriter();
        obj.writeJSONString(out);
        String jsonText = out.toString();
        System.out.print(jsonText);
    }
}
