/*
 * Copyright (c) 1996, 2013, Oracle and/or its affiliates. All rights reserved.
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
 * The {@code Short} class wraps a value of primitive type {@code
 * short} in an object.  An object of type {@code Short} contains a
 * single field whose type is {@code short}.
 *
 * <p>In addition, this class provides several methods for converting
 * a {@code short} to a {@code String} and a {@code String} to a
 * {@code short}, as well as other constants and methods useful when
 * dealing with a {@code short}.
 *
 * @author  Nakul Saraiya
 * @author  Joseph D. Darcy
 * @see     java.lang.Number
 * @since   JDK1.1
 */
public final class Short extends Number implements Comparable<Short> {  //short的包装类

    /**
     * A constant holding the minimum value a {@code short} can
     * have, -2<sup>15</sup>.
     */
    public static final short   MIN_VALUE = -32768;  //short最小值

    /**
     * A constant holding the maximum value a {@code short} can
     * have, 2<sup>15</sup>-1.
     */
    public static final short   MAX_VALUE = 32767;  //short最大值

    /**
     * The {@code Class} instance representing the primitive type
     * {@code short}.
     */
    @SuppressWarnings("unchecked")
    public static final Class<Short>    TYPE = (Class<Short>) Class.getPrimitiveClass("short");  //Short的原始类型

    /**
     * Returns a new {@code String} object representing the
     * specified {@code short}. The radix is assumed to be 10.
     *
     * @param s the {@code short} to be converted
     * @return the string representation of the specified {@code short}
     * @see java.lang.Integer#toString(int)
     */
    public static String toString(short s) {
        return Integer.toString((int)s, 10);
    }

    /**
     * Parses the string argument as a signed {@code short} in the
     * radix specified by the second argument. The characters in the
     * string must all be digits, of the specified radix (as
     * determined by whether {@link java.lang.Character#digit(char,
     * int)} returns a nonnegative value) except that the first
     * character may be an ASCII minus sign {@code '-'}
     * ({@code '\u005Cu002D'}) to indicate a negative value or an
     * ASCII plus sign {@code '+'} ({@code '\u005Cu002B'}) to
     * indicate a positive value.  The resulting {@code short} value
     * is returned.
     *
     * <p>An exception of type {@code NumberFormatException} is
     * thrown if any of the following situations occurs:
     * <ul>
     * <li> The first argument is {@code null} or is a string of
     * length zero.
     *
     * <li> The radix is either smaller than {@link
     * java.lang.Character#MIN_RADIX} or larger than {@link
     * java.lang.Character#MAX_RADIX}.
     *
     * <li> Any character of the string is not a digit of the
     * specified radix, except that the first character may be a minus
     * sign {@code '-'} ({@code '\u005Cu002D'}) or plus sign
     * {@code '+'} ({@code '\u005Cu002B'}) provided that the
     * string is longer than length 1.
     *
     * <li> The value represented by the string is not a value of type
     * {@code short}.
     * </ul>
     *
     * @param s         the {@code String} containing the
     *                  {@code short} representation to be parsed
     * @param radix     the radix to be used while parsing {@code s}
     * @return          the {@code short} represented by the string
     *                  argument in the specified radix.
     * @throws          NumberFormatException If the {@code String}
     *                  does not contain a parsable {@code short}.
     */
    public static short parseShort(String s, int radix)  //按radix进制形式将字符串s解析为short值
        throws NumberFormatException {
        int i = Integer.parseInt(s, radix);
        if (i < MIN_VALUE || i > MAX_VALUE)
            throw new NumberFormatException(
                "Value out of range. Value:\"" + s + "\" Radix:" + radix);
        return (short)i;
    }

    /**
     * Parses the string argument as a signed decimal {@code
     * short}. The characters in the string must all be decimal
     * digits, except that the first character may be an ASCII minus
     * sign {@code '-'} ({@code '\u005Cu002D'}) to indicate a
     * negative value or an ASCII plus sign {@code '+'}
     * ({@code '\u005Cu002B'}) to indicate a positive value.  The
     * resulting {@code short} value is returned, exactly as if the
     * argument and the radix 10 were given as arguments to the {@link
     * #parseShort(java.lang.String, int)} method.
     *
     * @param s a {@code String} containing the {@code short}
     *          representation to be parsed
     * @return  the {@code short} value represented by the
     *          argument in decimal.
     * @throws  NumberFormatException If the string does not
     *          contain a parsable {@code short}.
     */
    public static short parseShort(String s) throws NumberFormatException {  //按10进制形式将字符串s解析为short值
        return parseShort(s, 10);
    }

