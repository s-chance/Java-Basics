### IO流

**字节流的使用**

读写操作
```java
// 字节流读写
FileInputStream fis = new FileInputStream("a.txt");
FileOutputStream fos = new FileOutputStream("b.txt");
int ch;
while ((ch = fis.read()) != -1) {
    fos.write(ch);
}
fis.close();
fos.close();
```

**字符流与字节流使用区别**

1. 字符流可以直接读取中文汉字，而字节流在处理的时候会出现中文乱码
2. 字符流只能处理文本文件，不能处理图片或者视频等非文本文件
3. 字节流可以处理任意类型的文件
4. 字符流底层是字节流，当读取文件的时候，会先读取字节，然后再将字节转换为字符，即“解码”，所以字符流的效率比字节流低
5. 字节流底层是字节流，当写入文件的时候，会先将字符转换为字节，即“编码”，然后再写入文件，所以字节流的效率比字符流高
6. 一般来说，文本文件使用字符流，非文本文件使用字节流
7. 文本文件：.txt、.html、.java、.cpp、.c、.js、.css、.xml、.bat、.sh
8. 非文本文件：.jpg、.avi、.mp3、.mp4、.doc、.ppt、.xls、.pdf、.zip

字节流图片复制操作
字节流视频复制操作

**缓冲流的使用**

```java
// 字节缓冲流读写
BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("b.txt"));
int ch;
while ((ch = bis.read()) != -1) {
    bos.write(ch);
}
bis.close();
bos.close();
```

```java
// 字符缓冲流读写
BufferedReader br = new BufferedReader(new FileReader("a.txt"));
BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
int ch;
while ((ch = br.read()) != -1) {
    bw.write(ch);
}
br.close();
bw.close();
```

**缓冲流的特殊方法**

```java
// 字符缓冲流特殊方法
BufferedReader br = new BufferedReader(new FileReader("a.txt"));
BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
String line;
while ((line = br.readLine()) != null) {
    bw.write(line);
    bw.newLine();
    bw.flush();
}
br.close();
bw.close();
```

1. readLine()方法读取一行数据，但是不读取换行符号  
2. newLine()方法写入一个换行符号，可以针对不同的操作系统进行换行
3. flush()方法刷新缓冲区，将数据刷新到目的地中
4. flush的作用是为了提高写入的效率，减少写入的次数
5. readLine()、newLine()、flush()方法是缓冲流特有的方法，不能被其他字符流所调用

**flush()方法和close()方法的区别**

1. close()方法在关闭流之前会先刷新缓冲区，然后再关闭流，所以close()方法可以不用调用flush()方法
2. flush()方法刷新缓冲区，流对象还可以继续使用
3. close()方法刷新缓冲区，流对象不可以再被使用


**缓冲流的作用**

1. 缓冲流可以提高读写的效率
2. 缓冲流会自动将数据刷新到目的地中
3. 缓冲流可以一次读写一行数据
4. 缓冲流可以读写基本数据类型和字符串

**IO流换行问题**

1. 换行符号
    * windows：\r\n
    * linux：\n
    * mac：\r
2. 换行方法
    * newLine()方法
    * \n

**转换流**

InputStreamReader将一个字节输入流转换为字符输入流

OutputStreamWriter将一个字符输出流转换为字节输出流

```java
// 转换流读写
InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"));
OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("b.txt"));
int ch;
while ((ch = isr.read()) != -1) {
    osw.write(ch);
}
isr.close();
osw.close();
```

**转换流的作用**

转换流主要用于网络编程中的数据传输，可以将字节流转换为字符流，方便我们对数据进行操作
> 在网络编程中，数据传输的最小单位是字节，下载的文件数据都是以字节为单位的二进制数据，但具体的操作是以字符为单位的，所以需要将字节流转换为字符流，方便我们对数据进行操作

