package Day8;

import java.util.Scanner;

public class ATMmachine {
    public static void lines(){
        System.out.println("=====================");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Riya's ATM");
        lines();
        Scanner sc = new Scanner(System.in);
        int pin_number = 1234; //default for comparing
        float Account_Balance = 500f;//default account balance 

        //3 attempt for pin entry
        for(int attempt = 3; attempt>0; attempt--){
            int pin = sc.nextInt(); //getting from user
            lines();
            if(pin == pin_number){
                System.out.println("Welcome User");
                lines();
                for(int x=1;x==1;){
                System.out.println("1. Credit\n2. Debit\n3. Check Balance\n4. Change the PIN Number\n0. Exit");
                lines();
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                    {
                        System.out.println("Enter the amount to be Credited");
                        int amount = sc.nextInt(); //reading from the user
                        lines();
                        Account_Balance = Account_Balance + amount;
                        System.out.printf("Amount added:%.2f\n",Account_Balance);
                        lines();
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Enter the amount to be debited");
                        int amount = sc.nextInt(); //reading from user
                        lines();
                        if(amount<=Account_Balance){
                            Account_Balance =  Account_Balance - amount;
                            System.out.printf("Current Balance : %.2f\n", Account_Balance);
                            lines();
                        }
                        else{
                            System.out.println("Insufficient Balance");
                            lines();
                        }
                        break;
                    }
                    case 3:
                    {
                        System.out.printf("Current Balance: %.2f\n", Account_Balance);
                        lines();
                        break;
                    }
                    case 0:
                    {
                        x=0;
                        break;
                    }
                }
            }

            break; //it breaks the entire loop
            }
            else{
                System.out.println("Enter the correct PIN Number only " + (attempt-1) + ((attempt>2)?" attempts":" attempt")+" left");
            }
        }
        sc.close();
    }
}
