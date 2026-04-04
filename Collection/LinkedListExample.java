import java.util.*;

class LinkedListExample{
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        list.addFirst(5);
        list.addLast(40);

        System.out.println("After adding: " + list);

        list.remove(2);

        System.out.println("After removal: " + list);
    }
}
