import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Greeting {
    void sayHello();
}

class GreetingImpl implements Greeting {
    public void sayHello() {
        System.out.println("Hello!");
    }
}

public class LoggingProxy {

    public static void main(String[] args) {

        Greeting realObj = new GreetingImpl();

        Greeting proxy = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new InvocationHandler() {
                    public Object invoke(Object p, Method m, Object[] a) throws Throwable {
                        System.out.println("Calling method: " + m.getName());
                        return m.invoke(realObj, a);
                    }
                }
        );

        proxy.sayHello();
    }
}

