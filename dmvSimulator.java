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
                System.out.println("We're sorry, you do not have the required paperwork:(");
                numCalled = true;
            }else{

            System.out.println("Number " + currentNumber + " please come to the counter.");
            currentNumber++;
            }

        }

        }

        
    }
