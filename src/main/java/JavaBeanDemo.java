import bean.Student;
import net.sf.json.JSONObject;

/**
 * JavaBean与JSON字符串之间的转换
 */
public class JavaBeanDemo {
    public static void main(String[] args) {
        //将JavaBean转换为JSONObject
        Student student = new Student("wln", "22");
        JSONObject jsonObject = JSONObject.fromObject(student);
        System.out.println("1：" + jsonObject);

        //将JSONString转换为JSONObject
        String jsonStr = "{\"name\":\"王作\",\"age\":\"33\"}";
        JSONObject jsonObject1 = JSONObject.fromObject(jsonStr);
        System.out.println("4: " + jsonObject1);

        Student stu = (Student) JSONObject.toBean(jsonObject1,Student.class);
        System.out.println("2：" + stu);
        System.out.println("3：" + stu.getName() +" "+ stu.getAge());
    }
}
