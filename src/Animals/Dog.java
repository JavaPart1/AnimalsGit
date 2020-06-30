package Animals;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String bark(){
        return "WAF WAF";
    }

    public String beg(){
        return "kieuw kiew";
    }

    public String chase(){
        return "Grrrr Grrr";
    }

    public String react(String command){
        String reaction = "";
        switch (command){
            case "speak": {
                reaction = bark();
                break;
            }
            case "beg": {
                reaction = beg();
                break;
            }
            case "look, the postman": {
                reaction = chase();
                break;
            }
        }
        return reaction;
    }
}
