class A {
    int i,j;
    A(int a,int b){
        i = a;
        j = b;
    }
    void show(){
        System.out.println("a = "+i+"\nb = "+j);
    }
}

class B extends A{
    int k;
    B(int a,int b,int c){
        super(a,b);
        k = c;
    }

    void show(){
        System.out.println("c = "+k);
    }

}
class C{
    public static void main(String[] args) {
        B obj = new B(12,34,56);
        A ob = new A(78,89);
        obj.show();
        ob.show();
    }
}