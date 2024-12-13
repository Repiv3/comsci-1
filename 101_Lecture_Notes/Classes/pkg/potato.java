package pkg;

public class potato{
    String color;
    boolean isEdible;
    String type;
    double mass;
    
    public potato(){
        color = "brown";
        isEdible = true;
        type = "french fry";
        mass = 170.5;
    }
public potato(String c, String t, double m ){
    color = c;
    isEdible = false;
    type = t;
    mass = m;
    
}
public boolean getEdibility(){
    return isEdible;
    
}
}