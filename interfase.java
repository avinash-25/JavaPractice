interface CallBack{
    void callback();
    final int i = 10;
    int j = 40;
    static int l = 40;
}

public class interfase implements CallBack {
    @Override
    public void callback() {
        System.out.println("i = "+i);
        System.out.println("j = "+j);
        System.out.println("l = "+l);
    }

    void nimeth(){
        System.out.println("Non interface method");
    }

    public static void main(String[] args) {
        interfase obj = new interfase();
        obj.callback();
        obj.nimeth();
    }
}

class test extends interfase{
    public static void main(String[] args) {
        CallBack c = new interfase();
        c.callback();

    }
}

