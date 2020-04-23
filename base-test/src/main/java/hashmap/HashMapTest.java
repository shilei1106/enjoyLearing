package hashmap;


import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTest {

    private static final Float loadFactor=0.75f;
    public static void main(String[] args) {
        Map linkedhashMap = new LinkedHashMap();
        linkedhashMap.put(1,"qweq");
        linkedhashMap.put(7,"adasd");
        linkedhashMap.put(5,"1231");
        Map treeMap=new TreeMap();
        treeMap.put(1,"喜喜");
        treeMap.put(5,"啊哈哈");
        treeMap.put(2,"嘿嘿");
        Map map=new HashMap<Integer,String>(2,loadFactor);
        map.put(3,"小明");
        map.put(7,"小红");
        map.put(5,"嚣张");
        System.out.print(map.toString()+"/n"+treeMap.toString()+"linkedHashMap="+linkedhashMap.toString());
    }
}
