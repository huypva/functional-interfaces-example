package io.codebyexample.java8functionalinterfaces.functioninterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author huypva
 */
public class FunctionExample extends AbtractExample {

  List<String> list = Arrays.asList("a", "c", "B", "e", "g");

  public FunctionExample(String title) {
    super(title);
  }

  @Override
  public void beforeJava8() {
    Stream<String> stream2 = list.stream().map(new Function<String, String>() {
      @Override
      public String apply(String s) {
        return s == null ? null : s.toUpperCase();
      }
    });

    stream2.forEach(new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.print(s + "\t");
      }
    });
    System.out.println();
  }

  @Override
  public void java8() {
    Stream<String> stream2 = list.stream().map(s -> s == null ? null : s.toUpperCase());

    stream2.forEach(s -> System.out.print(s + "\t"));
    System.out.println();
  }
}
