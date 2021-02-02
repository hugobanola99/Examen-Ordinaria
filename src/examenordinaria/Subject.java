package examenordinaria;

public interface Subject {
    
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void setBid(Observer o, int amount);
    public String getDescription(Description d);
    
}
