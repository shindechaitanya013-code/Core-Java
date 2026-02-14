import java.util.ArrayList;

public class ArrayListIndex {
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(62);
        numbers.add(13);
        numbers.add(144);
        System.out.println("Number ArrayList: "+numbers);

        int position1 = numbers.indexOf(13);
        System.out.println("Index of 13: "+position1);

        int position2 = numbers.indexOf(10);
        System.out.println("Index of 50: "+position2);
    }
}
