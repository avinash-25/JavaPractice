class te{
    void MissingNum(){
        int[] ar = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        int len = ar.length;
        int sum = 0;
        int var = 0;
        for (int i = 0; i < len; i++) {
            sum += ar[i];
        }
        var = 55 - sum;
        System.out.println("Missing number is : "+var);
    }
    public static void main(String[] args) {

        te ob = new te();
        ob.MissingNum();

    }
}
