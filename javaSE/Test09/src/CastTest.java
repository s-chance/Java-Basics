public class CastTest {
    public static void main(String[] args) {
        //包装类Integer与String类的转换

        String str = "1234";

        //String转int,需确保String中的字符是数字字符
        int i = Integer.parseInt(str);
        // 或者使用Integer的valueOf方法重载
        int j = Integer.valueOf(str);
        System.out.println(i);

        //int转String，使用String的valueOf方法重载
        int a = 1212;
        String s = String.valueOf(a);
        // 或者使用Integer的toString方法重载
        String string = Integer.toString(a);
        System.out.println(s);

    }
}
