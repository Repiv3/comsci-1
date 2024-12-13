/* 
    Lecture note example - Classes
*/
import pkg.*;
import java.util.*;

class starter{
    public static void main(String args[]) {
        potato fry = new potato();
        boolean x = fry.getEdibility();
        System.out.println(x);
        potato sp = new potato("blue", "Baked", 100);
	}
}