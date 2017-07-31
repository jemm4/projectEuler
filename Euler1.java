package euler1;

/**
 *
 * @author stastudents
 */
public class Euler1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* If we list all the natural numbers below 10 that are multiples of 3
         * and 5, we get 3, 5, 6, and 9. The sum of these multiples is 23. 
         * find the sum of all of the multiples of 3 or 5 below 1000. 
         */
        
        // declare variables
        int temp = 0;
        // run loop for numbers between 0-999
        for(int i=0; i<1000; i++){
        // check if multiple of 3 or 5 and if they are then add then together
            if(i%3==0 || i%5==0){
                temp+=i;
            }
        }
        System.out.println(temp);
    }   
}
