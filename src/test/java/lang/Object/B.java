package test.java.lang.Object;

/**
 * 继承类加载中，静态代码块、非静态代码块、构造方法、一般方法的执行顺序
 */
public class B extends A {

    //静态代码块1
    static {
        System.out.println("子类静态代码块1");
    }

    //静态代码块3
    static {
        System.out.println("子类静态代码块3");
    }

    //静态代码块2
    static {
        System.out.println("子类静态代码块2");
    }

    //非静态代码块1
    {
        System.out.println("子类非静态代码块1");
    }

    //非静态代码块2
    {
        System.out.println("子类非静态代码块2");
    }

    /**
     * 无参构造方法
     */
    public B() {
        System.out.println("子类无参构造方法");
    }

    /**
     * 有参构造方法
     */
    public B(int b) {
        System.out.println("子类有参构造方法");
    }

    /**
     * 一般静态方法
     */
    public static void normalStaticMethod(){
        System.out.println("子类一般静态方法");
    }

    /**
     * 一般非静态方法
     */
    @Override
    public void normalMethod(){
        System.out.println("子类一般非静态方法");
    }

    public static void main(String[] args) {
        B b = new B(1);
        normalStaticMethod();
        b.normalMethod();
    }
}
