import java.io.*;

class reader {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Type a character: ");
        char c = (char) br.read();
        System.out.println("You typed: " + c);
    }
}