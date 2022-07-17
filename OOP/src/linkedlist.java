import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("dd");
        System.out.println(list.iterator().next());
        System.out.println(list.getFirst().hashCode());
        list.set(0,"ss");
        list.add("ds");
        list.add("da");
        list.add("dv");
        list.add("dx");
        list.add("w");
        list.add("dt");
        list.add("y");
        System.out.println(list.listIterator(2).next());
        System.out.println(list.listIterator(4).next());
        System.out.println(list.listIterator(1).next());

    }
}
