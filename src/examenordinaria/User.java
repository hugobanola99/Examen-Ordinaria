package examenordinaria;

import java.util.ArrayList;
import java.util.List;

public class User implements Observer{
    
    private final String name;
    private final List<Subject> auctions = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }


    
    public void mostrar(Subject s) {
        auctions.add(s);
        System.out.println("Esta subasta se encuentra activa: "+s.toString());
    }
    
}
