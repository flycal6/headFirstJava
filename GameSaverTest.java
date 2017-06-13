import java.io.*;

public class GameSaverTest {
    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50, "Elf", new String[] {"bow", "sword", "dust"});
        GameCharacter two = new GameCharacter(200, "Troll", new String[] {"bare hands", "big ax"});
        GameCharacter three = new GameCharacter(120, "Magician", new String[] {"spells", "invisibility"});

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();

            System.out.println("One's saved type: " + one.getType());
            System.out.println("Two's saved type: " + two.getType());
            System.out.println("Three's saved type: " + three.getType());
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        one = null;
        two = null;
        three = null;

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
            GameCharacter oneRestore = (GameCharacter) is.readObject();
            GameCharacter twoRestore = (GameCharacter) is.readObject();
            GameCharacter threeRestore = (GameCharacter) is.readObject();

            System.out.println("One's restored type: " + oneRestore.getType());
            System.out.println("Two's restored type: " + twoRestore.getType());
            System.out.println("Three's restored type: " + threeRestore.getType());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

class GameCharacter implements Serializable {
    private static final long serialVersionUID = -963801666295510543L;

    int power;
    String type;
    String [] weapons;

    public GameCharacter(int p, String t, String[] w) {
        power = p;
        type = t;
        weapons = w;
    }

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }

    public String getWeapons() {
        String weaponList = "";

        for (int i = 0; i < weapons.length; i++) {
            weaponList += weapons[i] + " ";
        }
        return weaponList;
    }
}
