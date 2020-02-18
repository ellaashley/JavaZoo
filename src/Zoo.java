public class Zoo {
    public static void main(String[] args){
        Tiger tigger = new Tiger("Tigger");
        Bear pooh = new Bear ("Pooh");
        Unicorn rarity = new Unicorn("Rarity");
        Giraffe gemma = new Giraffe("Gemma");
        Bee stinger = new Bee("Stinger");
        Animal[] animals = {tigger, pooh, rarity, gemma, stinger};
        Zookeeper z = new Zookeeper("Zoebot");
        z.feedAnimals(animals, "steak");
    }
    public static void sleep(String name){
        System.out.println(name +" sleeps for 8 hours");
    }
    static String favoriteFood = "bacon";
    public static void eat(String name, String food){
        System.out.println(name +" eats " +food);
        if(food.equals(favoriteFood)){
            System.out.println("YUM!!! " +name +" wants more " +food);
        }else{
            sleep(name);
        }
    }
}

