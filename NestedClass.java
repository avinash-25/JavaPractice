class Parent {
    int b = 20;
     class Nested{
        final void fun(){
            System.out.println("B = "+b);
            int a = 10;
            System.out.println("Inner class a = "+a);
        }

        public static void main(String[] args) {
            Parent obj = new Parent();

        }
    }
}
