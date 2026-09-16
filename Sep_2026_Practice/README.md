# September 2026 Java Revision

A practical Java revision notebook containing small, focused examples for core Java, problem solving, collections, strings, and object-oriented programming. Most files are standalone exercises intended to be read, modified, and run independently.

> The repository is practice material rather than a production application. Class names and a few original spelling variations are intentionally retained to preserve the progression of the revision sessions.

## What is covered

The examples currently include **103 Java source files** plus supporting notes across the following areas:

| Area | Package(s) | Examples and concepts |
| --- | --- | --- |
| Java foundations | `foundation.Maths_Problems`, `foundation.SwitchCase_Example`, `foundation.TypeCating_Example` | Variables, scope, type casting, `switch`, prime numbers, Fibonacci, factorial, Armstrong numbers, GCD, perfect numbers, powers, leap years, and number manipulation |
| Array concepts | `foundation.Arrays_Concept` | Array declarations, traversal, and arrays of objects |
| Array problems | `foundation.Arrays_Problems` | Searching, copying, sorting, rotations, two-sum, missing values, duplicate values, first/last non-repeated values, maximum sums, averages, products, and even/odd separation |
| Collections concepts | `foundation.Collections_Concept` | `ArrayList`, `HashSet`, and `HashMap` basics |
| Collections problems | `foundation.Collections_Problems` | Removing duplicates, moving zeroes, merging arrays, frequency counting, majority elements, shuffling, common elements, and partitioning values |
| String problems | `foundation.Strings` | Reversal, character separation, duplicate removal, frequency counting, anagrams, substrings, word length comparisons, swapping, whitespace cleanup, capitalization, and string conversion |
| Warmups | `foundation.Warmup` | Duplicate detection, right rotation, maximum sums, target subarrays, binary search, minimum values, and string-to-number conversion |
| Wrapper classes | `foundation.ConceptWrapperClass` | Practice with Java wrapper types and conversions such as `Integer.parseInt` |
| Exception handling | `foundation.conceptExeception` | Notes on `try`, `catch`, `finally`, `throw`, `throws`, checked exceptions, unchecked exceptions, and catch ordering |
| Classes and objects | `oops.Class_Method_Obj` | Basic classes, methods, objects, and simple domain examples |
| Constructors | `oops.Concepts_Constructer` | Default and parameterized constructors and object initialization |
| Encapsulation | `oops.Concepts_Encapsulation` | Private state with getters and setters using a `Bank` example |
| Inheritance | `oops.Concepts_Inheritance` | Parent-child relationships and inherited behavior |
| Abstraction | `oops.ConceptAbstraction` | Abstract-class and abstract-behavior notes and examples |
| Overloading and overriding | `oops.Concepts_MethodOverLoading_Riding` | Compile-time overloading, runtime overriding, and static method hiding |
| `super` keyword | `oops.SuperkeyWord` | Parent constructors, methods, fields, and initialization behavior |
| Access and final keywords | `oops.AccessModifiers`, `oops.finalKeyWord` | Access control and the use of `final` |
| Interfaces | `oops.interfaceConcepts` | Interface notes, differences, and implementation examples |

## Project structure

```text
Sep_2026_Practice/
├── pom.xml
├── README.md
└── src/
    └── main/
        └── java/
            ├── foundation/
            │   ├── Arrays_Concept/
            │   ├── Arrays_Problems/
            │   ├── Collections_Concept/
            │   ├── Collections_Problems/
            │   ├── ConceptWrapperClass/
            │   ├── Maths_Problems/
            │   ├── Strings/
            │   ├── SwitchCase_Example/
            │   ├── TypeCating_Example/
            │   ├── Warmup/
            │   └── conceptExeception/
            └── oops/
                ├── AccessModifiers/
                ├── Class_Method_Obj/
                ├── ConceptAbstraction/
                ├── Concepts_Constructer/
                ├── Concepts_Encapsulation/
                ├── Concepts_Inheritance/
                ├── Concepts_MethodOverLoading_Riding/
                ├── SuperkeyWord/
                ├── finalKeyWord/
                └── interfaceConcepts/
```

## Getting started

### Prerequisites

- JDK 21, as configured in `pom.xml`
- Maven 3.9 or newer for the Maven workflow
- An IDE such as IntelliJ IDEA, Eclipse, or Visual Studio Code with Java support

### Compile with Maven

From the repository root:

```bash
cd Sep_2026_Practice
mvn clean test
```

This is a collection of standalone examples and does not currently contain a JUnit test suite. Maven is still useful for compiling the project and checking that the source tree is wired correctly.

### Run an individual exercise

Run any class that contains a `main` method. For example:

```bash
cd Sep_2026_Practice
mkdir -p out
javac -d out src/main/java/foundation/Maths_Problems/Test003_PrimeNumberCheck.java
java -cp out foundation.Maths_Problems.Test003_PrimeNumberCheck
```

For examples that depend on other source files, compile the complete source tree through Maven or configure `src/main/java` as the source root in your IDE.

## Suggested revision order

1. Begin with variables, scope, type casting, wrapper classes, and `switch` statements.
2. Practice the mathematical problems to strengthen loops, conditions, arithmetic, and input reasoning.
3. Move to array concepts and array problems, then compare direct solutions with techniques such as binary search and sliding-window-style scans.
4. Study strings and collections, focusing on indexing, mutability, equality, frequency counting, and duplicate handling.
5. Study classes, objects, constructors, encapsulation, access modifiers, and `final`.
6. Finish the object-oriented section with inheritance, abstraction, interfaces, overloading, overriding, and the `super` keyword.
7. Re-run each exercise with different inputs and add edge cases such as empty values, single-element arrays, duplicates, negative numbers, and already-sorted data.

## Practice approach

For each exercise, first write down the expected output and trace the program line by line. Then change the input and test an edge case. Once the result is correct, revisit the implementation for readability and consider whether the algorithm or data structure can be simplified.

The repository contains both executable Java examples and plain-text revision notes. The notes under `src/main/java` are intentionally kept near the related examples so that conceptual reminders and code can be studied together.

## Repository navigation

- [Repository](https://github.com/Sameer-Programmer/2026_Sep_Java_Rivision)
- [Java source tree](./src/main/java)
- [Maven configuration](./pom.xml)

## Current limitations

- There are no automated unit tests yet; `mvn test` primarily serves as a compilation check.
- Some filenames and package names retain historical spelling and capitalization choices from the practice sessions.
- No license file is currently included. Add an appropriate license before redistributing the code publicly or incorporating it into another project.

---

<div align="center">
  <sub>Built as a practical Java revision notebook.</sub>
</div>
