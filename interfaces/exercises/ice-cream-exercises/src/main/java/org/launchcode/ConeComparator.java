package org.launchcode;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone cone1, Cone cone2) {
        // Using Subtraction to compare ages
        // Comparator<Player> comparator = (p1, p2) -> p1.getRanking() - p2.getRanking();

        if(cone1.getCost() - cone2.getCost() < 0){
            return -1;
        }
        else if(cone1.getCost() - cone2.getCost() > 0 ){
            return 1;
        }
        else{
            return 0;
        }

        // Below code didn't work - subtraction code above works.
        //return Integer.compare((int) cone1.getCost(), (int) cone2.getCost());
    }
}
