public class Bee extends Animal {

    public Bee(String name){
        super(name, "pollen");
    }

    public void eat(String food) {
        System.out.println(this.name +" eats " +food);
        if(food.equals(favoriteFood)){
            System.out.println("YUM!!! " +this.name +" wants more " +food);
            this.sleep();
        }else{
            System.out.println("YUCK!!! " +this.name +" will not eat " +food);
        }
    }

    public void sleep(){
        System.out.println(this.name +" never sleeps");
    }
}
