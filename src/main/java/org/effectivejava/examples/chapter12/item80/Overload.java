package org.effectivejava.examples.chapter12.item80;

/**
 * 重载
 * @author zw
 * @date 2018/11/27
 */
public class Overload {
    /**
     * 返回较大的整数
     * @param i
     * @param j
     * @return
     */
    public int getMax(int i, int j) {
        if (i > j) {
            return i;
        } else {
            return j;
        }
    }

    /**
     * 返回较大的小数
     * @param a
     * @param b
     * @return
     */
    public float getMax(float a, float b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * 返回较大的小数
     * @param c
     * @param d
     * @return
     */
    public float getMax(double c, float d) {
        if (c > d) {
            return (float) c;
        } else {
            return (float) d;
        }
    }

    /**
     * 返回较大的小数
     * @param d
     * @param c
     * @return
     */
    public float getMax(float d, double c) {
        if (c > d) {
            return (float) c;
        } else {
            return (float) d;
        }
    }
    //如果只是返回类型不一样，能否构成重载——不能!!
//	public double getMax(float d,double c){
//		if(c>d){
//			return c;
//		}else{
//			return d;
//		}
//	}

    //如果只是控制访问修饰符不一样，不能构成重载.
//	protected float getMax(float d,double c){
//		if(c>d){
//			return (float)c;
//		}else{
//			return (float)d;
//		}
//	}


    public static void main(String[] args) {
        Overload overload = new Overload();
        System.out.println(overload.getMax(12.2f, 23.2f));
        System.out.println(overload.getMax(2, 5));
    }
}
