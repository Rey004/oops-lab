// 3C: Write a java program for method overriding.

class Bank{
    double getRateOfInterest(){
        return 0;
    }
}

class SBI extends Bank{
    double getRateOfInterest(){
        return 8.4;
    }
}

class ICICI extends Bank{
    double getRateOfInterest(){
        return 7.3;
    }
}   

class AXIS extends Bank{
    double getRateOfInterest(){
        return 9.7;
    }
}

class C {
    public static void main(String[] args) {
        Bank bank = new Bank();
        SBI bank1 = new SBI();
        ICICI bank2 = new ICICI();
        AXIS bank3 = new AXIS();

        System.out.println("Bank Rate of Interest: " + bank.getRateOfInterest());
        System.out.println("SBI Rate of Interest: " + bank1.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + bank2.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + bank3.getRateOfInterest());

    }
}
