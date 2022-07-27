package io.github.huypva.functionalinterfaces.functioninterfaces;

import static org.junit.jupiter.api.Assertions.*;

import lombok.Getter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author huypva
 */

class ConsumerExampleTest {

  @Test
  void testConsumerInterface() {
    ConsumerExample consumerExample = new ConsumerExample("");
    consumerExample.beforeJava8();
    String beforeJava8 = consumerExample.getList().toString();
    consumerExample.java8();
    String java8 = consumerExample.getList().toString();
    Assertions.assertEquals(beforeJava8, java8);
  }
}