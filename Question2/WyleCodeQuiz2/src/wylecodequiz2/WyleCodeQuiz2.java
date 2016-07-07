/*
 WyleCodeQuiz2
 Michael Bejaniance
 */
package wylecodequiz2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WyleCodeQuiz2 {

    public static void main(String[] args) {
        List<Integer> list10 = new ArrayList<Integer>();//Defines a new List of integers called list10
        list10.add(1);//Add 1 to the list of integers called list10
        list10.add(10);//list10 contains integers 1-10 in a random order
        list10.add(4);
        list10.add(5);
        list10.add(2);
        list10.add(7);
        list10.add(3);
        list10.add(6);
        list10.add(9);
        list10.add(8);

        List<Integer> list15 = new ArrayList<Integer>();//Defines a new List of integers called list15
        list15.add(6);//Add 6 to the list of integers called list15
        list15.add(11);//list15 contains integers 6-15 in a random order
        list15.add(14);
        list15.add(12);
        list15.add(10);
        list15.add(8);
        list15.add(15);
        list15.add(13);
        list15.add(7);
        list15.add(9);
        //Print the collections and the size of the collections
        System.out.println("Collection with 1-10 in random order = " + Arrays.toString(list10.toArray()));
        System.out.println("Size of collection with 1-10 in random order = " + Integer.toString(list10.size()) + " elements");
        System.out.println("Collection with 6-15 in random order = " + Arrays.toString(list15.toArray()));
        System.out.println("Size of collection with 6-15 in random order = " + Integer.toString(list15.size()) + " elements");

        List<Integer> CombinedList = new ArrayList<Integer>();//Defines a new List of integers called CombinedList
        CombinedList.addAll(list10);//Add all of the elements from list10 to CombinedList
        CombinedList.removeAll(list15);//Remove all the elements that are in list15 from CombinedList
        CombinedList.addAll(list15);//Add all the elements that are in list15 to CombinedList
        Collections.sort(CombinedList);//Sort CombinedList in numerical order
        CombinedList.remove(7);//Remove the middle element, 7 is in the middle of 0-14

        Collections.reverse(CombinedList);//Reverse he order of CombinedList
        System.out.println("Combined collection = " + Arrays.toString(CombinedList.toArray()));
        System.out.println("Size of combined collection = " + Integer.toString(CombinedList.size()) + " elements");

        //The Map collection type was chosen because it allows for key/value pairs to be added and removed.
        //List<string> was chosen as the value type to allow for duplicate keys with different values 
        Map<Integer, List<String>> hmap = new HashMap<Integer, List<String>>();//Define a new map with Integer as the key type, and List<String> as the value type
        hmap.put(1, Arrays.asList("one"));//Add key 1, with value "one" to the map
        hmap.put(2, Arrays.asList("two"));
        hmap.put(3, Arrays.asList("three"));
        hmap.put(4, Arrays.asList("four"));
        hmap.put(5, Arrays.asList("five"));
        hmap.put(5, Arrays.asList("five", "twelve"));//Chose List<String> as the value type to allow for duplicate keys with different values
        
        Set setOfKeys = hmap.keySet();//Add the set of keys to Set setOfKeys
        
     
        Iterator iterator = setOfKeys.iterator();//Defines iterator for iterating through keys in setOfKeys

        while (iterator.hasNext()) {//While there are still keys left

            Integer key = (Integer) iterator.next();//Integer key gets the value of the next key

            List<String> value = (List<String>) hmap.get(key);//List<String> value gets the value that corresponds with key
            
            System.out.println("Key: " + key + ", Value: " + value);//Print the current key and its value(s)
            
            if(((hmap.get(key)).size()) > 1){//If the key's value has more than 1 item in the list then there is a duplicate
                System.out.println("Key: " + key + ", Value: " + value + " has a duplicate key.");
                System.out.println("Size of the collection is: "+ hmap.size() + " elements");
            }
        }

    }

}
