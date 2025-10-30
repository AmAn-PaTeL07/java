import java.io.*;

public class reader3 {
    public static void main(String[] args) {
        try {
            File fl = new File("C:\\papa.txt");  
            BufferedReader br = new BufferedReader(new FileReader(fl));
            
            String str;
            System.out.println("File content:\n");
            while ((str = br.readLine()) != null) {  // Read until EOF
                System.out.println(str);
            }
            
            br.close();  // Always close the stream
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
