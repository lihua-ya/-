package com.wl.lesson06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @autor : WL;
 * @date : 2019/3/5 0005
 */
public class Demo02 {
    List list = new ArrayList<>();
		list.add("hello");
		list.add("world");
		list.add(0, "java");

		System.out.println("=====1.toArray()======");
        Object[] array = list.toArray();


		for (int i = 0; i < array.length; i++ ) {
        String str =(String) array[i];
        System.out.println(str);
    }
		System.out.println("=====2.list.size()======");
		for (int i = 0; i < list.size(); i++) {
        String str = (String)list.get(i);
        System.out.println(str);
    }
		System.out.println("=====3.list.iterator()======");
    Iterator it = list.iterator();
		while(it.hasNext()) {
        String str = (String)it.next();
        System.out.println(str);
    }
		System.out.println("=====4.list.listIterator()正序======");
    ListIterator listIt = list.listIterator();
		while(listIt.hasNext()) {
        String str = (String)listIt.next();
        System.out.println(str);
    }
		System.out.println("=====5.list.listIterator()逆序======");
		while(listIt.hasPrevious()) {
        String str = (String)listIt.previous();
        System.out.println(str);
    }
		System.out.println("=====6.for(Object str : list)======");
		for(Object str : list) {
        System.out.println(str);
    }
}
