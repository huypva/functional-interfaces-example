package io.codebyexample.java8functionalinterfaces.functioninterfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author huypva
 */
public class ComparatorExample extends AbtractExample {

  List<Integer> list = Arrays.asList(1, 5, 2, 6, 3, 4, 7);

  public ComparatorExample(String title) {
    super(title);
  }

  @Override
  public void beforeJava8() {
    Collections.sort(list, new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
      }
    });

    System.out.println(list);
  }

  @Override
  public void java8() {
    Collections.sort(list, (o1, o2) -> o1.compareTo(o2));

    System.out.println(list);
  }

}
