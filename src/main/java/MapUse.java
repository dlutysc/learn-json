import bean.Student;
import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapUse {
    public static void main(String[] args) {
        //Map转JSONString
        Map map = new HashMap();
        map.put("1", new Student("wln","22"));
        map.put("2", new Student("nana","33"));
        JSONObject jsonMap = JSONObject.fromObject(map);
        System.out.println("1：" + map);
        System.out.println("1: " + jsonMap);

        //JSONString转Map
        String jsonStr = "{\"1\":{\"name\":\"dada\",\"age\":\"44\"},\"2\":{\"name\":\"xiaoxiao\",\"age\":\"55\"}}";
        Map<String, JSONObject> map1 = JSONObject.fromObject(jsonStr);
        Set<String> set = map1.keySet();
        Iterator<String> ite = set.iterator();
        while (ite.hasNext()) {
            String key = ite.next();
            JSONObject jsonObject = map1.get(key);
            Student stu = (Student) JSONObject.toBean(jsonObject, Student.class);
            System.out.println("2：" + key + " " + stu);
        }
    }
}
