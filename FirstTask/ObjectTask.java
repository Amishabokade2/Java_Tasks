public class ObjectTask{
    public static void main(String[] args) {
        ObjectTask obj =  new ObjectTask();
        obj.sayHello();

        Greeting greet = new Greeting();
        greet.sayHello();

    }

    void sayHello(){
        System.out.println("Hello");
    }
}

class Greeting{
    public void sayHello(){
        System.out.println("Hello World");

        Gratitude gratitude = new Gratitude();
        gratitude.sayThankyou();
    }
}

class Gratitude{
    public void sayThankyou(){
        System.out.println("Thank you");

        GoodBye goodBye = new GoodBye();
        goodBye.sayGoodBye();
    }
}

class GoodBye{
    public void sayGoodBye(){
        System.out.println("Good Bye");
    }
}