class MyObject7 extends Test7 {
    public static void main(String[] args) {
        Test7 test = new Test7();
        /*
        *该clone()方法可见性为包java.lang及其子类Test7,而包p7中没有clone方法，
        *也没有继承java.lang包中的protected clone();
         */
//        test.clone(); // Compile Error   ----- (1)
   }
}
