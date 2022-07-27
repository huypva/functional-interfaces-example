package io.github.huypva.functionalinterfaces.methodreference;

/**
 * @author huypva
 */
public class MethodReferenceExample {

  public String action(String a, String b, MyFunction func) {
    return func.doSomething(a, b);
  }

  public void runExample() {
    System.out.println("=== Test MethodReference ===");
    String s1 = "a";
    String s2 = "b";
    String s3 = action(s1, s2, Combine::combine);
    System.out.println(s3);
  }

}
