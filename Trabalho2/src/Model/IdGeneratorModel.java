package Model;

import java.util.Random;

public class IdGeneratorModel {
       
    public long generator(){
        Random random = new Random();
        
        int n1 = random.nextInt(0, 1000);
        int n2 = random.nextInt(0, 9000);
        int n3 = random.nextInt(0, 3000);
        
        long numGenerated = -1;
        
        while(numGenerated < 0){
            numGenerated = n1 + n2 * n3;
        }
        
        return numGenerated;
    }
    
}
