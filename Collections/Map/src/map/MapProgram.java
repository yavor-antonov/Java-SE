package map;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String,String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-oriented, platform independent language");
        languages.put("Python", "an interpreted, object-oriented, high-level programing language with dynamic semantics");
        languages.put("Algol","algorithmic language");
        languages.put("Basic","Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp","Therein lies madness");


        System.out.println(languages.get("Java"));
        languages.put("Java","this course is about Java");
        System.out.println(languages.get("Java"));
        System.out.println("==========================================");

//        languages.remove("Lisp");
        if (languages.remove("Algol","algorithmic language")){
            System.out.println("Algol removed");
        }else{
            System.out.println("Algol not removed");
        }

        System.out.println(languages.replace("Lisp","a functional programming language"));
        System.out.println(languages.replace("Scala","test"));

        for (String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
        languages.clear();
    }
}
