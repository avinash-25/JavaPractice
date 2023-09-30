import java.util.Random;
class handleError{
    public static void main(String[] args) {
        int a=0,b=0,c=0;
        Random r = new Random();

        for(int i=0;i<1;i++){
            try{
                b = r.nextInt();
                c = r.nextInt();
                System.out.println("b = :"+b);
                System.out.println("c = :"+c);
                System.out.println("Before divide");
                a = 12345/(b/c);
                System.out.println("After Divide");
                System.out.println("b = :"+b);
                System.out.println("c = :"+c);
                System.out.println("a = :"+a);
                System.out.println("(b/c) : "+(b/c));
            }catch (ArithmeticException e){
                System.out.println("Division by zero");

            }
            System.out.println("a = : "+a);
        }
    }
}