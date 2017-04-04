class Dog {
    String name;
    int size;

    public void bark() {
        if (size > 60) {
            System.out.println(name + " says 'Wooof! Wooof!'");
        } else if (size > 14) {
            System.out.println(name + " says 'Ruff! Ruff!'");
        } else {
            System.out.println(name + " says 'Yip! Yip!'");
        }
    }
}

class DogTestDrive {
    public static void main(String[] args) {
        // make a Dog object and access it
        Dog dog1 = new Dog();
        dog1.size = 70;
        dog1.bark();
        dog1.name = "Bart";

        // make a Dog array
        Dog[] myDogs = new Dog[3];
        // put some dogs in it
        myDogs[0] = new Dog();
        myDogs[0].size = 8;
        myDogs[1] = new Dog();
        myDogs[1].size = 35;
        myDogs[2] = dog1;

        // access the Dogs using the array references
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        // what is myDogs[2] name?
        System.out.println("last dog's name is " + myDogs[2].name);

        // loop through the array and tell the dogs to bark
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x += 1;
        }
    }
}
