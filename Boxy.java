import java.io.*;

public class Boxy implements Serializable {

    private static final long serialVersionUID = 883791634941203387L;
    
    private int width;
    private int height;

    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }

    public static void main(String[] args) {
        Boxy myBox = new Boxy();
        myBox.setWidth(50);
        myBox.setHeight(20);

        try {
            FileOutputStream fs = new FileOutputStream("foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(myBox);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