    /**
     * Returns a {@code Short} object holding the value
     * extracted from the specified {@code String} when parsed
     * with the radix given by the second argument. The first argument
     * is interpreted as representing a signed {@code short} in
     * the radix specified by the second argument, exactly as if the
     * argument were given to the {@link #parseShort(java.lang.String,
     * int)} method. The result is a {@code Short} object that
     * represents the {@code short} value specified by the string.
     *
     * <p>In other words, this method returns a {@code Short} object
     * equal to the value of:
     *
     * <blockquote>
     *  {@code new Short(Short.parseShort(s, radix))}
     * </blockquote>
     *
     * @param s         the string to be parsed
     * @param radix     the radix to be used in interpreting {@code s}
     * @return          a {@code Short} object holding the value
     *                  represented by the string argument in the
     *                  specified radix.
     * @throws          NumberFormatException If the {@code String} does
     *                  not contain a parsable {@code short}.
     */
    public static Short valueOf(String s, int radix)  //按radix进制形式将字符串s解析为short值，随后再装箱
        throws NumberFormatException {
        return valueOf(parseShort(s, radix));
    }

    /**
     * Returns a {@code Short} object holding the
     * value given by the specified {@code String}. The argument
     * is interpreted as representing a signed decimal
     * {@code short}, exactly as if the argument were given to
     * the {@link #parseShort(java.lang.String)} method. The result is
     * a {@code Short} object that represents the
     * {@code short} value specified by the string.
     *
     * <p>In other words, this method returns a {@code Short} object
     * equal to the value of:
     *
     * <blockquote>
     *  {@code new Short(Short.parseShort(s))}
     * </blockquote>
     *
     * @param s the string to be parsed
     * @return  a {@code Short} object holding the value
     *          represented by the string argument
     * @throws  NumberFormatException If the {@code String} does
     *          not contain a parsable {@code short}.
     */
    public static Short valueOf(String s) throws NumberFormatException {  //按10进制形式将字符串s解析为short值，随后再装箱
        return valueOf(s, 10);
    }

    private static class ShortCache {  //Short缓存，缓存了-128~127之间的Short对象
        private ShortCache(){}

        static final Short cache[] = new Short[-(-128) + 127 + 1];  //256个Short对象缓存，依次表示-128~127

        static {
            for(int i = 0; i < cache.length; i++)
                cache[i] = new Short((short)(i - 128));
        }
    }

    /**
     * Returns a {@code Short} instance representing the specified
     * {@code short} value.
     * If a new {@code Short} instance is not required, this method
     * should generally be used in preference to the constructor
     * {@link #Short(short)}, as this method is likely to yield
     * significantly better space and time performance by caching
     * frequently requested values.
     *
     * This method will always cache values in the range -128 to 127,
     * inclusive, and may cache other values outside of this range.
     *
     * @param  s a short value.
     * @return a {@code Short} instance representing {@code s}.
     * @since  1.5
     */
    public static Short valueOf(short s) {  //short-->Short 默认的装箱行为
        final int offset = 128;
        int sAsInt = s;
        if (sAsInt >= -128 && sAsInt <= 127) { // must cache
            return ShortCache.cache[sAsInt + offset];
        }
        return new Short(s);
    }

