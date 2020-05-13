package com.study.container;

import java.util.*;

/**
 * Iterator遍历
 */

public class TestIterator {
    public static void main(String[] args) {
        /**
         * list
         */
        List<String> aList = new ArrayList<String>();
        for (int i = 0; i < 6; i++) {
            aList.add("a" + i);
        }
        System.out.println(aList);

        for(Iterator<String> iter = aList.iterator(); iter.hasNext();) {
            String temp = iter.next();
            System.out.println(temp);
        }
        System.out.println("===========");
        /**
         * Map迭代
         */
        Map<String, String> aMap = new HashMap<String, String>();
        aMap.put("小张", "18岁");
        aMap.put("小李", "18岁");
        System.out.println(aMap);
        Set<String> ss = aMap.keySet();
        for(Iterator<String> iter = ss.iterator(); iter.hasNext();) {
            String key = iter.next();
            System.out.println(key+"="+aMap.get(key));
        }
    }


}
