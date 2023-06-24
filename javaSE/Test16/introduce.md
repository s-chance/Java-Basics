### 网络编程

**IP和端口号**

java中以InetAddress类代表IP
 
**TCP编程(服务端+客户端)**

服务端和客户端有先后启动的顺序要求：先启动服务端,再启动客户端  

**UDP编程(接收端+发送端)**

接收端和发送端没有先后启动的顺序要求

**URL编程**

URL:统一资源定位符，对应着互联网的某一资源地址

URL的格式：http://localhost:8080/examples/beauty.jpg?username=Tom`

URL的组成：协议名、主机名、端口号、资源地址、参数列表

URI:统一资源标识符，用来唯一的标识一个资源

**URL和URI的区别**

1. URL是URI的子集，URL可以唯一的标识一个资源，而URI不一定能唯一的标识一个资源
2. URL可以定位一个资源，而URI只能标识一个资源

**tomcat的使用(linux)**

1. tomcat的安装，访问[官网](https://tomcat.apache.org/)下载，解压即可
2. tomcat的启动：终端执行`./startup.sh`，
3. tomcat的关闭：终端执行`./shutdown.sh`
4. tomcat的配置：修改`conf/server.xml`文件，修改端口号
5. tomcat的部署：将项目打包成war包，放到`webapps`目录下，启动tomcat即可
6. tomcat的日志：`logs`目录下
7. tomcat的管理：浏览器访问`http://localhost:8080/manager/html` 输入用户名和密码即可