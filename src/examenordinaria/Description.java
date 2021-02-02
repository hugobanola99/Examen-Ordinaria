package examenordinaria;

public class Description {
    
    int initialBid;
    int time;
    int[] biddingList;

    public Description(int initialBid, int time, int[] biddingList) {
        this.initialBid = initialBid;
        this.time = time;
        this.biddingList = biddingList;
    }

    public int getInitialBid() {
        return initialBid;
    }

    public int getTime() {
        return time;
    }

    public String getBiddingList() {
        String res = "";
        for(int i = 0; i < biddingList.length; i++){
            res =  biddingList[i]+",";
        }
        return res;
    }
    
    
    
    
    
    
    
}
