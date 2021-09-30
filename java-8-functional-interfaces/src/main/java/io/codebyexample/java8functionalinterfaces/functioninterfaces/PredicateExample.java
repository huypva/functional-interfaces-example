package io.codebyexample.java8functionalinterfaces.functioninterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author huypva
 */
public class PredicateExample extends AbtractExample {

  List<Integer> list = Arrays.asList(1, 4, 5, 1, 7, 8);

  public PredicateExample(String title) {
    super(title);
  }

  @Override
  public void beforeJava8() {
    Stream<Integer> stream2 = list.stream().filter(new Predicate<Integer>() {
      @Override
      public boolean test(Integer t) {
        return t % 2 == 1;
      }
    });

    stream2.forEach(new Consumer<Integer>() {
      @Override
      public void accept(Integer s) {
        System.out.print(s + "\t");
      }
    });
    System.out.println();
  }

  @Override
  public void java8() {
    Stream<Integer> stream2 = list.stream().filter(t -> {
      return t % 2 == 1;
    });

    stream2.forEach(s -> System.out.print(s + "\t"));
    System.out.println();
  }


}
