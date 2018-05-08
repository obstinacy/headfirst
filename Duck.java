public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){

    }
    public abstract void display();

    public void perforFly(){
        flyBehavior.fly();
    }

}
