class Student {
    String name;
    int[] marks = {67, 89, 45, 89, 45};
    float total;
    float tmax;
    float Average;

    void assign() {
        name = "Avinash";
        tmax = marks[0];
        for (int i = 1; i < marks.length; i++){
            if (tmax < marks[i])
                tmax = marks[i];
        }
    }

    void compute() {
        float sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        Average = sum/marks.length;
    }

    void Display(){
        System.out.println("Name of student : "+name);
        System.out.print("Marks : ");
        for(int i=0;i<marks.length;i++){
            System.out.print("  "+marks[i]);
        }
        System.out.println();
        System.out.println("Average of Marks :- "+Average);
        System.out.println("Maximum Marks of student is : "+tmax);
    }

    public static void main(String[] args) {
        Student ob1 = new Student();

        ob1.assign();
        ob1.compute();
        ob1.Display();
    }
}



