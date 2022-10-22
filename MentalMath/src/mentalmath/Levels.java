/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mentalmath;

/**
 *
 * @author daniela this will return the range number
 */
public class Levels {

    int level;
    int max_range;

    public Levels(int level) {
        this.level = level;
        int maxrange = set_maxrange(level);

               
    }

    public int set_maxrange(int l) {
        switch (l) {
            case 1:level=1; max_range= 10; return 10;
            case 2: level=2;max_range= 100; return 100;
            case 3:level=3; max_range= 1000; return 1000;
        }
        return 10000;
    }
    
    public int get_maxRange(){
        int mr = max_range;
        return mr;
    }
    
     public void SetLevel(int l){
         level = l;
         set_maxrange(level);
    }

}
