// 3D: Write a java program to generate banking system

import java.util.Scanner;

class Bank{
    String AccountHolderName;
    int Balance;
    float interestRate;

    Bank(String AccountHolderName, int Balance){
        this.AccountHolderName = AccountHolderName;
        this.Balance = Balance;
        this.interestRate = 3;
    }

    void deposit(int amount){
        if (amount <= 0){
            System.out.println("Invalid Amount");
        } else {
            Balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    void withdraw(int amount){
        if(Balance < amount){
            System.out.println("Insufficient Balance");
        }else{
            Balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void checkBalance(){
        System.out.println("Balance: " + Balance);
    }

    void ApplyInterest(){
        Balance += Balance * interestRate / 100;
        System.out.println("Interest Applied");
    }
}

class HDFC extends Bank{
    HDFC(String AccountHolderName, int Balance){
        super(AccountHolderName, Balance);
        this.interestRate = 4;
    }
}

class ICICI extends Bank{
    ICICI(String AccountHolderName, int Balance){
        super(AccountHolderName, Balance);
        this.interestRate = 5;
    }
}

class AXIS extends Bank{
    AXIS(String AccountHolderName, int Balance){
        super(AccountHolderName, Balance);
        this.interestRate = 4.5f;
    }
}

class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bankAccount = null;

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your initial balance: ");
        int balance = sc.nextInt();
        System.out.println("Choose a bank: \n1. HDFC\n2. ICICI\n3. AXIS");
        int bank = sc.nextInt();

        switch (bank){
            case 1:
                bankAccount = new HDFC(name, balance);
                System.out.println("HDFC Bank Account Created");
                break;
            case 2:
                bankAccount = new ICICI(name, balance);
                System.out.println("ICICI Bank Account Created");
                break;
            case 3:
                bankAccount = new AXIS(name, balance);
                System.out.println("AXIS Bank Account Created");
                break;
            default:
                System.out.println("Invalid Bank");
                System.exit(0);
                break;
        }

        boolean exit = false;

        while (!exit) {
            System.out.println("\nBanking System\n\n");

            System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Apply Interest\n5. Exit\nChoose an option: ");
            int option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("Enter amount to deposit: ");
                    int amount = sc.nextInt();
                    bankAccount.deposit(amount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    amount = sc.nextInt();
                    bankAccount.withdraw(amount);
                    break;
                case 3:
                    bankAccount.checkBalance();
                    break;
                case 4:
                    bankAccount.ApplyInterest();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;    
            }
        }

        sc.close();
    }
}