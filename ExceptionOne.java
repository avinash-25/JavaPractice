class Ex1{
    public static void main(String[] args) {
        int d,a;
        try{
            d=0;
            a=0;
            d = 42/a;
            System.out.println("This will not to be printed");
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero");
        }
        System.out.println("After catch statement");
    }
}