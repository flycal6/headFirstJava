class Player1 {
    static int playerCount;
    private String name;

    public Player1(String n) {
        name = n;
        playerCount++;
    }
}

public class PlayerTestDrive {
    public static void main(String[] args) {
        System.out.println(Player1.playerCount);
        Player1 one = new Player1("Tiger Woods");
        System.out.println(Player1.playerCount);
    }
}
