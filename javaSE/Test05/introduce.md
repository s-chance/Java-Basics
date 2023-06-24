### 集合
#### list集合的使用

**三种遍历方式**

增强for循环遍历

```java
for (Object o : list) {
    System.out.println(o);
}
```

迭代器遍历

```java
Iterator iterator = list.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

for循环遍历

```java
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}
```

**注意**

遍历对象类型时，需要重写toString方法，否则输出的是对象的地址

```java
@Override
public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
}
```

迭代器遍历时，不能使用集合对象的方法操作集合，否则会发生并发修改异常

hasNext()方法和next()方法是一对，必须同时使用

hasNext的作用是判断集合中是否还有下一个元素，如果有返回true，否则返回false

next的作用是取出集合中的下一个元素


