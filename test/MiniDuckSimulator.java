package test;

import Action.FlyRocketPowered;
import Property.Duck;
import Property.MallardDuck;
import Property.ModelDuck;

public class MiniDuckSimulator
{
    public static void main(String[] args){
        Duck mallardDuck= new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

    }
}
