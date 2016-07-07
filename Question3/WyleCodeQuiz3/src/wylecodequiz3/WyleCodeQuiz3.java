/*
 WyleCodeQuiz2
 Michael Bejaniance
 */
package wylecodequiz3;

public class WyleCodeQuiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int j = 1;
        int k = 1;
        for(int i = 1; i <= 5; i++){
            while(j <= (5-i)){
                j++;
                System.out.print(".");
            }
            j = 1;
            while(k <=i){
                k++;
                System.out.print(i);
            }
            k = 1;
            System.out.println();           
        }
    }
    
}
