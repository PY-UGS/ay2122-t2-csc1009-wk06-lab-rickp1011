package lab6;


import java.util.*;

public class hashmap {

    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> my_map) {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer>> list
                = new LinkedList<Map.Entry<String, Integer>>(
                my_map.entrySet());

        // Sort the list using lambda expression
        Collections.sort(list, (i1, i2) -> i1.getValue().compareTo(i2.getValue()));

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    public static HashMap<String, Integer> swap(HashMap<String, Integer> my_map)
    {
        System.out.println(my_map);
        my_map.put("1",11);
        my_map.put("6",3);

        return my_map;

    }
    public static int findValue (HashMap<Integer, Integer> hashMap, int searchVal) {
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == searchVal){
                return entry.getKey();
            };
        }
        return -1;
    }
    public static void main(String[] args) {
        HashMap<String, Integer> my_map = new HashMap<String, Integer>();
        my_map.put("0", 1);
        my_map.put("1", 3);
        my_map.put("2", 5);
        my_map.put("3", 5);
        my_map.put("4", 7);
        my_map.put("5", 9);
        my_map.put("6", 11);
        my_map.put("7", 2);
        System.out.println(my_map);
        Map<String, Integer> my_map2 = sortByValue(my_map);
            System.out.println(my_map2);
        Map<String, Integer> my_map3 = swap(my_map);
        System.out.println(my_map);
        HashMap<Integer, Integer> hashMap4 = new HashMap<Integer, Integer>();
        Random random = new Random();
        for(int i =0; i < 500 ; i++){
            hashMap4.put(i,random.nextInt(1000, 9999));
        }
        int value = random.nextInt(1000, 9999);
        System.out.println("The value is "+  value);
        System.out.println("The hashmap value is "+  hashMap4);
        System.out.println("found value status "+ findValue(hashMap4, value));
    }


}

