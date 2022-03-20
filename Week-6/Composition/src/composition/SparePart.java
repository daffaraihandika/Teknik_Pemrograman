package composition;

public class SparePart{
    private String ban;
    private String knalpot;
    private String velg;
    
    SparePart(String ban, String knalpot, String velg){
        this.ban = ban;
        this.knalpot = knalpot;
        this.velg = velg;
    }
    
    SparePart(){
        this.ban = " ";
        this.knalpot = " ";
        this.velg = " ";
    }
    
    public String toString(){
        return String.format("Ban : %s\nKnalpot : %s\nVelg : %s", this.ban, this.knalpot, this.velg);
    }
}