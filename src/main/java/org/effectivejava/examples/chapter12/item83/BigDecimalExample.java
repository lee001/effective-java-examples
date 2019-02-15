package org.effectivejava.examples.chapter12.item83;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * <pre>
 *     BigDecimal用法详解:(参考： http://www.cnblogs.com/linjiqin/p/3413894.html)
 *     float和double只能用来做科学计算或者是工程计算，在商业计算中要用java.math.BigDecimal
 *     1.BigDecimal所创建的是对象，我们不能使用传统的+、-、*、/等算术运算符直接对其对象进行数学运算，而必须调用其相对应的方法
 *     2.方法中的参数也必须是BigDecimal的对象
 *     3.构造器是类的特殊方法，专门用来创建对象，特别是带有参数的对象
 *     使用BigDecimal的坏处是性能比double和float差，在处理庞大，复杂的运算时尤为明显，因根据实际需求决定使用哪种类型。
 * </pre>
 *
 * @author zw
 * @date 2018/11/27
 */
public class BigDecimalExample {
    /**
     * 构造器描述:
     * BigDecimal(int)    创建一个具有参数所指定整数值的对象。
     * BigDecimal(double) 创建一个具有参数所指定双精度值的对象。
     * BigDecimal(long)   创建一个具有参数所指定长整数值的对象。
     * BigDecimal(String) 创建一个具有参数所指定以字符串表示的数值的对象。
     * <p>
     * 方法描述：
     * add(BigDecimal)      BigDecimal对象中的值相加，然后返回这个对象。
     * subtract(BigDecimal) BigDecimal对象中的值相减，然后返回这个对象。
     * multiply(BigDecimal) BigDecimal对象中的值相乘，然后返回这个对象。
     * divide(BigDecimal)   BigDecimal对象中的值相除，然后返回这个对象。
     * toString()           将BigDecimal对象的数值转换成字符串。
     * doubleValue()        将BigDecimal对象中的值以双精度数返回。
     * floatValue()         将BigDecimal对象中的值以单精度数返回。
     * longValue()          将BigDecimal对象中的值以长整数返回。
     * intValue()           将BigDecimal对象中的值以整数返回。
     */
    public static void main(String[] args) {

//		new BigDecimalExample().test1();

        new BigDecimalExample().test2();

    }

    /**
     * BigDecimal格式化
     * 以利用BigDecimal对货币和百分比格式化为例。
     * 首先，创建BigDecimal对象，进行BigDecimal的算术运算后，分别建立对货币和百分比格式化的引用，
     * 最后利用BigDecimal对象作为format()方法的参数，输出其格式化的货币值和百分比。
     */
    private void test1() {
        //建立货币格式化引用
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        //建立百分比格式化引用
        NumberFormat percent = NumberFormat.getPercentInstance();
        //百分比小数点最多3位
        percent.setMaximumFractionDigits(3);

        //贷款金额
        BigDecimal loanAmount = new BigDecimal("15000.48");
        //利率
        BigDecimal interestRate = new BigDecimal("0.008");
        //相乘得利息
        BigDecimal interest = loanAmount.multiply(interestRate);

        //贷款金额:	￥15,000.48
        System.out.println("贷款金额:\t" + currency.format(loanAmount));
        //利率:	0.81%
        System.out.println("利率:\t" + percent.format(interestRate));
        //利息:	￥121.50
        System.out.println("利息:\t" + currency.format(interest));
    }

    /**
     * BigDecimal比较
     * 即左边比右边数大，返回1，相等返回0，比右边小返回-1。
     * 注意不能使用equals方法来比较大小。
     */
    private void test2() {
        BigDecimal a = new BigDecimal("1");
        BigDecimal b = new BigDecimal("2");
        BigDecimal c = new BigDecimal("1");
        int result1 = a.compareTo(b);//-1
        int result2 = a.compareTo(c);//0
        int result3 = b.compareTo(a);//1
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }

    private void test3() {
        //建立货币格式化引用
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        //贷款金额
        BigDecimal loanAmount = new BigDecimal("150000000.48");
        //利率
        BigDecimal interestRate = new BigDecimal("0.8");
        //相乘得利息
        BigDecimal interest = loanAmount.multiply(interestRate);

        //四舍五入法1
        interest.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(interest.setScale(2, BigDecimal.ROUND_HALF_UP));//120000000.38

        //四舍五入法2
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(interest));//120000000.38

        //四舍五入法3
        System.out.println(String.format("%.2f", interest));//120000000.38

        //四舍五入法4
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        System.out.println(nf.format(interest));//120,000,000.38

    }
}
