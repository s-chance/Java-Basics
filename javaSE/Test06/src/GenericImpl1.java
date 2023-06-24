public class GenericImpl1<E> implements GenericInterface<E> { //泛型类继承泛型接口

    //实现泛型接口的方式，
    //1.在测试类创建对象的时候指定数据类型
    //2.在接口实现类中指定数据类型

    @Override
    public void funT(E o) {
        System.out.println(o);
    }

    @Override
    public String funST(E o, E data) {
        return "success";
    }

    //泛型方法
    public E show(E e) {
        return e;
    }
}
