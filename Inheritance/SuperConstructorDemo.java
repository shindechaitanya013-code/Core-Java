import java.io.*;

class Sample1{
    int k;
    
    Sample1(int i){
        k = i;
    }
}

class Sample2 extends Sample1{
    int l;

    Sample2(int i, int j){
        super(i);
        l = j;
    }
}

class SuperConstructorDemo{
    public static void main(String args[]){
        Sample2 s2 = new Sample2(11,12);

        System.out.println("Value of i in the class Sample2: "+s2.k);
        System.out.println("Value of j in the class Sample2: "+s2.l);
    }    
}
