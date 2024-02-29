import java.util.*;

class dmvSimulator{

    public static void main(String[] args) {
        System.out.println("Welecome to the DMV!");
        Random random = new Random();
       int waitNumber = random.nextInt(200);
       
        
        System.out.println("Your number is " + waitNumber + " please wait for your number to be called.");
        int currentNumber = waitNumber + 1;
        boolean numCalled = false;

        while (!numCalled) {

            if (currentNumber > 200) {
                currentNumber = 1;
            }

            if (currentNumber == waitNumber) {
                System.out.println("Number " + waitNumber + " please come to the counter.");
                int miracle = random.nextInt(100);
                if(miracle < 99){
                System.out.println("Hey dum dum, you do not have the required paperwork. Try again, NEVER. Loser.");
                }else{
                    System.out.println("Thank you for bringing the correct paperwork, you are all set!");
 
                }
                numCalled = true;
            }else{

            System.out.println("Number " + currentNumber + " please come to the counter.");
            currentNumber++;
            }

        }

        }

        
    }
