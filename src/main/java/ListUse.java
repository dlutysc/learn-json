import bean.Student;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ListUse {
    public static void main(String[] args) {
        //将List转成JSONArray
        List list = new ArrayList();
        list.add(new Student("wln","22"));
        list.add(new Student("nana","33"));
        JSONArray jsonArray = JSONArray.fromObject(list);
        System.out.println("1：" + jsonArray);

        //将JSONString转成List
        List list1 = new ArrayList();
        String strJSON = "[{\"name\":\"dada\",\"age\":\"44\"},{\"name\":\"xiaoxiao\",\"age\":\"55\"}]";
        JSONArray jsonArray1 = JSONArray.fromObject(strJSON);
        System.out.println(jsonArray1);
        for(int i = 0;i < jsonArray1.size(); i++) {
            JSONObject jsonObject1 = (JSONObject) jsonArray1.get(i);
            System.out.print(" " + jsonObject1);
            System.out.println();
            JSONObject jsonObject = jsonArray1.getJSONObject(i);
            Student stu = (Student) JSONObject.toBean(jsonObject,Student.class);
            list1.add(stu);
        }
        System.out.println("2：" + list1);
    }
}
