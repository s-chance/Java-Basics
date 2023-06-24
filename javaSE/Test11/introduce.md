### Date类

**创建Date**	

1. 有参构造 

   ```java
   Date date = new Date(long time);
   ```

2. 无参构造

   ```java
   Date date = new Date();
   ```

**格式化**

1. SimpleDateFormat

   ```java
   SimpleDateFormat sdf = new SimpleDateFormat(String pattern);
   sdf.format(Date date);
   sdf.parse(String s);
   ```
   
2. DateFormat

   ```java
    DateFormat df = DateFormat.getDateInstance(int style);
    df.format(Date date);
    df.parse(String s);
    ```

**常用方法**

1. getTime()：获取当前时间的毫秒数
2. setTime(long time)：设置时间
3. toString()：将当前时间以字符串形式返回
4. after(Date when)：判断当前时间是否在when之后
5. before(Date when)：判断当前时间是否在when之前
6. equals(Object obj)：判断当前时间是否与obj相等
7. compareTo(Date anotherDate)：比较当前时间与anotherDate的大小
8. clone()：复制当前时间并返回
9. getHours()：获取当前时间的小时数
10. getMinutes()：获取当前时间的分钟数
11. getSeconds()：获取当前时间的秒数
12. getYear()：获取当前时间的年份
13. getMonth()：获取当前时间的月份
14. getDate()：获取当前时间的日期
15. getDay()：获取当前时间的星期数
16. setHours(int hours)：设置当前时间的小时数
17. setMinutes(int minutes)：设置当前时间的分钟数
18. setSeconds(int seconds)：设置当前时间的秒数
19. setYear(int year)：设置当前时间的年份
20. setMonth(int month)：设置当前时间的月份
21. setDate(int date)：设置当前时间的日期
22. setDay(int day)：设置当前时间的星期数
23. parse(String s)：将字符串s解析为Date对象

### Calendar类

**创建Calender**

getInstance()：获取当前时间的Calendar对象

**常用方法**

1. get(int field)：获取当前时间的field字段的值
2. set(int field, int value)：设置当前时间的field字段的值为value
3. add(int field, int amount)：将当前时间的field字段的值增加amount
4. getTime()：获取当前时间的Date对象
5. setTime(Date date)：设置当前时间为date

**Date与Calendar相互转换**

```java
Date date = calendar.getTime();
calendar.setTime(date);
```

**Date偏移量问题**

```java
Date date = new Date(2020, 1, 1);
System.out.println(date); // Wed Feb 01 00:00:00 CST 3920
```

> 这是因为Date类中的年份是从1900年开始的，月份是从0开始的，所以2020年1月1日实际上是3920年2月1日。


#### LocalDate

LocalDate 是一个不可变的类，它表示默认格式(yyyy-MM-dd)的日期，我们可以使用 now() 方法来获取当前日期，也可以提供输入年份、月份和日期的输入参数来创建 LocalDate 实例。

```java
LocalDate localDate = LocalDate.now();
LocalDate localDate = LocalDate.of(int year, int month, int dayOfMonth);
```

#### LocalTime

LocalTime 是一个不可变的类，它表示默认格式(HH:mm:ss.zzz)的时间，我们可以使用 now() 方法来获取当前时间，也可以提供输入小时、分钟和秒的输入参数来创建 LocalTime 实例。

```java
LocalTime localTime = LocalTime.now();
LocalTime localTime = LocalTime.of(int hour, int minute, int second);
```

#### LocalDateTime

LocalDateTime 是一个不可变的类，它表示默认格式(yyyy-MM-ddTHH:mm:ss.zzz)的日期-时间，我们可以使用 now() 方法来获取当前日期-时间，也可以提供输入年份、月份、日期、小时、分钟和秒的输入参数来创建 LocalDateTime 实例。

```java
LocalDateTime localDateTime = LocalDateTime.now();
LocalDateTime localDateTime = LocalDateTime.of(int year, int month, int dayOfMonth, int hour, int minute, int second);
```

**常用方法**

of：创建 LocalDateTime 实例

```java
LocalDateTime localDateTime = LocalDateTime.of(int year, int month, int dayOfMonth, int hour, int minute, int second);
```

get...：获取年、月、日、时、分、秒、毫秒

```java
int year = localDateTime.getYear();
int month = localDateTime.getMonthValue();
int dayOfMonth = localDateTime.getDayOfMonth();
int hour = localDateTime.getHour();
int minute = localDateTime.getMinute();
int second = localDateTime.getSecond();
int nano = localDateTime.getNano();
```