    /**
     * Decodes a {@code String} into a {@code Short}.
     * Accepts decimal, hexadecimal, and octal numbers given by
     * the following grammar:
     *
     * <blockquote>
     * <dl>
     * <dt><i>DecodableString:</i>
     * <dd><i>Sign<sub>opt</sub> DecimalNumeral</i>
     * <dd><i>Sign<sub>opt</sub></i> {@code 0x} <i>HexDigits</i>
     * <dd><i>Sign<sub>opt</sub></i> {@code 0X} <i>HexDigits</i>
     * <dd><i>Sign<sub>opt</sub></i> {@code #} <i>HexDigits</i>
     * <dd><i>Sign<sub>opt</sub></i> {@code 0} <i>OctalDigits</i>
     *
     * <dt><i>Sign:</i>
     * <dd>{@code -}
     * <dd>{@code +}
     * </dl>
     * </blockquote>
     *
     * <i>DecimalNumeral</i>, <i>HexDigits</i>, and <i>OctalDigits</i>
     * are as defined in section 3.10.1 of
     * <cite>The Java&trade; Language Specification</cite>,
     * except that underscores are not accepted between digits.
     *
     * <p>The sequence of characters following an optional
     * sign and/or radix specifier ("{@code 0x}", "{@code 0X}",
     * "{@code #}", or leading zero) is parsed as by the {@code
     * Short.parseShort} method with the indicated radix (10, 16, or
     * 8).  This sequence of characters must represent a positive
     * value or a {@link NumberFormatException} will be thrown.  The
     * result is negated if first character of the specified {@code
     * String} is the minus sign.  No whitespace characters are
     * permitted in the {@code String}.
     *
     * @param     nm the {@code String} to decode.
     * @return    a {@code Short} object holding the {@code short}
     *            value represented by {@code nm}
     * @throws    NumberFormatException  if the {@code String} does not
     *            contain a parsable {@code short}.
     * @see java.lang.Short#parseShort(java.lang.String, int)
     */
    public static Short decode(String nm) throws NumberFormatException {  //将字符串nm解析为short，随后再装箱
        int i = Integer.decode(nm);
        if (i < MIN_VALUE || i > MAX_VALUE)
            throw new NumberFormatException(
                    "Value " + i + " out of range from input " + nm);
        return valueOf((short)i);
    }

    /**
     * The value of the {@code Short}.
     *
     * @serial
     */
    private final short value;

    /**
     * Constructs a newly allocated {@code Short} object that
     * represents the specified {@code short} value.
     *
     * @param value     the value to be represented by the
     *                  {@code Short}.
     */
    public Short(short value) {
        this.value = value;
    }

    /**
     * Constructs a newly allocated {@code Short} object that
     * represents the {@code short} value indicated by the
     * {@code String} parameter. The string is converted to a
     * {@code short} value in exactly the manner used by the
     * {@code parseShort} method for radix 10.
     *
     * @param s the {@code String} to be converted to a
     *          {@code Short}
     * @throws  NumberFormatException If the {@code String}
     *          does not contain a parsable {@code short}.
     * @see     java.lang.Short#parseShort(java.lang.String, int)
     */
    public Short(String s) throws NumberFormatException {
        this.value = parseShort(s, 10);
    }

    /**
     * Returns the value of this {@code Short} as a {@code byte} after
     * a narrowing primitive conversion.
     * @jls 5.1.3 Narrowing Primitive Conversions
     */
    public byte byteValue() {  //以byte形式返回当前对象的值
        return (byte)value;
    }

    /**
     * Returns the value of this {@code Short} as a
     * {@code short}.
     */
    public short shortValue() {  //Short-->short 默认的拆箱行为
        return value;
    }

    /**
     * Returns the value of this {@code Short} as an {@code int} after
     * a widening primitive conversion.
     * @jls 5.1.2 Widening Primitive Conversions
     */
    public int intValue() {  //以int形式返回当前对象的值
        return (int)value;
    }

    /**
     * Returns the value of this {@code Short} as a {@code long} after
     * a widening primitive conversion.
     * @jls 5.1.2 Widening Primitive Conversions
     */
    public long longValue() {  //以long形式返回当前对象的值
        return (long)value;
    }

    /**
     * Returns the value of this {@code Short} as a {@code float}
     * after a widening primitive conversion.
     * @jls 5.1.2 Widening Primitive Conversions
     */
    public float floatValue() {  //以float形式返回当前对象的值
        return (float)value;
    }

    /**
     * Returns the value of this {@code Short} as a {@code double}
     * after a widening primitive conversion.
     * @jls 5.1.2 Widening Primitive Conversions
     */
    public double doubleValue() {  //以double形式返回当前对象的值
        return (double)value;
    }

    /**
     * Returns a {@code String} object representing this
     * {@code Short}'s value.  The value is converted to signed
     * decimal representation and returned as a string, exactly as if
     * the {@code short} value were given as an argument to the
     * {@link java.lang.Short#toString(short)} method.
     *
     * @return  a string representation of the value of this object in
     *          base&nbsp;10.
     */
    public String toString() {
        return Integer.toString((int)value);
    }

    /**
     * Returns a hash code for this {@code Short}; equal to the result
     * of invoking {@code intValue()}.
     *
     * @return a hash code value for this {@code Short}
     */
    @Override
    public int hashCode() {
        return Short.hashCode(value);
    }

