//Ex 1-  Program to illustrate the use of Filewriter class 

import java.io.*;

public class FileWriterDemo{
    public static void main(String args[]) throws FileNotFoundException, IOException{

        try{
            FileWriter fw = new FileWriter("E:\\Github2026\\Core-Java\\File Handling\\xyz.txt");

            for(char i = 65; i < 91; i++){
                fw.write(i);
            }
            fw.close();
            System.out.println("File written successfully");
        }
        catch(Exception e){
            System.out.println("Exception :" +e);
        }
    }
}
