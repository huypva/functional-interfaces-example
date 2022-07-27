package io.github.huypva.functionalinterfaces.functioninterfaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author huypva
 */
class ComparatorExampleTest {

  @Test
  void testComparatorInterface() {
    ComparatorExample comparatorExample = new ComparatorExample("");
    comparatorExample.beforeJava8();
    String beforeJava8 = comparatorExample.getList().toString();
    comparatorExample.java8();
    String java8 = comparatorExample.getList().toString();
    Assertions.assertEquals(beforeJava8, java8);
  }
}