import java.io.*;

class WriteAFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("foo.txt");
            writer.write("hello foo!");
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
