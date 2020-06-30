package Animals;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bark(){
        System.out.println("WAF WAF");
    }

    public void beg(){
        System.out.println("kieuw kiew");
    }

    public void chase(){
        System.out.println("Grrrr Grrr");
    }

    public void react(String command){
        switch (command){
            case "speak": {
                bark();
                break;
            }
            case "beg": {
                beg();
                break;
            }
            case "look, the postman": {
                chase();
                break;
            }
        }
    }
}
