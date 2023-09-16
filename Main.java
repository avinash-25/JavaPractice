
import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> al1 = new LinkedList<>();
        LinkedList<Integer> al2 = new LinkedList<>(List.of(50,60,70,80,90));

        al1.add(3);
        al2.add(1,5);
        for(int i = 0; al2.size() > i; i++){
            System.out.println(i);
        }
        System.out.println(al2);

        }
    }