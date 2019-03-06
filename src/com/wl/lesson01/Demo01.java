package com.wl.lesson01;

import com.wl.util.Property;
import com.wl.util.Table;

import java.lang.reflect.Field;

public class Demo01 {
    public static void main(String[] args) {
         /*
            通过反射机制获取sql语句
            select t_id,t_username,t_password from t_user
         */
//        try {
//            Class<?> forName = Class.forName("com.chinasofti.lesson02.User");
//            query(forName);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

//        User user = query(User.class);
//        System.out.println(user);
        User user = query(User.class);
        System.out.println(user);
    }

    public static  <T> T query(Class<T> forName) {
        StringBuffer sb = new StringBuffer();
        sb.append("select");
        Field[] declaredFields = forName.getDeclaredFields();

        for (int i=0;i<declaredFields.length;i++){
            Field field = declaredFields[i];

            Property property=field.getDeclaredAnnotation(Property.class);

            sb.append(" "+property.name());
            if(i<declaredFields.length-1){
                sb.append(",");
            }
        }
        sb.append("from");

        Table table = forName.getDeclaredAnnotation(Table.class);
        sb.append(table.name());
        System.out.println(sb.toString());

        Object[] arr = {1,"aaaUsername","aaaPassword"};
        try {
            T t = forName.newInstance();
            for (int i=0;i<declaredFields.length;i++){
                Field field = declaredFields[i];
                field.setAccessible(true);
                field.set(t,arr[i]);
            }
            return t;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
