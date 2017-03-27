class PoolPuzzleOne {
    public static void main(String[] args) {
        /**
         * Try to get output of:
         *
         * a noise
         * annoys
         * an oyster
         *
         * using only the available snippets
         */

        int x = 0;

        while (x < 4) {

            System.out.print("a");
            if (x < 1) {
                System.out.print(" ");
            }
            System.out.print("n");

            if (x > 1) {
                System.out.print(" oyster");
                x = x + 2;
            }

            if (x == 1) {
                System.out.print("noys");
            }

            if (x < 1) {
                System.out.print("oise");
            }

            System.out.println("");
            x = x + 1;
        }
    }
}
// I had to look to get oyster to print
// I wasn't putting the last thing I wanted as the first and toughest 'if' statement.