    /**
     * Returns a hash code for a {@code short} value; compatible with
     * {@code Short.hashCode()}.
     *
     * @param value the value to hash
     * @return a hash code value for a {@code short} value.
     * @since 1.8
     */
    public static int hashCode(short value) {
        return (int)value;
    }

    /**
     * Compares this object to the specified object.  The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code Short} object that
     * contains the same {@code short} value as this object.
     *
     * @param obj       the object to compare with
     * @return          {@code true} if the objects are the same;
     *                  {@code false} otherwise.
     */
    public boolean equals(Object obj) { //比较两个对象的值是否相等
        if (obj instanceof Short) {
            return value == ((Short)obj).shortValue();
        }
        return false;
    }

    /**
     * Compares two {@code Short} objects numerically.
     *
     * @param   anotherShort   the {@code Short} to be compared.
     * @return  the value {@code 0} if this {@code Short} is
     *          equal to the argument {@code Short}; a value less than
     *          {@code 0} if this {@code Short} is numerically less
     *          than the argument {@code Short}; and a value greater than
     *           {@code 0} if this {@code Short} is numerically
     *           greater than the argument {@code Short} (signed
     *           comparison).
     * @since   1.2
     */
    public int compareTo(Short anotherShort) {  //比较两个Short（按自然顺序比较）
        return compare(this.value, anotherShort.value);
    }

    /**
     * Compares two {@code short} values numerically.
     * The value returned is identical to what would be returned by:
     * <pre>
     *    Short.valueOf(x).compareTo(Short.valueOf(y))
     * </pre>
     *
     * @param  x the first {@code short} to compare
     * @param  y the second {@code short} to compare
     * @return the value {@code 0} if {@code x == y};
     *         a value less than {@code 0} if {@code x < y}; and
     *         a value greater than {@code 0} if {@code x > y}
     * @since 1.7
     */
    public static int compare(short x, short y) {  //比较两个Short（按自然顺序比较）
        return x - y;
    }

    /**
     * The number of bits used to represent a {@code short} value in two's
     * complement binary form.
     * @since 1.5
     */
    public static final int SIZE = 16;  //当前类型所占bit[位]数

    /**
     * The number of bytes used to represent a {@code short} value in two's
     * complement binary form.
     *
     * @since 1.8
     */
    public static final int BYTES = SIZE / Byte.SIZE;  //当前类型所占字节数

    /**
     * Returns the value obtained by reversing the order of the bytes in the
     * two's complement representation of the specified {@code short} value.
     *
     * @param i the value whose bytes are to be reversed
     * @return the value obtained by reversing (or, equivalently, swapping)
     *     the bytes in the specified {@code short} value.
     * @since 1.5
     */
    public static short reverseBytes(short i) {  //以字节为单位逆置字节顺序
        return (short) (((i & 0xFF00) >> 8) | (i << 8));
    }


    /**
     * Converts the argument to an {@code int} by an unsigned
     * conversion.  In an unsigned conversion to an {@code int}, the
     * high-order 16 bits of the {@code int} are zero and the
     * low-order 16 bits are equal to the bits of the {@code short} argument.
     *
     * Consequently, zero and positive {@code short} values are mapped
     * to a numerically equal {@code int} value and negative {@code
     * short} values are mapped to an {@code int} value equal to the
     * input plus 2<sup>16</sup>.
     *
     * @param  x the value to convert to an unsigned {@code int}
     * @return the argument converted to {@code int} by an unsigned
     *         conversion
     * @since 1.8
     */
    public static int toUnsignedInt(short x) {  //将当前short转换为无符号形式，用int存储
        return ((int) x) & 0xffff;
    }

    /**
     * Converts the argument to a {@code long} by an unsigned
     * conversion.  In an unsigned conversion to a {@code long}, the
     * high-order 48 bits of the {@code long} are zero and the
     * low-order 16 bits are equal to the bits of the {@code short} argument.
     *
     * Consequently, zero and positive {@code short} values are mapped
     * to a numerically equal {@code long} value and negative {@code
     * short} values are mapped to a {@code long} value equal to the
     * input plus 2<sup>16</sup>.
     *
     * @param  x the value to convert to an unsigned {@code long}
     * @return the argument converted to {@code long} by an unsigned
     *         conversion
     * @since 1.8
     */
    public static long toUnsignedLong(short x) {  //将当前short转换为无符号形式，用long存储
        return ((long) x) & 0xffffL;
    }

    /** use serialVersionUID from JDK 1.1. for interoperability */
    private static final long serialVersionUID = 7515723908773894738L;
}
