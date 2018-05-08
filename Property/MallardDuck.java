package Property;

import Action.FlyNoWay;
import Action.FlyWithWings;
import Action.MuteQuack;
import Action.Quack;
import Property.Duck;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("i'm a really Mallard duck");
    }
}
