package zad04;

public abstract class Duck {

    FlyBehavior flyBehavior; //Wszystkie obiekty implementujące interfejs lab01package.FlyBehavior
    QuackBehavior quackBehavior; //Wszystkie obiekty implementujące interfejs lab01package.QuackBehavior

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void swim(){
        System.out.println("Duck is swimming");
    }

    public void performFly(){
        this.flyBehavior.fly();
    }

    public void performQuack(){
        this.quackBehavior.quack();
    }

}
