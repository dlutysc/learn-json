import bean.Student;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JSONArrayToList {
    public static void main(String[] args) {
        //List转为JSONArray
        List<Student> list = new ArrayList<>();
        list.add(new Student("王作", "22"));
        list.add(new Student("王慧", "33"));
        JSONArray jsonArray = JSONArray.fromObject(list);
        System.out.println(jsonArray.get(0));
        System.out.println(jsonArray.getJSONObject(1));
        System.out.println(jsonArray);

        //JSONArray转为List
        List<Student> lst = JSONArray.toList(jsonArray, new Student(), new JsonConfig());
        Iterator<Student> ite = lst.iterator();
        while (ite.hasNext()) {
            Student student = ite.next();
            System.out.println(student);
        }
    }
}
