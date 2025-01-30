# Introduction to Java

Java is a class-based, **object-oriented programming language** that is designed to have as few implementation dependencies as possible. It is intended to let application developers **Write Once and Run Anywhere (WORA)**, meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.
**J**ava was developed by **James Gosling** at **Sun Microsystems Inc**. in **May 1995** and **later acquired by Oracle Corporation** and is widely used for developing applications for desktop, web, and mobile devices.

Java is known for its simplicity, robustness, and security features, making it a popular choice for enterprise-level applications. Java applications are compiled to byte code that can run on any Java Virtual Machine. The syntax of Java is similar to C/C++.

Java makes writing, compiling, and debugging programming easy. It helps to create reusable code and modular programs.

## How Java Works?

![How Java Works](image.png)

Here’s a structured summary of "How Java Works" based on notes:

---

1. **Programmer Writes Code**

   - Creates a `.java` file (e.g., `Hello.java`) containing the Java code.
   - **Key Requirement**: The file must have a `main` method as the entry point.

   <aside>
   ℹ️

   Signature: "public static void main(String[] args)"

   </aside>

   ```java
   public static void main(String[] args) // Signature: "public static void main(String[] args)"
   ```

2. **Compilation with `javac`**
   - The **Java Compiler (`javac`)** converts `.java` code into platform-independent **bytecode** (`.class` file).
   - Example: `javac Hello.java` → generates `Hello.class`.
3. **Execution by JVM**
   - The **Java Virtual Machine (JVM)** reads the `.class` file and translates bytecode into machine-specific instructions.
   - **JRE** (Java Runtime Environment) provides libraries and the JVM to run the program.
4. **Interaction with OS & Hardware**
   - The JVM communicates with the **Operating System (OS)** to access hardware resources (CPU, memory, etc.).

---

### **Key Components**

- **JVM**: Executes bytecode; ensures "Write Once, Run Anywhere."
- **JRE**: Includes JVM + libraries for runtime execution.
- **Main Method**: Mandatory entry point with `public static void main(String[] args)` signature.
- **Parameters**: The `main` method can accept command-line arguments via `String[] args`.

## First Program in Java

```java
// Java is a Object Oriented Language so we need ot create a class, name can be anything
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

# **Variables in Java**

In Java, a **variable** is a named storage location in memory used to hold data that can be modified during program execution. Variables must be declared with a specific **data type**, which defines the kind of data they can store.

---

### **Key Concepts About Variables in Java**

1. **Declaration & Initialization**

   - **Declaration**: Specify the variable's type and name.

     ```java
     int age; // Declaration

     ```

   - **Initialization**: Assign a value to the variable.

     ```java
     age = 25; // Initialization

     ```

   - Can be done in one line:
     ```java
     String name = "Alice"; // Declaration + Initialization
     ```

2. **Data Types**
   - **Primitive Types**: Store simple values (e.g., `int`, `double`, `boolean`).
     ```java
     int count = 10;
     double price = 19.99;
     boolean isJavaFun = true;
     ```
   - **Reference Types**: Store references to objects (e.g., `String`, arrays, classes).
     ```java
     String message = "Hello, Java!";
     int[] numbers = {1, 2, 3};
     ```
3. **Types of Variables**
   - **Local Variables**:
     - Declared inside a method/block.
     - Must be initialized before use.
     ```java
     public void calculate() {
         int result = 5 + 3; // Local variable
     }
     ```
   - **Instance Variables**:
     - Declared in a class (outside methods).
     - Belong to an object; initialized with default values (e.g., `0`, `null`).
     ```java
     class Student {
         String name; // Instance variable (default: null)
     }
     ```
   - **Static Variables**:
     - Declared with `static` keyword.
     - Belong to the class (shared across all objects).
     ```java
     class School {
         static String principal = "Mr. Smith"; // Static variable
     }
     ```
4. **Variable Naming Rules**
   - Can include letters, digits, `_`, or `$` (no spaces).
   - Cannot start with a digit.
   - Case-sensitive (`age` ≠ `Age`).
   - Use camelCase for readability (e.g., `studentName`).
5. **Scope**
   - **Local Variables**: Accessible only within the method/block where they are declared.
   - **Instance Variables**: Accessible throughout the class or via objects.
   - **Static Variables**: Accessible via the class name (e.g., `School.principal`).

---

### **Example**

```java
public class Example {
    static int staticVar = 100; // Static variable
    int instanceVar = 50;       // Instance variable

    public static void main(String[] args) {
        int localVar = 10;      // Local variable
        System.out.println("Local Variable: " + localVar);
    }
}
```

---

### **Key Takeaways**

- Variables store data temporarily or permanently.
- Java is **statically typed**: Variable types are checked at compile-time.
- Always initialize local variables before use to avoid errors!

## Write a program to add two number

```java
public class Hello {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;
        int sum = num1 + num2;
        System.out.println(sum);
    }
}
```

# **Data Types in Java**

In Java, data types define the type of data a variable can hold. Java has two main categories of data types:

1. Primitive Data Types
2. Non-Primitive (Reference) Data Types

## 1. Primitive Data Types

1. Integer

   > int - 4 bytes →
   > byte - 1 bytes → Range (-2^7 to 2^7 -1)
   > short - 2 bytes
   > long - 8 bytes

   ```java
   int a = 43242;
   byte b = 127;
   short sh = 432;
   long lg = 42423423l; // For long we need to use 'l' at the end of number
   ```

2. Float

   > float - 4 bytes
   > double - 8 bytes

   ```java
   // In Java, For float we need to use 'f' at the end of number because by default every decimal value is double in java.
   float f = 5.8f;
   double d = 5.8;
   ```

3. Character

   > char - 2 byte
   > Java follow UNICODE instead of ASCII value

   ```java
   // WE need to use single quotes '' for char
   char c = 'k';
   ```

4. Boolean

   > boolean → true/false

   ```java
   boolean b = true;
   ```

## 2. Non-Primitive (Reference) Data Types
