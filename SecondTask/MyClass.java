public class MyClass{
    public static void main(String[] args) {

        MyMethods m = new MyMethods();

        System.out.println(m.sayHello("Hello"));

        int addition = m.add(10,20);
        System.out.println("Addition of two numbers is " + addition);

    }
}

class MyMethods{
    String sayHello(String str){
        return str;
    }

    int add(int a, int b){
        return a + b;
    }
}