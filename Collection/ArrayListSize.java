import java.util.ArrayList;

public class ArrayListSize 
{
    public static void main(String args[]){
        ArrayList<Integer> primeno = new ArrayList<>();

        primeno.add(2);
        primeno.add(3);
        primeno.add(5);
        primeno.add(7);
        System.out.println("ArrayList: "+primeno);

        int size = primeno.size();
        System.out.println("Length of ArrayList is: "+size);
    }
}
