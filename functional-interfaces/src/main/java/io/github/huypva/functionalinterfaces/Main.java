package io.github.huypva.functionalinterfaces;

import io.github.huypva.functionalinterfaces.functioninterfaces.ComparatorExample;
import io.github.huypva.functionalinterfaces.functioninterfaces.ConsumerExample;
import io.github.huypva.functionalinterfaces.functioninterfaces.FunctionExample;
import io.github.huypva.functionalinterfaces.functioninterfaces.PredicateExample;
import io.github.huypva.functionalinterfaces.functioninterfaces.SupplierExample;
import io.github.huypva.functionalinterfaces.methodreference.MethodReferenceExample;

/**
 * @author huypva
 */
public class Main {

  public static void main(String[] args) {
    //Function interfaces
    new ConsumerExample("Test Consumer").runExample();
    new ComparatorExample("Test Comparator").runExample();
    new FunctionExample("Test Function").runExample();
    new PredicateExample("Test Predicate").runExample();
    new SupplierExample("Test Supplier").runExample();

    //Method reference
    new MethodReferenceExample().runExample();
  }
}
