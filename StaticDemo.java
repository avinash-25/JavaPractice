class StaticDemo {
  static int c= 10;
//  int b = 20;

//  static {
//      System.out.println("Static method is called");
//      int var = c;
//  }

  static void meth(int a){
      System.out.println("A = "+a);
      System.out.println("C = "+c);
  }

    public static void main(String[] args) {
        StaticDemo.c = 30;
      StaticDemo.meth(20);

        System.out.println("StaticDemo.c = "+StaticDemo.c);
    }
}
