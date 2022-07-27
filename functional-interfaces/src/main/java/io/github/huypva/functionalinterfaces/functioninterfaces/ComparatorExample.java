package io.github.huypva.functionalinterfaces.functioninterfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import lombok.Getter;

/**
 * @author huypva
 */
@Getter
public class ComparatorExample extends AbtractExample {

  private List<Integer> list = Arrays.asList(1, 5, 2, 6, 3, 4, 7);

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
