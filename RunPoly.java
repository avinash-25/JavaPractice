 class car {
     void run(double speed) {
         System.out.println("Speed of car : " + speed);
     }

 }
class bike extends car{
    void run(double speed){
        System.out.println("Speed od bike : "+speed);
    }
}
class dummy{
    public static void main(String[] args) {

        car obj = new car();
        obj.run(23);

    }
}