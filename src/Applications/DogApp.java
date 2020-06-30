package Applications;

import Animals.Dog;

public class DogApp {
    public static void main(String[] args) {
        // Jimmy the dog is born
        Dog jimmy = new Dog("Jimmy");

        // story
        System.out.println("Hey, look there is Jimmy");
        System.out.println("Jimmy !!");
        System.out.println(jimmy.react("speak"));
        System.out.println(jimmy.react("beg"));
        System.out.println("oh I see the postman");
        System.out.println(jimmy.react("look, the postman"));
        System.out.println("end of story.");

    }
}