with...：设置年、月、日、时、分、秒、毫秒

```java
LocalDateTime localDateTime = localDateTime.withYear(int year);
LocalDateTime localDateTime = localDateTime.withMonth(int month);
LocalDateTime localDateTime = localDateTime.withDayOfMonth(int dayOfMonth);
LocalDateTime localDateTime = localDateTime.withHour(int hour);
LocalDateTime localDateTime = localDateTime.withMinute(int minute);
LocalDateTime localDateTime = localDateTime.withSecond(int second);
LocalDateTime localDateTime = localDateTime.withNano(int nano);
```

plus...：增加年、月、日、时、分、秒、毫秒

```java
LocalDateTime localDateTime = localDateTime.plusYears(long years);
LocalDateTime localDateTime = localDateTime.plusMonths(long months);
LocalDateTime localDateTime = localDateTime.plusDays(long days);
LocalDateTime localDateTime = localDateTime.plusHours(long hours);
LocalDateTime localDateTime = localDateTime.plusMinutes(long minutes);
LocalDateTime localDateTime = localDateTime.plusSeconds(long seconds);
LocalDateTime localDateTime = localDateTime.plusNanos(long nanos);
```

minus...：减少年、月、日、时、分、秒、毫秒

```java
LocalDateTime localDateTime = localDateTime.minusYears(long years);
LocalDateTime localDateTime = localDateTime.minusMonths(long months);
LocalDateTime localDateTime = localDateTime.minusDays(long days);
LocalDateTime localDateTime = localDateTime.minusHours(long hours);
LocalDateTime localDateTime = localDateTime.minusMinutes(long minutes);
LocalDateTime localDateTime = localDateTime.minusSeconds(long seconds);
LocalDateTime localDateTime = localDateTime.minusNanos(long nanos);
```

**LocalDateTime、LocalDate、LocalTime 之间的转换**

toLocalDate 和 toLocalTime

```java
LocalDateTime localDateTime = LocalDateTime.now();
LocalDate localDate = localDateTime.toLocalDate();
LocalTime localTime = localDateTime.toLocalTime();
```

atDate 和 atTime

```java
LocalDate localDate = LocalDate.now();
LocalTime localTime = LocalTime.now();
LocalDateTime localDateTime = localTime.atDate(localDate);
LocalDateTime localDateTime = localDate.atTime(localTime);
```

**解析**

DateTimeFormatter设置格式并格式化

```java
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
String format = formatter.format(LocalDateTime.now());
```

> 与SimpleDateFormat不同的是，DateTimeFormatter是线程安全的。SimpleDateFormat是非线程安全的，因此不适合在多线程环境下使用。

TemporalAccessor解析字符串为LocalDateTime对象
    
    ```java
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    TemporalAccessor temporalAccessor = formatter.parse("2020-01-01 00:00:00");
    LocalDateTime localDateTime = LocalDateTime.from(temporalAccessor);
    ```

**时间戳**

toEpochSecond：获取秒数

```java
long epochSecond = localDateTime.toEpochSecond(ZoneOffset.of("+8"));
```

ofEpochSecond：获取LocalDateTime对象

```java
LocalDateTime localDateTime = LocalDateTime.ofEpochSecond(long epochSecond, int nanoOfSecond, ZoneOffset zoneOffset);
```

**比较**

isBefore：是否在指定时间之前

```java
boolean isBefore = localDateTime.isBefore(LocalDateTime.now());
```

isAfter：是否在指定时间之后

```java
boolean isAfter = localDateTime.isAfter(LocalDateTime.now());
```

isEqual：是否与指定时间相等

```java
boolean isEqual = localDateTime.isEqual(LocalDateTime.now());
```

**判断**

isLeapYear：是否是闰年

```java
boolean isLeapYear = localDateTime.toLocalDate().isLeapYear();
```

**计算时间间隔**

Period.between

```java
LocalDate localDate = LocalDate.now();
LocalDate localDate1 = LocalDate.of(2020, 1, 1);
Period period = Period.between(localDate1, localDate);
System.out.println(period.getYears()); // 0
System.out.println(period.getMonths()); // 0
System.out.println(period.getDays()); // 1
```

Duration.between

```java
LocalTime localTime = LocalTime.now();
LocalTime localTime1 = LocalTime.of(0, 0, 0);
Duration duration = Duration.between(localTime1, localTime);
System.out.println(duration.toDays()); // 0
System.out.println(duration.toHours()); // 0
System.out.println(duration.toMinutes()); // 0
System.out.println(duration.toMillis()); // 1
System.out.println(duration.toNanos()); // 1000000
```


