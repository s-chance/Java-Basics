### File类

**构造方法**
```java
File(String pathname)
File(String parent, String child)
File(File parent, String child)
```

**绝对路径、相对路径**

绝对路径：从盘符开始的路径

相对路径：相对于当前项目的路径

**成员方法**

创建 createNewFile、mkdir、mkdirs

删除 delete

判断 isDirectory、isFile、exists

获取 getName、getPath、getAbsolutePath、length、lastModified


### IO流

字节流、字符流：字节流可以处理任意类型的文件，字符流只能处理文本文件

输入流、输出流：输入流读取文件，输出流写入文件

节点流、处理流：节点流直接与文件交互，处理流是对节点流的包装

**字符流操作 读、写**

```java
// 字符流读取
FileReader fr = new FileReader("a.txt");
int ch;
while ((ch = fr.read()) != -1) {
    System.out.print((char) ch);
}
fr.close();
```

```java
// 字符流写入
FileWriter fw = new FileWriter("a.txt");
fw.write("hello");
fw.close();
```

**字节流操作 读、写**

```java
// 字节流读取
FileInputStream fis = new FileInputStream("a.txt");
int ch;
while ((ch = fis.read()) != -1) {
    System.out.print((char) ch);
}
fis.close();
```

```java
// 字节流写入
FileOutputStream fos = new FileOutputStream("a.txt");
fos.write("hello".getBytes());
fos.close();
```




