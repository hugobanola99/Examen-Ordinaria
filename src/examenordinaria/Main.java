package examenordinaria;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] biddingList = new int[10];
        
        Description mic = new Description(100,20,biddingList);
        Subject micro = new Auction("Microondas",10,mic);
        Observer o1 = new User("Juan");
        Observer o2 = new User("Maria");
        Observer o3 = new User("Julia");
        o1.mostrar(micro);
        micro.registerObserver(o1);
        micro.setBid(o1, 200);
        micro.registerObserver(o2);
        micro.setBid(o1, 300);
        micro.registerObserver(o3);
        micro.setBid(o3, 0);
        
    }
    
}
