/*
 * Copyright (c) 1996, 2011, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package java.lang;

/**
 * The {@code Void} class is an uninstantiable placeholder class to hold a
 * reference to the {@code Class} object representing the Java keyword
 * void.
 *
 * @author  unascribed
 * @since   JDK1.1
 */
public final
class Void {  //Void类是一个不可实例化的占位符类，用于表示对Java关键字void的类对象的引用。也可用在泛型中，如需要一个返回值为void的泛型。还可用在形参中，仅仅表示占位。

    /**
     * The {@code Class} object representing the pseudo-type corresponding to
     * the keyword {@code void}.
     */
    @SuppressWarnings("unchecked")
    public static final Class<Void> TYPE = (Class<Void>) Class.getPrimitiveClass("void");  //Void的原始类型  可以用于判断某个方法的返回值是否为void：if (getClass().getMethod("foo").getReturnType() == Void.TYPE)

    /*
     * The Void class cannot be instantiated.
     */
    private Void() {}  //无法被实例化
}
