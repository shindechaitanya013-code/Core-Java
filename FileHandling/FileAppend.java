import java.io.*;

public class FileAppend{
    public static void main(String args[]){
        File f1 = new File("E:\\Github2026\\Core-Java\\File Handling\\pqr.txt");
        File f2 = new File("E:\\Github2026\\Core-Java\\File Handling\\xyz.txt");

        try{
            if(f1.exists() && f2.exists()){
                FileInputStream fin = new FileInputStream(f1);
                FileOutputStream fout = new FileOutputStream(f2,true);

                int n;
                while((n = fin.read()) != -1){
                    fout.write(n);
                }

                fin.close();c
                fout.close();

                System.out.println("File content from pqr.txt append to xyz.txt successfully.");
            }else{
                System.out.println("One or Both files do not exits");
            }
        }catch(FileNotFoundException e1){
            System.out.println("File Error: "+e1);
        
        }catch(IOException e2){
            System.out.println("I/O Error: "+e2);
        }
    }
}
