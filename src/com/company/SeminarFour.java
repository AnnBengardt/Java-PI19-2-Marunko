package com.company;

import java.util.*;

public class SeminarFour {

    public static void main(String[] args){
        Map<Integer, String> status = new HashMap<Integer, String>();
        status.put(1, "jvndjn");
        status.put(2, "oef");

        String first = status.get(1);
        Set<Integer> keys = status.keySet();
        Collection<String> values = status.values();

        status.replace(1, "NEW");
        status.remove(2);

        for(Map.Entry<Integer, String> items:status.entrySet()){
            System.out.printf("ключ: %d, значение %s", items.getKey(), items.getValue());
        }

        Map<Integer, Person> people = new HashMap<Integer, Person>();
        people.put(1, new Person("A"));
        people.put(2, new Person("B"));

        for (Map.Entry<Integer, Person> person: people.entrySet()){
            System.out.printf("ключ: %d, значение: %s", person.getKey(), person.getValue().getName());
        }

    }

    public void frequency(String value){
        Map<Character, Integer> result = new HashMap<Character, Integer>();
        for(int i=0; i<value.length(); i++){
            char ch = value.charAt(i);
            result.compute(ch, (k, v)->v==null?1:v+1);
        }
        ArrayList<Map.Entry<Character, Integer>> listsort = new ArrayList<>(result.entrySet());
        listsort.sort((o1, o2) -> Character.compare(o1.getKey(), o2.getKey()));
        for(Map.Entry<Character, Integer> item: listsort){
            System.out.println(item.getKey() + " " + item.getValue());
        }
    }

    public static <K, V> Map<V, K> reverseMap(HashMap<? extends K, ? extends V> map_value){
        HashMap<V, K> reverse = new HashMap<V, K>();
        for (Map.Entry <? extends K, ? extends V> item : map_value.entrySet()){
            reverse.put(item.getValue(), item.getKey());
        }
        return reverse;
    }



}
