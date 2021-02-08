package test.java.lang.Object;

/**
 * 单独类加载中，静态代码块、非静态代码块、构造方法、一般方法的执行顺序
 */
public class A {

    //静态代码块1
    static {
        System.out.println("父类静态代码块1");
    }

    //静态代码块3
    static {
        System.out.println("父类静态代码块3");
    }

    //静态代码块2
    static {
        System.out.println("父类静态代码块2");
    }

    //非静态代码块2
    {
        System.out.println("父类非静态代码块2");
    }

    //非静态代码块1
    {
        System.out.println("父类非静态代码块1");
    }

    /**
     * 无参构造方法
     */
    public A() {
        System.out.println("父类无参构造方法");
    }

    /**
     * 有参构造方法
     */
    public A(int a) {
        System.out.println("父类有参构造方法");
    }

    /**
     * 一般静态方法
     */
    public static void normalStaticMethod(){
        System.out.println("父类一般静态方法");
    }

    /**
     * 一般非静态方法
     */
    public void normalMethod(){
        System.out.println("父类一般非静态方法");
    }

    public static void main(String[] args) {
        A a = new A(1);
        a.normalMethod();
        normalStaticMethod();
    }

}
