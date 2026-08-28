
class Animal {
    void play() {

    }

    void sound() {
    }
}


class Dog extends Animal {
    @Override
    void play() {
        System.out.println("Dog is fetching the ball!");
    }

    @Override
    void sound() {
        System.out.println("Woof! Woof!");
    }
}


class Cat extends Animal {
    @Override
    void play() {
        System.out.println("Cat is chasing a toy!");
    }

    @Override
    void sound() {
        System.out.println("Meow!");
    }
}


 class main {
    public static void main(String[] args) {
        Animal pet;

        pet = new Dog();
        pet.play();
        pet.sound();

        pet = new Cat();
        pet.play();
        pet.sound();
    }
}
