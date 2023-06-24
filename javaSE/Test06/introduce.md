### 泛型

实际上 Java 中的泛型是伪泛型，因为 Java 在编译期间会进行类型擦除，将泛型转换为 Object 类型，所以在运行期间是不知道泛型的类型的。
> 类型擦除：在编译期间，将泛型转换为 Object 类型。

而 C++ 中的泛型是真泛型，因为 C++ 在编译期间会进行类型替换，将泛型替换为实际的类型，所以在运行期间是知道泛型的类型的。

**泛型类**

```java
public class Test06<T> {
}
```

**写法**

```java
public class Test06<T> {
    private T t;
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
}
```

**使用**

```java
public class Test06Main {
    public static void main(String[] args) {
        Test06<String> test06 = new Test06<>();
        test06.setT("hello");
        System.out.println(test06.getT());
    }
}
```

**泛型方法**

```java
public class Test06<T> {
    private T t;
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
    public <E> void print(E e) {
        System.out.println(e);
    }
}
```

**泛型接口**

```java
public interface Test06Interface<T> {
    void print(T t);
}
```

**泛型类继承泛型类**

```java
public class Test06Son<T> extends Test06<T> {
}
```

**泛型类继承非泛型类**

```java
public class Test06Son<T> extends Test06<String> {
}
```

**泛型类继承泛型接口**

```java
public class Test06Son<T> implements Test06Interface<T> {
    @Override
    public void print(T t) {
        System.out.println(t);
    }
}
```

**泛型类继承非泛型接口**

```java
public class Test06Son<T> implements Test06Interface<String> {
    @Override
    public void print(String s) {
        System.out.println(s);
    }
}
```

**泛型方法继承泛型方法**

```java
public class Test06Son<T> extends Test06<T> {
    @Override
    public <E> void print(E e) {
        System.out.println(e);
    }
}
```

**泛型方法继承非泛型方法**

```java
public class Test06Son<T> extends Test06<T> {
    @Override
    public void print(String s) {
        System.out.println(s);
    }
}
```

**泛型方法继承泛型接口**

```java
public class Test06Son<T> implements Test06Interface<T> {
    @Override
    public <E> void print(E e) {
        System.out.println(e);
    }
}
```

**泛型方法继承非泛型接口**

```java
public class Test06Son<T> implements Test06Interface<T> {
    @Override
    public void print(String s) {
        System.out.println(s);
    }
}
```

**泛型接口继承泛型接口**

```java
public interface Test06Interface<T> {
    void print(T t);
}
```

**泛型接口继承非泛型接口**

```java
public interface Test06Interface<T> extends Test06Interface2 {
    void print(T t);
}
```

**泛型接口继承泛型类**

```java
public interface Test06Interface<T> extends Test06<T> {
    void print(T t);
}
```

**泛型接口继承非泛型类**

```java
public interface Test06Interface<T> extends Test06<String> {
    void print(T t);
}
```
