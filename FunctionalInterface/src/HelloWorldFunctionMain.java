 
public class HelloWorldFunctionMain {
 
 public static void main(String args[])
 {
                // Lambda Expression 
  HelloWorld helloWorld=()->{System.out.println("Hello using Lambda Expression");
  System.out.println("Hello 2");
  System.out.println("Hello 3");
  for (int i =0 ; i<10; i++) {
	System.out.println(i);
}
  };
  helloWorld.sayHello();
 }
}