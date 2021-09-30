package io.codebyexample.java8functionalinterfaces.functioninterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author huypva
 */
public class ConsumerExample extends AbtractExample {

  List<String> list = Arrays.asList("a", "b", "c", "d", "e");

  public ConsumerExample(String title) {
    super(title);
  }

  @Override
  public void beforeJava8() {
    list.forEach(new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.print(s + "\t");
      }
    });
    System.out.println();
  }

  @Override
  public void java8() {
    list.forEach(s -> System.out.print(s + "\t"));
    System.out.println();
  }


}
