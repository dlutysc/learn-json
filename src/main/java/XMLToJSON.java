import net.sf.json.JSON;
import net.sf.json.JSONObject;
import net.sf.json.xml.XMLSerializer;

public class XMLToJSON {
    public static void main(String[] args) {
        //XML转换JSON
        String xml = "<root>" + "<name type='type'>wln</name>"
                + "<gender>woman</gender>" + "<birthday>" + "<year>1970</year>"
                + "<month>12</month>" + "<day>17</day>" + "</birthday>"
                + "</root>";
        XMLSerializer xmlSerializer = new XMLSerializer();
        JSON json = xmlSerializer.read(xml);
        System.out.println("1：" + json.toString(2));

        //JSON转换XML
        String jsonStr = "{\"root\":{" + "\"name\":\"wln\","
                + "\"gender\":\"woman\"," + "\"birthday\":{"
                + "\"year\":\"1970\"," + "\"month\":\"12\"," + "\"day\":\"17\""
                + "}" + "}" + "}";
        JSONObject jsonObject = JSONObject.fromObject(jsonStr);
        String xmlStr = new XMLSerializer().write(jsonObject);
        System.out.println("2：" + xmlStr);
    }
}
