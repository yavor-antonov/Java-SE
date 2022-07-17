import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Demo{
    public static void main(String[] args) {
        Map<String,Integer> dumi = new HashMap<>();
        String text ="So, hash tables are a good way to store and access key-value pairs quickly." +
                " In this example we used the same key as the value, but in real world hash tables the keys aren't so limited. " +
                "Hash functions will work on the keys to generate an index, and then the key/value can be stored at that index. " +
                "Hash tables aren't really meant to be iterated through, although it's possible to do so. " +
                "As you can see, hash tables can have lots of blank spaces, and iterating through them would be a waste of time." +
                " Even if the hash table has logic for skipping blank space lookups in its iterator, " +
                "you would be better suited using a data structure that is designed for iterators, like linked lists.";

        String [] razbitText =text.split("([-,./\\s]+)" );
        for (String t:razbitText){
            if (dumi.containsKey(t.toLowerCase())){
              int x = dumi.get(t.toLowerCase());
                dumi.replace(t.toLowerCase(),x+1);
            }else{
                dumi.put(t.toLowerCase(),1);
            }

        }
        for (Map.Entry entry: dumi.entrySet()){

        }
        System.out.println(dumi.entrySet());
        System.out.println(dumi.values());
    }

}
