public class Poly {

    void add(double a){
        System.out.println(a);
    }
    void add(int a,int b){
        System.out.println("Sum of two number is : "+(a+b));
    }
    void add(int a,int b,int c){
        System.out.println("Sum of three number is : "+(a+b+c));
    }
    void add(double a,double b){
        System.out.println("Sum of two (double) number is : "+(a+b));
    }

    public static void main(String[] args) {
        Poly obj = new Poly();
        int i=10;
        obj.add(i);
        obj.add(12,3);
        obj.add(12,45);
        obj.add(1,2,3);

    }
}
