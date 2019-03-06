package com.wl.lesson06;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @autor : WL;
 * @date : 2019/3/5 0005
 */
public class Demo01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("周瑜", "小乔");
        map.put("吕布", "貂蝉");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
        map.put("令狐冲", "任盈盈");
        map.put("林平之", "岳灵珊");
        //第一种：普遍使用，二次取值
        System.out.println("通过Map.keySet遍历key和value：");
        for (String key : map.keySet()) {
            System.out.println("key= "+ key + " and value= " + map.get(key));
        }
        //第二种
        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value=" + entry.getValue());
        }
        //第三种：推荐，尤其是容量大时
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value=" + entry.getValue());
        }
        //第四种
        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        for (String v : map.values()) {
            System.out.println("value=" + v);
        }

    }
}
