package java.yunsuanfu;

public class YunSuanFuTest<result> {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = 5;
        //算术运算符
        System.out.println("a + b = "+ (a + b) );
        System.out.println("a - b = "+ (a - b) );
        System.out.println("a * c = "+ (a * c) );
        System.out.println("a / c = "+ (a / c) );
        System.out.println("a % c = "+ (a % c) );
        //自加自减运算符
        System.out.println("a++ = "+ (a++) );
        System.out.println("++a = "+ (++a) );
        System.out.println("--b = "+ (--b) );
        System.out.println("b-- = "+ (b--) );
        System.out.println("-----------------------");
        int d = 10;//0000 1010
        int e = 4;// 0000 0100
        //位运算符
        System.out.println("d & e = "+(d & e));//0000 0000
        System.out.println("d | e = "+(d | e));//0000 1110
        System.out.println("d ^ e = "+(d ^ e));//0000 1110
        System.out.println("~d = "+(~d));//1111 0101 ---> ~d = -11
        //[原]1111 0101 -> [反]1000 1010 -> [补]1000 1011 -> [移]0111 0110 -> [阶]0111 0101
        System.out.println("-----------------------");
        System.out.println("d >> 2 = " + (d >> 2) );//0000 0010 = 2
        System.out.println("d << 2 = " + (d << 2) );//0010 1000 = 40
        System.out.println("d >>> 4 = " + (d >>> 4) );//0000 0000 = 0
        //逻辑运算符
        System.out.println("-----------------------");
        System.out.println("(d < 4 && e > 1) = " + (d < 4 && e > 1) );
        System.out.println("(d < 4 || e > 1) = " + (d < 4 || e > 1) );
        System.out.println("! (d < 4 && e > 1) = " + ! (d < 4 && e > 1) );
        //短路逻辑运算符
        d = 11;
        boolean b1 = (d < 11) && (d++ >= 10);
        System.out.println("(d < 4 && (d++ >= 10) = " + b1 );
        System.out.println("d = " + d );
        boolean b2 = (d < 4) || (++d >= 10);
        System.out.println("(d < 4 || (++d >= 10) = " + b2 );
        System.out.println("(d < 4 || (++d >= 10) = " + d );
        System.out.println("-----------------------");
        //三元运算符
        System.out.println( d < 10 ? (++d) : (--d) );
        System.out.println( d == 10 ? (++d) : (--d) );

    }

}
