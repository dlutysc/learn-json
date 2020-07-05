package dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.Iterator;

public class XmlDemo {
    public static void main(String[] args) {
        String unsignedVoucherXml = "<?xml version=\"1.0\" encoding=\"GBK\"?><MOF><VoucherCount>1</VoucherCount><VoucherBody VoucherNo=\"1800011000175\" AdmDivCode=\"310000\" StYear=\"2014\" VtCode=\"8207\"><VoucherFlag>0</VoucherFlag><Attach></Attach><Voucher>PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iR0JLIj8+PFZvdWNoZXI+PEFkbURpdkNvZGU+MzEwMDAwPC9BZG1EaXZDb2RlPjxTdFllYXI+MjAxNDwvU3RZZWFyPjxWdENvZGU+ODIwNzwvVnRDb2RlPjxWb3VEYXRlPjIwMTQwNzIzPC9Wb3VEYXRlPjxWb3VjaGVyTm8+MTgwMDAxMTAwMDE3NTwvVm91Y2hlck5vPjxPcmlnaW5hbFZ0Q29kZT41MjAxPC9PcmlnaW5hbFZ0Q29kZT48T3JpZ2luYWxWb3VjaGVyTm8+MTkwMDAxMTIwPC9PcmlnaW5hbFZvdWNoZXJObz48RnVuZFR5cGVDb2RlPjE8L0Z1bmRUeXBlQ29kZT48UHJvQ2F0TmFtZT7Q0NX+ysLStdeoz+48L1Byb0NhdE5hbWU+PEZ1bmRUeXBlTmFtZT7UpMvjxNrXyr3wPC9GdW5kVHlwZU5hbWU+PFBheURpY3RhdGVObz40NTY3ODkwMDwvUGF5RGljdGF0ZU5vPjxQYXlNc2dObz4zMzMzMzMzMzwvUGF5TXNnTm8+PFBheUVudHJ1c3REYXRlPjIwMTQwNTA2PC9QYXlFbnRydXN0RGF0ZT48UGF5U25kQm5rTm8+PC9QYXlTbmRCbmtObz48U3VtQW10PjMwLjAwPC9TdW1BbXQ+PEFnZW5jeUNvZGU+OTk5PC9BZ2VuY3lDb2RlPjxBZ2VuY3lOYW1lPrn6vMrOxLuvvbvB99bQ0MS7+rnYPC9BZ2VuY3lOYW1lPjxQYXlBY2N0Tm8+MTExPC9QYXlBY2N0Tm8+PFBheUFjY3ROYW1lPsfsweXG+7O1ucm33dPQz965q8u+PC9QYXlBY2N0TmFtZT48UGF5QWNjdEJhbmtOYW1lPtbYx+zS+NDQwb3Ct7/a1qfQ0DwvUGF5QWNjdEJhbmtOYW1lPjxQYXlCYW5rQ29kZT4wMDcwMDE8L1BheUJhbmtDb2RlPjxQYXlCYW5rTmFtZT48L1BheUJhbmtOYW1lPjxCdXNpbmVzc1R5cGVDb2RlPjwvQnVzaW5lc3NUeXBlQ29kZT48QnVzaW5lc3NUeXBlTmFtZT48L0J1c2luZXNzVHlwZU5hbWU+PFBheVR5cGVDb2RlPjExMTwvUGF5VHlwZUNvZGU+PFBheVR5cGVOYW1lPjwvUGF5VHlwZU5hbWU+PFhQYXlEYXRlPjwvWFBheURhdGU+PFhTdW1BbXQ+PC9YU3VtQW10PjxIb2xkMT48L0hvbGQxPjxIb2xkMj48L0hvbGQyPjxEZXRhaWxMaXN0PjxEZXRhaWw+PElkPjM5MzMzODI8L0lkPjxPcmlWb3VjaGVyTm8+MTkwMDAxMTIwPC9PcmlWb3VjaGVyTm8+PFBheWVlQWNjdE5vPjUxMDMwMTAxMjAwMTAwMDA0NzA8L1BheWVlQWNjdE5vPjxQYXllZUFjY3RCYW5rTmFtZT7W2Mfsxam05cnM0rXS+NDQwb29rdDCx/jWp9DQwfrNt8vCt9bA7bSmPC9QYXllZUFjY3RCYW5rTmFtZT48UGF5ZWVBY2N0TmFtZT6xsbK/0MLH+PbOx7/G+7O1zqzQ3rOnPC9QYXllZUFjY3ROYW1lPjxQYXlBbXQ+MTYuMDA8L1BheUFtdD48UmVtYXJrPjwvUmVtYXJrPjxYQWdlbnRCdXNpbmVzc05vPjE4MDAwMTEwMDAwNTI8L1hBZ2VudEJ1c2luZXNzTm8+PFhQYXlBbXQ+MTYuMDA8L1hQYXlBbXQ+PFhQYXlEYXRlPjIwMTQtMDctMjggMTA6Mzg6MjU8L1hQYXlEYXRlPjxYUGF5ZWVBY2N0Tm8+NTEwMzAxMDEyMDAxMDAwMDQ3MDwvWFBheWVlQWNjdE5vPjxYUGF5ZWVBY2N0TmFtZT6xsbK/0MLH+PbOx7/G+7O1zqzQ3rOnPC9YUGF5ZWVBY2N0TmFtZT48WFBheWVlQWNjdEJhbmtOYW1lPtbYx+zFqbTlyczStdL40NDBvb2t0MLH+Nan0NDB+s23y8K31sDttKY8L1hQYXllZUFjY3RCYW5rTmFtZT48WEFkZFdvcmRDb2RlPjwvWEFkZFdvcmRDb2RlPjxYQWRkV29yZD48L1hBZGRXb3JkPjxIb2xkMT48L0hvbGQxPjxIb2xkMj48L0hvbGQyPjxIb2xkMz48L0hvbGQzPjxIb2xkND48L0hvbGQ0PjxYQ2hlY2tObz48L1hDaGVja05vPjwvRGV0YWlsPg0KPERldGFpbD48SWQ+MzkzMzM4NDwvSWQ+PE9yaVZvdWNoZXJObz4xOTAwMDExMjA8L09yaVZvdWNoZXJObz48UGF5ZWVBY2N0Tm8+NTEwMzAxMDEyMDAxMDAwMDQ3MDwvUGF5ZWVBY2N0Tm8+PFBheWVlQWNjdEJhbmtOYW1lPtbYx+zFqbTlyczStdL40NDBvb2t0MLH+Nan0NDB+s23y8K31sDttKY8L1BheWVlQWNjdEJhbmtOYW1lPjxQYXllZUFjY3ROYW1lPrGxsr/Qwsf49s7Hv8b7s7XOrNDes6c8L1BheWVlQWNjdE5hbWU+PFBheUFtdD4xNC4wMDwvUGF5QW10PjxSZW1hcms+PC9SZW1hcms+PFhBZ2VudEJ1c2luZXNzTm8+MTgwMDAxMTAwMDA1MjwvWEFnZW50QnVzaW5lc3NObz48WFBheUFtdD4xMy4wMDwvWFBheUFtdD48WFBheURhdGU+MjAxNC0wNy0yOCAxMDozODoyNTwvWFBheURhdGU+PFhQYXllZUFjY3RObz41MTAzMDEwMTIwMDEwMDAwNDcwPC9YUGF5ZWVBY2N0Tm8+PFhQYXllZUFjY3ROYW1lPrGxsr/Qwsf49s7Hv8b7s7XOrNDes6c8L1hQYXllZUFjY3ROYW1lPjxYUGF5ZWVBY2N0QmFua05hbWU+1tjH7MWptOXJzNK10vjQ0MG9va3Qwsf41qfQ0MH6zbfLwrfWwO20pjwvWFBheWVlQWNjdEJhbmtOYW1lPjxYQWRkV29yZENvZGU+PC9YQWRkV29yZENvZGU+PFhBZGRXb3JkPjwvWEFkZFdvcmQ+PEhvbGQxPjwvSG9sZDE+PEhvbGQyPjwvSG9sZDI+PEhvbGQzPjwvSG9sZDM+PEhvbGQ0PjwvSG9sZDQ+PFhDaGVja05vPjwvWENoZWNrTm8+PC9EZXRhaWw+PC9EZXRhaWxMaXN0PjwvVm91Y2hlcj4=</Voucher></VoucherBody></MOF>";
        Document doc;
        try {
            doc = DocumentHelper.parseText(unsignedVoucherXml);
            Element rootEle = doc.getRootElement();
            Iterator billCount = rootEle.elementIterator("VoucherCount");
            if (billCount.hasNext()) {
                String count = ((Element) billCount.next()).getText();
                if (count == null || "".equals(count.trim())) {
                    throw new RuntimeException("读取XML的VoucherCount节点值为空！");
                }
                System.out.println(count);
            } else {
                throw new RuntimeException("读取的XML无VoucherCount节点！");
            }

        } catch (DocumentException e) {
            e.printStackTrace();
        }

    }
}
