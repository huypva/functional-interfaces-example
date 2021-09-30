package io.codebyexample.java8functionalinterfaces.functioninterfaces;

import java.util.function.Supplier;

/**
 * @author huypva
 */
public class SupplierExample extends AbtractExample {

  public SupplierExample(String title) {
    super(title);
  }

  public void println(Supplier<String> supp) {
    System.out.println(supp.get());
  }

  @Override
  public void beforeJava8() {
    println(new Supplier<String>(){

      @Override
      public String get() {
        return "Example";
      }
    });
  }

  @Override
  public void java8() {
    println(() -> "Example");
  }
}
