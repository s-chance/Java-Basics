### 多线程
多个线程并发执行

**并发和并行**

并发:同一时刻,多个指令在单个CPU上交替执行

并行:同一时刻,多个指令在多个CPU上同时执行

**多线程创建与使用**

继承Thread类，并重写run方法，然后使用start方法调用

或者使用匿名内部类调用一次

**常用方法**

1. start() 启动当前线程，调用当前线程的run方法
2. run() 通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中
3. getName() 获取当前线程的名字
4. setName() 设置当前线程的名字
5. currentThread() 静态方法，返回当前代码执行的线程
6. yield() 释放当前CPU的执行权
7. join() 在线程a中调用线程b的join方法，此时线程a进入阻塞状态，直到线程b完全执行完后，线程a才结束阻塞状态
8. sleep() 让当前线程睡眠指定的毫秒数
9. isAlive() 判断当前线程是否存活

**线程优先级**

1. MAX_PRIORITY 10
2. MIN_PRIORITY 1
3. NORM_PRIORITY 5
4. getPriority() 获取线程的优先级
5. setPriority() 设置线程的优先级
6. 优先级高的线程抢占优先级低的线程的CPU执行权，但是只是从概率上讲，高优先级的线程高概率的情况下被执行
7. 线程优先级的继承性，A线程启动B线程，那么B线程的优先级和A线程的优先级一样

**线程调度**

调度方式:分时调度模型  抢占式调度模型(java所使用的模型)

存在随机性，相关方法有getPriority和setPriority

**多线程创建**

方式二:实现Runnable接口,需要Thread类的构造器

线程安全问题(待解决)





