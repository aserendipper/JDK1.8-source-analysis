/*
 * Copyright (c) 1994, 2011, Oracle and/or its affiliates. All rights reserved.
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
 * The abstract class {@code Number} is the superclass of platform
 * classes representing numeric values that are convertible to the
 * primitive types {@code byte}, {@code double}, {@code float}, {@code
 * int}, {@code long}, and {@code short}.
 *
 * The specific semantics of the conversion from the numeric value of
 * a particular {@code Number} implementation to a given primitive
 * type is defined by the {@code Number} implementation in question.
 *
 * For platform classes, the conversion is often analogous to a
 * narrowing primitive conversion or a widening primitive conversion
 * as defining in <cite>The Java&trade; Language Specification</cite>
 * for converting between primitive types.  Therefore, conversions may
 * lose information about the overall magnitude of a numeric value, may
 * lose precision, and may even return a result of a different sign
 * than the input.
 *
 * See the documentation of a given {@code Number} implementation for
 * conversion details.
 *
 * @author      Lee Boynton
 * @author      Arthur van Hoff
 * @jls 5.1.2 Widening Primitive Conversions
 * @jls 5.1.3 Narrowing Primitive Conversions
 * @since   JDK1.0
 */
public abstract class Number implements java.io.Serializable {  //数值类型包装类的共同祖先，声明了各种包装类型的拆箱方法
    /**
     * Returns the value of the specified number as an {@code int},
     * which may involve rounding or truncation.
     *
     * @return  the numeric value represented by this object after conversion
     *          to type {@code int}.
     */
    public abstract int intValue();  //以int形式返回当前对象的值

    /**
     * Returns the value of the specified number as a {@code long},
     * which may involve rounding or truncation.
     *
     * @return  the numeric value represented by this object after conversion
     *          to type {@code long}.
     */
    public abstract long longValue();  //以long形式返回当前对象的值

    /**
     * Returns the value of the specified number as a {@code float},
     * which may involve rounding.
     *
     * @return  the numeric value represented by this object after conversion
     *          to type {@code float}.
     */
    public abstract float floatValue();  //以float形式返回当前对象的值

    /**
     * Returns the value of the specified number as a {@code double},
     * which may involve rounding.
     *
     * @return  the numeric value represented by this object after conversion
     *          to type {@code double}.
     */
    public abstract double doubleValue();  //以double形式返回当前对象的值

    /**
     * Returns the value of the specified number as a {@code byte},
     * which may involve rounding or truncation.
     *
     * <p>This implementation returns the result of {@link #intValue} cast
     * to a {@code byte}.
     *
     * @return  the numeric value represented by this object after conversion
     *          to type {@code byte}.
     * @since   JDK1.1
     */
    public byte byteValue() {
        return (byte)intValue();
    }  //以byte形式返回当前对象的值

    /**
     * Returns the value of the specified number as a {@code short},
     * which may involve rounding or truncation.
     *
     * <p>This implementation returns the result of {@link #intValue} cast
     * to a {@code short}.
     *
     * @return  the numeric value represented by this object after conversion
     *          to type {@code short}.
     * @since   JDK1.1
     */
    public short shortValue() {
        return (short)intValue();
    }  //以short形式返回当前对象的值

    /** use serialVersionUID from JDK 1.0.2 for interoperability */
    private static final long serialVersionUID = -8742448824652078965L;
}
