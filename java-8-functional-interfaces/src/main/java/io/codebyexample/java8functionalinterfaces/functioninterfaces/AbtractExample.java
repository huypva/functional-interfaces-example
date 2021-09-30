package io.codebyexample.java8functionalinterfaces.functioninterfaces;

/**
 * @author huypva
 */
public abstract class AbtractExample {

  String title;

  public AbtractExample(String title) {
    this.title = title;
  }

  public abstract void beforeJava8();

  public abstract void java8();

  public void runExample() {
    System.out.println(String.format("=== %s ===", title));
    System.out.println("Before Java 8:");
    beforeJava8();

    System.out.println("\nJava 8:");
    java8();
  }
}
