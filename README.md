<div align="center">
    <img src="./assets/images/functional_interface.png"/>
</div>


## Project structure
```
.
├── functional-interfaces
│   ├── pom.xml
│   ...
├── pom.xml
|
└── README.md
```

## Start project

```shell script
$ mvn clean package
$ java -jar ./java-8-functional-interfaces/target/java-8-functional-interfaces-0.0.1-SNAPSHOT.jar
```

Output:

```shell script
=== Test Consumer ===
Before Java 8:
a       b       c       d       e       

Java 8:
a       b       c       d       e       
=== Test Comparator ===
Before Java 8:
[1, 2, 3, 4, 5, 6, 7]

Java 8:
[1, 2, 3, 4, 5, 6, 7]
=== Test Function ===
Before Java 8:
A       C       B       D       E       

Java 8:
A       C       B       D       E       
=== Test Predicate ===
Before Java 8:
1       3       5       

Java 8:
1       3       5       
=== Test Supplier ===
Before Java 8:
Example

Java 8:
Example
=== Test MethodReference ===
a-b
```

## Contribute

## Reference