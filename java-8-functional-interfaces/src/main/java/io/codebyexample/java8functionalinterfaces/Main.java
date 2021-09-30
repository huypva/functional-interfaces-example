package io.codebyexample.java8functionalinterfaces;

import io.codebyexample.java8functionalinterfaces.functioninterfaces.ComparatorExample;
import io.codebyexample.java8functionalinterfaces.functioninterfaces.ConsumerExample;
import io.codebyexample.java8functionalinterfaces.functioninterfaces.FunctionExample;
import io.codebyexample.java8functionalinterfaces.functioninterfaces.PredicateExample;
import io.codebyexample.java8functionalinterfaces.functioninterfaces.SupplierExample;
import io.codebyexample.java8functionalinterfaces.methodreference.MethodReferenceExample;

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
