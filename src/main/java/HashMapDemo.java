import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        Map m1 = new HashMap();
        //添加字典
        hm.put("username", "password");
        hm.put("Jim", "1155689");
        hm.put("Jane", "1255669");
        hm.put("Kevin", "1165669");

        //测试 key 是否包含 username,返回值为 true/false
        System.out.println(hm.containsKey("username"));
        System.out.println("===================>");

        //获取key对应的value
        System.out.println(hm.get("Jim"));
        System.out.println("===================>");

        //获取整个字典的数据
        System.out.println(hm.entrySet());
        System.out.println("===================>");

        //循环打印每一对key，value
        Iterator<?> it = hm.entrySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("===================>");

        //分别获取 key 的值，和 value 的值。
        Iterator<String> it2 = hm.keySet().iterator();
        while (it2.hasNext()) {
            //获得字典的 key(username)
            String username = (String) it2.next();
            System.out.println(username);
            //获得字典的 value(节点)
            String password = hm.get(username);
            System.out.println(password);
        }
    }
    }
