package examenordinaria;

import java.util.ArrayList;
import java.util.List;

public class Auction implements Subject{
    
    private final String auctionName;
    private int initialAmount;
    private Observer observer;
    private Description d;
    private final List<Observer> observers = new ArrayList<>();
    int i = 0;

    public Auction(String auctionName, int initialAmount,Description d) {
        this.auctionName = auctionName;
        this.initialAmount = initialAmount;
        this.d=d;
        
    }

    @Override
    public String toString() {
        return auctionName;
    }
    
    @Override
    public void registerObserver(Observer o) {
        System.out.println(o+" ha entrado en la subasta");
        observers.add(o);
        System.out.println("Descipcion: "+this.getDescription(d));
        
        
    }
    
    @Override
    public String getDescription(Description d){
        return "La puja inicial es de "+d.getInitialBid()+"€, el tiempo restante es de: "+d.getTime() +" minutos"+d.getBiddingList();
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
        System.out.println(o+" se ha retirado de la subasta");
    }

    @Override
    public void setBid(Observer o, int amount) {
        
        if(amount>initialAmount){
            
            initialAmount=amount;
            observer=o;
            d.biddingList[i] = amount;
            
            i++;
            System.out.println(o+" ha realizado una puja por valor de "+amount+"€");
            
            
            
        }else{
            System.out.println("La oferta debe ser mayor que "+initialAmount+" €, ya que es la actual");
        }
        
    }

    
  
    
}
