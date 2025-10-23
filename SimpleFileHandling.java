import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class SimpleFileHandling {
    public static void main(String args[]){
        try{
            FileWriter FW=new FileWriter("Student.text");
            FW.write("101,John,CSE\n");
            FW.write("102,Hal,CSE\n");
            FW.close();
            System.out.println("File created and data written");
            FileWriter FA=new FileWriter("Student.text",true);
            FA.write("103,BK,IT");
            FA.close();
            System.out.println("Data appended");
            BufferedReader br=new BufferedReader(new FileReader("Student.text"));
            String line;
            System.out.println("\nReading Students Records:");
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
        }catch (IOException e){
            System.out.println("Error:"+e.getMessage());
        }
        }
    }