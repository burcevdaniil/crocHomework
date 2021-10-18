package task1;

/**
 *
 * @author Palm_Plaza
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%3==0&&i%5==0){
                System.out.println("FizzBuzz");
            } else if(i%5==0){
                System.out.println("Buzz");
            } else if(i%3==0){
                System.out.println("Fizz");
            }
        }
    }
    
}
