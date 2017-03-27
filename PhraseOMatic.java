public class PhraseOMatic {
    public static void main(String[] args) {

        // three word arrays to choose from
        String[] wordListOne = {"24/7", "multi-Teir", "30.000 foot", "B-to-B", "win-win", "frontend",
        "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};

        String[] wordlistTwo = {"empowered", "sticky", "value-added", "oriented", "centric",
        "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked",
        "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};

        String[] wordListThree = {"process","tippingpoint","solution","architecture",
        "core competency","strategy","mindshare","portal","space","vision","paradigm","mission"};

        // find how many words in each list
        int oneLength = wordListOne.length;
        int twoLength = wordlistTwo.length;
        int threeLength = wordListThree.length;

        // three random numbers
        int rand1 = (int)(Math.random()*oneLength);
        int rand2 = (int)(Math.random()*twoLength);
        int rand3 = (int)(Math.random()*threeLength);

        // build a phrase
        String phrase = wordListOne[rand1] + " " + wordlistTwo[rand2] + " " + wordListThree[rand3];

        // print the phrase
        System.out.println("What we need is a " + phrase);
    }
}
