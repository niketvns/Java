# Introduction to Java

Java is a class-based, **object-oriented programming language** that is designed to have as few implementation dependencies as possible. It is intended to let application developers **Write Once and Run Anywhere (WORA)**, meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.
**J**ava was developed by **James Gosling** at **Sun Microsystems Inc**. in **May 1995** and **later acquired by Oracle Corporation** and is widely used for developing applications for desktop, web, and mobile devices.

Java is known for its simplicity, robustness, and security features, making it a popular choice for enterprise-level applications. Java applications are compiled to byte code that can run on any Java Virtual Machine. The syntax of Java is similar to C/C++.

Java makes writing, compiling, and debugging programming easy. It helps to create reusable code and modular programs.

## How Java Works?

![How Java Works](/assets/image.png)

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

   > int - 4 bytes → -2,147,483,648 to 2,147,483,647 (-2^31 to 2^31 - 1)

   > byte - 1 bytes → -128 to 127 (-2^7 to 2^7 - 1)

   > short - 2 bytes -> -32,768 to 32,767 (-2^15 to 2^15 - 1)

   > long - 8 bytes -> -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (-2^63 to 2^63 - 1)

   ```java
   int a = 43242;
   byte b = 127;
   short sh = 432;
   long lg = 42423423l; // For long we need to use 'l' at the end of number
   ```

2. Float

   > float - 4 bytes -> Approximately ±3.4 × 10^38

   > double - 8 bytes -> Approximately ±1.8 × 10^308

```java
// In Java, For float we need to use 'f' at the end of number because by default every decimal value is double in java.
float f = 5.8f;
double d = 5.8;
```

3. Character

   > char - 2 byte -> 0 to 65,535 (Unicode characters)

   > Java follow UNICODE instead of ASCII value

   ```java
   // WE need to use single quotes '' for char
   char c = 'k';
   ```

4. Boolean

   > boolean - 1byte -> true/false

   ```java
   boolean b = true;
   ```

## 2. Non-Primitive (Reference) Data Types

<!-- To be continued -->

# **Literal in Java**

A **literal** in Java is a fixed value assigned to a variable directly in the code. It represents constant values that do not change during execution.

## **Types of Literals in Java**

### **1. Integer Literals** (Whole Numbers)

- Default type: `int`
- Can be specified in **decimal (base 10), binary (base 2), octal (base 8), or hexadecimal (base 16)**

| **Format**                     | **Example**                          |
| ------------------------------ | ------------------------------------ |
| **Decimal** (Base 10)          | `int x = 100;`                       |
| **Binary** (Prefix: `0b`)      | `int bin = 0b1010; // 10 in decimal` |
| **Octal** (Prefix: `0`)        | `int oct = 012; // 10 in decimal`    |
| **Hexadecimal** (Prefix: `0x`) | `int hex = 0xA; // 10 in decimal`    |

### Example:

```java
public class IntegerLiterals {
    public static void main(String[] args) {
        int decimal = 100;
        int binary = 0b1010;
        int octal = 012;
        int hex = 0xA;

        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hex);
    }
}
```

---

### **2. Floating-Point Literals** (Decimal Numbers)

- Default type: `double`
- Use **`f` or `F`** for `float` values

| **Example**            | **Description**                |
| ---------------------- | ------------------------------ |
| `double pi = 3.14159;` | Default floating-point literal |
| `float f = 3.14f;`     | Explicitly defining a float    |

---

### **3. Character Literals**

- A **single character** enclosed in **single quotes (`'` `')**
- Can be a **Unicode character**

| **Example**                | **Description**           |
| -------------------------- | ------------------------- |
| `char ch = 'A';`           | Single character          |
| `char unicode = '\u0041';` | Unicode character for 'A' |

---

### **4. String Literals**

- A **sequence of characters** enclosed in **double quotes (`"` `")**

| **Example**                     | **Description** |
| ------------------------------- | --------------- |
| `String text = "Hello, Java!";` | Standard string |
| `String empty = "";`            | Empty string    |

---

### **5. Boolean Literals**

- Only **two possible values:** `true` or `false`

| **Example**                 | **Description** |
| --------------------------- | --------------- |
| `boolean isJavaFun = true;` | Boolean true    |
| `boolean isCold = false;`   | Boolean false   |

---

### **6. Null Literal**

- Represents an **empty object reference**

| **Example**          | **Description**        |
| -------------------- | ---------------------- |
| `String str = null;` | String with null value |

---

### **7. Underscore in Numeric Literals (Java 7+)**

- **Improves readability** for large numbers

| **Example**                | **Equivalent To** |
| -------------------------- | ----------------- |
| `int million = 1_000_000;` | `1000000`         |
| `double pi = 3.14_159;`    | `3.14159`         |

---

### **Summary Table: Java Literals**

| **Literal Type**           | **Example**              |
| -------------------------- | ------------------------ |
| **Integer Literal**        | `int num = 100;`         |
| **Floating-Point Literal** | `double pi = 3.14;`      |
| **Character Literal**      | `char letter = 'A';`     |
| **String Literal**         | `String text = "Java";`  |
| **Boolean Literal**        | `boolean isTrue = true;` |
| **Null Literal**           | `String name = null;`    |

---

### **Conclusion**

Literals in Java are **fixed values** used in programs. They include **numbers, characters, strings, and booleans**, making Java code more readable and efficient.
