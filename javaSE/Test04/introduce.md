### 异常处理
#### 自定义异常提示

```java
public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
```

#### 自定义异常使用

```java
public class Test {
    public static void main(String[] args) {
        try {
            throw new MyException("自定义异常");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
```

#### 异常处理的方式

1. try-catch-finally

   ```java
   try {
       // 可能出现异常的代码
   } catch (Exception e) {
       // 异常处理
   } finally {
       // 无论是否出现异常都会执行的代码
   }
   ```
   
2. throws

   ```java
    public void method() throws Exception {
         // 可能出现异常的代码
    }
    ```
   
3. throw

    ```java
    throw new Exception("异常信息");
    ```
   
#### 异常的分类

1. Error：错误，是程序无法处理的错误，表示运行应用程序中较严重问题，大多数错误与代码编写者执行的操作无关，而表示代码运行时 JVM（Java 虚拟机）出现的问题。例如，Java 虚拟机运行错误（Virtual MachineError），当 JVM 不再有继续执行操作所需的内存资源时，将出现 OutOfMemoryError。这些异常发生时，Java虚拟机（JVM）一般会选择线程终止。

2. Exception：异常，是程序本身可以处理的异常，表示程序运行过程中出现的意外情况，可能会影响程序的正常运行，需要捕获并处理。例如，NullPointerException 指针异常，当应用程序试图在需要对象的地方使用 null 时，抛出该异常。这个异常在 Java 应用程序中经常遇到，但如果小心地比较避免，就可以减少出现这种异常的机会。

#### 异常的处理原则

1. 多个异常分别处理
   
2. 多个异常一次捕获，多次处理
   
3. 多个异常一次捕获，一次处理
   
4. 运行时异常可以不处理

5. finally 代码块是无论是否出现异常都会执行的代码
   
6. 如果 catch 里面有 return 语句，finally 仍然会执行
   
7. try-catch-finally 可以嵌套


   
