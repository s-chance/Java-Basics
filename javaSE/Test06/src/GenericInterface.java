public interface GenericInterface<E> { //T、E等只是作为一个标识(占位符)，代表一个数据类型
    void funT(E e);

    String funST(E e,E data);
}
