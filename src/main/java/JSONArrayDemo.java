import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JSONArrayDemo {
    public static void main(String[] args) {
        //创建JSONArray对象
        JSONArray jsonArray = new JSONArray();
        jsonArray.add(0,"aa");
        jsonArray.add(1,"BB");
        jsonArray.element("cc");
        jsonArray.add("DD");
        System.out.println("1：" + jsonArray);
        //根据下标获取数据
        System.out.println("2：" + jsonArray.get(0));

        //根据下标设置数据
        jsonArray.set(0,"AAA");
        System.out.println("3：" + jsonArray);

        //创建JSONObject
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("username", "lwc");
        jsonObject.put("password", "123");
        //把JSONObject放入到JSONArray中
        jsonArray.add(jsonObject);
        System.out.println("4：" + jsonArray);

        //遍历
        System.out.println("5：");
        for(int i=0;i<jsonArray.size();i++){
            System.out.print(jsonArray.get(i)+"\t");
        }

    }
}
