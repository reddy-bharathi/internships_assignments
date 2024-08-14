class book {
   
   string author;
   string title;
   int price;
   int pages;
   int stock;

    public void getdetails(string at, string tt, int pr, int pg, int st) {
       author = at;
       title = tt;
       price = pr;
       pages = pg;
       stock = st;
   }
      public void showdetails () {
       system.out.println (" ");
       system.out.println ("books information");
       system.out.println ("============================");
       system.out.println (" book author: " + author);
       system.out.println (" book title: " + title);
       system.out.println (" book price: " + price);
       system.out.println (" number of pages: " + pages);
       system.out.println (" book of stock: " + stock);
  }
    
}
    class softwarebook extends book {
  
     string softwarecatagoery;
     string publisher;
     public void getdetails () {
       super . getdetails ("mark franklin" , "all about pc", 120, 150, 80);
           softwarecategory = "machine";
           publisher = "denmark";
    }
         public void showdetails() {
           system.out.println (" ");
           system.showdetails ();
           system.out.println ("hardware category: " + hardwarecategory);
           system.out.println ("publisher name: " + publisher);
           system.out.println (" ");
      }
 }



public class SavingsAccount {
    private static double annualInterestRate = 0;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void calculateMonthlyInterest() {
        savingsBalance += savingsBalance * annualInterestRate / 12;
    }

    public static void modifyInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }
}


public class Main {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        SavingsAccount.modifyInterestRate(0.04);
        for (int i = 0; i < 12; i++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }
        System.out.println("Saver1: " + saver1.getSavingsBalance());
        System.out.println("Saver2: " + saver2.getSavingsBalance());
        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saver1: " + saver1.getSavingsBalance());
        System.out.println("Saver2: " + saver2.getSavingsBalance());
    }
}


          public class bookdemo {
     
          public static void main(string args []) {
   
          softwarebook softdetails = new softwarebook ();
          softdetails. getdetails ();
          softdetails . showdetails ();
     
          hardwarebook harddetails = new hardwarebook ();
          harddetails . getdetails ();
          harddetails . showdetails ();
   }

}
