package org.lession9;
import java.util.*;

public class NewClass {
    public static void main(String[] args) {
//        List arrayList = new ArrayList();
//        List linkedList = new LinkedList();
//
//
//        arrayList.add(123);
//        arrayList.add("String");
//        arrayList.add(false);
//
//        System.out.println(arrayList);
//
//        List<String> strings = new ArrayList<>();
//        strings.add("1234");
//        strings.add("string");
//        strings.add("false");
//
////        strings.add(false); <-exception
////        strings.add(123);
//        for (String string : strings) {
//            System.out.println(string);
//        }
//
//        for (int i = 0; i < strings.size(); i++) {
////            System.out.println(strings.get(i));
//        }
//
////        System.out.println(strings.isEmpty());
//
//        if (strings.contains("string")) {
////            System.out.println("OK");
//        }
//
//        strings.remove("string");
//        System.out.println(strings);

//        strings.removeAll(strings);
//        System.out.println(strings);
//        System.out.println(strings);
//        strings.clear();
//        System.out.println(strings);

//
////        for (String string : strings) {   <- ConcurrentModificationException
////            strings.remove(string);
////        }
//
//        Iterator<String> iterator = strings.iterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            if(next.equals("string")){
//                iterator.remove();
//            }
//        }
//
////        System.out.println(strings);
//
//
//        List<Integer> integers = Arrays.asList(123, 43, 54, 56);
//
//
////        System.out.println(integers);
//
////        Collections.sort(integers);
////        System.out.println(integers);
////        Collections.reverse(integers);
////        System.out.println(integers);
//
//        System.out.println("--------");
//        Set<String> set = new TreeSet<>();
//        for (int i = 0; i < 100; i++) {
//            set.add("Java");
//        }
//
//        set.add("String");
//        set.add("777");
//        set.add("Hello");
//        set.add("world");
//
//
//        System.out.println(set);
//
//        //    key    value
        Map<String, Integer> map = new HashMap<>();

        map.put("John", 53123214);
        map.put("Alice", 23123214);
        map.put("Katie", 233123214);
        map.put("Mike", 232134);
//        map.put("Mike", 77777);  <- перезаписываем


//        System.out.println(map);

        System.out.println(map.get("Alice"));

//        System.out.println(getKeyFromMap(map, 53123214));
//        System.out.println(getKeyFromMap(map, 53213214));

        Set<String> keys = map.keySet();
        Collection<Integer> values = map.values();
        System.out.println(keys);
        System.out.println(values);
    }
//
//    public static String getKeyFromMap(Map<String, Integer> map, Integer input) {
//        String result = null;
//        for (Map.Entry<String, Integer> pair : map.entrySet()) {
//            String key = pair.getKey();
//            Integer value = pair.getValue();
//
//            if(value.equals(input)) {
//                result = key;
//            }
//        }
//        return result;
//
//
    }
