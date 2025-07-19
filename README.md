# Java 8 Features Demo

Welcome to the **Java 8 Features Demo** project! This repository includes practical examples showcasing the powerful features introduced in Java 8.

---

## ✨ Features Demonstrated

- ✅ Lambda Expressions
- ✅ Functional Interfaces
- ✅ Stream API
- ✅ Method References
- ✅ Default and Static Methods in Interfaces
- ✅ Optional Class
- ✅ New Date and Time API (`java.time`)

---

## 📂 Project Repository

Explore the complete project and code files here: 🔗 [GitHub Repository - FeatureJava8](https://github.com/ASHASALANTRY/FeatureJava8)

---

## 🚀 Getting Started

### Prerequisites

- Java JDK 8 or higher
- Terminal or Command Prompt
- (Optional) Any Java IDE like IntelliJ IDEA or Eclipse

### Compilation

```bash
javac src/*.java
```

### Execution

Run the specific demo class to test a feature:

```bash
java -cp src LambdaDemo
```

Replace `LambdaDemo` with the desired class file name.

---

## 🧠 Feature Descriptions

### 🔹 Lambda Expressions

**File**: `LambdaDemo.java`

- Simplifies anonymous class implementations.
- Example:

```java
Runnable r = () -> System.out.println("Lambda Running!");
```

### 🔹 Functional Interfaces

**File**: `FunctionalInterfaceDemo.java`

- Use of `@FunctionalInterface` and built-in interfaces like `Predicate`, `Function`, and `Consumer`.

### 🔹 Stream API

**File**: `StreamApiDemo.java`

- Functional-style operations on collections.
- Example:

```java
List<String> names = Arrays.asList("Java", "Kotlin", "Scala");
names.stream().filter(n -> n.startsWith("J")).forEach(System.out::println);
```

### 🔹 Method References

**File**: `MethodReferenceDemo.java`

- Referencing methods directly using `::` operator.

### 🔹 Optional Class

**File**: `OptionalDemo.java`

- Avoids `NullPointerException` using `Optional.ofNullable()`, `isPresent()`, and `ifPresent()`.

### 🔹 Default and Static Methods in Interfaces

**File**: `DefaultStaticInterfaceDemo.java`

- Enables default and static methods within interfaces for backward compatibility.

### 🔹 Date and Time API

**File**: `DateTimeApiDemo.java`

- Replaces outdated `Date` and `Calendar` classes with `LocalDate`, `LocalTime`, `LocalDateTime`, `Period`, `Duration`, etc.

---

## ❓ Why Java 8?

Java 8 revolutionized Java development with its move toward functional programming, reducing boilerplate code, and introducing modern programming paradigms.

---


