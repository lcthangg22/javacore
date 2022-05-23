package demo_lambda;


@FunctionalInterface
interface Hello {
    void sayHello();
}

@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class DemoLambda {
    public static void main(String[] args) {
        Hello h = () -> System.out.println("Xin chào các bạn");
        h.sayHello();

        Greeting g = (name) -> System.out.println("Xin chào " + name);
        g.sayHello("A");
        g.sayHello("B");

    }
}
