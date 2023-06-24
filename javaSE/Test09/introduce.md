### API
#### String

**常用方法（15个）**

1. `charAt(int index)` 返回指定索引处的char值
2. `length()` 返回此字符串的长度
3. `isEmpty()` 当且仅当 length() 为 0 时返回 true
4. `trim()` 返回字符串的副本，忽略前导空白和尾部空白
5. `equals(Object anObject)` 将此字符串与指定的对象比较
6. `equalsIgnoreCase(String anotherString)` 将此 String 与另一个 String 比较，不考虑大小写
7. `compareTo(String anotherString)` 按字典顺序比较两个字符串
8. `compareToIgnoreCase(String str)` 按字典顺序比较两个字符串，不考虑大小写
9. `indexOf(String str)` 返回指定子字符串在此字符串中第一次出现处的索引
10. `lastIndexOf(String str)` 返回指定子字符串在此字符串中最右边出现处的索引
11. `substring(int beginIndex)` 返回一个新的字符串，它是此字符串的一个子字符串
12. `split(String regex)` 根据给定正则表达式的匹配拆分此字符串
13. `replace(char oldChar, char newChar)` 返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的
14. `replaceAll(String regex, String replacement)` 使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串
15. `replaceFirst(String regex, String replacement)` 使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串

#### StringBuilder与StringBuffer

**常用方法（16个）**

1. `append(String str)` 将指定的字符串追加到此字符序列
2. `reverse()` 将此字符序列用其反转形式取代
3. `insert(int offset, String str)` 将字符串插入此字符序列中
4. `delete(int start, int end)` 移除此序列的子字符串中的字符
5. `replace(int start, int end, String str)` 使用给定 String 中的字符替换此序列的子字符串中的字符
6. `substring(int start)` 返回一个新的 String，它包含此序列当前所包含的字符子序列
7. `substring(int start, int end)` 返回一个新的 String，它包含此序列当前所包含的字符子序列
8. `indexOf(String str)` 返回指定子字符串在此字符串中第一次出现处的索引
9. `lastIndexOf(String str)` 返回指定子字符串在此字符串中最右边出现处的索引
10. `length()` 返回长度（字符数）
11. `capacity()` 返回当前容量
12. `setLength(int newLength)` 设置字符序列的长度
13. `ensureCapacity(int minimumCapacity)` 确保容量至少等于指定的最小值
14. `charAt(int index)` 返回此序列中指定索引处的 char 值
15. `setCharAt(int index, char ch)` 将给定索引处的字符设置为 ch
16. `toString()` 返回此序列中数据的字符串表示形式

> StringBuilder和StringBuffer的方法基本是一致的。

StringBuilder与StringBuffer的区别
1. StringBuffer是线程安全的，StringBuilder是线程不安全的
2. StringBuffer是同步的，StringBuilder是非同步的
3. StringBuilder的效率比StringBuffer高
4. StringBuffer是jdk1.0提供的，StringBuilder是jdk1.5提供的

一般单线程使用StringBuilder，多线程使用StringBuffer

### 包装类
#### Integer与String

**Integer与String的相互转换**

1. `int intValue()` 将Integer转换为int
2. `static String toString(int i)` 将int转换为String
3. `static int parseInt(String s)` 将String转换为int
4. `static Integer valueOf(String s)` 将String转换为Integer
5. `static Integer valueOf(int i)` 将int转换为Integer
    > 以上方法使用Integer调用
6. `static String valueOf(int i)` 将int转换为String(使用String调用)
