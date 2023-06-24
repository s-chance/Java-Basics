public class Test {
    public static void main(String[] args) {
        //泛型：避免了强制转换的问题，规范了数据类型
        //泛型类的创建
        //在创建泛型类的对象时，给定一个数据类型之后，泛型类中泛型均按照所给定的数据类型来运行

        //泛型接口以及接口的实现类

        Generic<String> gs =  new Generic<>();

        Generic<Integer> gi = new Generic<>();

        gs.setT("Hello");  //gs的泛型限制为String类型
        gi.setT(11);       //gi的泛型限制为Integer类型

        System.out.println(gs.getT());
        System.out.println();
        System.out.println(gi.getT());

        GenericInterface<String> generic1 = new GenericImpl1<>();
        System.out.println(generic1.funST("Integer","integer"));


        GenericInterface<Integer> generic2 = new GenericImpl2(); //这里可以不写<Integer>，但是不推荐
        //因为在GenericImpl2中已经指定泛型接口的数据类型，所以测试类中可以不指定数据类型。
        //但是推荐在测试类中指定数据类型，这样更加灵活
        generic2.funT(12133); //只能用Integer类型
        System.out.println(generic2.funST(1,1));

        GenericImpl1<String> g11 = new GenericImpl1<>();
        System.out.println(g11.show("aaa"));
        System.out.println(113);
        System.out.println(false);

    }
}
