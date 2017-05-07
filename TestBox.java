public class TestBox {
    Integer i;
    int j;

    public static void main (String[] args) {
        TestBox t = new TestBox();
        t.go();
    }

    public void go() {
        // Null pointer exception as wrapper objects don't get default primitive values
        j=i;
        System.out.println(j);
        System.out.println(i);
    }
}
