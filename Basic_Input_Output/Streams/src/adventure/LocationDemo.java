package adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LocationDemo {
    private static Locations locations = new Locations();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String,String> vocabulary = new HashMap<String,String>();
        vocabulary.put("QUIT","Q");
        vocabulary.put("NORTH","N");
        vocabulary.put("SOUTH","S");
        vocabulary.put("EAST","E");
        vocabulary.put("WEST","W");

        int loc = 64;
//        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = sc.nextLine().toUpperCase();

            direction = checkInput(direction);
            if (direction.equals("invalid")){
                System.out.println("Invalid direction");
            }else{
                if (exits.containsKey(direction)) {
                    loc = exits.get(direction);
                } else {
                    System.out.println("You cannot go in that directions");
                }
            }


        }


    }
    private static String checkInput(String input){
        if (input.contains("WEST")||input.contains("W")){
            return "W";
        }
        if (input.contains("EAST")||input.contains("E")){
            return "E";
        }
        if (input.contains("NORTH")|| input.contains("N")){
            return "N";
        }
        if (input.contains("SOUTH")||input.contains("S")){
            return "S";
        }
        if (input.contains("QUIT")||input.contains("Q")){
            return "Q";
        }
        return "invalid";
    }
}






