import net.sf.json.JSONArray;

public class JSONToArray {
    public static void main(String[] args) {
        //java数组转JSONArray
        boolean[] array = new boolean[]{false, true, false};
        JSONArray jsonArray = JSONArray.fromObject(array);
        System.out.println("1: " + jsonArray.toString());

        //JSONArray转java数组
        Object[] objs = jsonArray.toArray();
        for(Object obj : objs){
            System.out.println("2: " + obj);
        }
    }
}
