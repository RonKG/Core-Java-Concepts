package solutions;

public class PowTable {
  public static void main(String[] args) {

    int num = 0; 
    int power = 0;
    int product = 0;

    for (power = 1; power <=8; power = power + 1)
    {
      System.out.print(power + "\t");
    }
    System.out.println();

    for (num = 1; num <= 10; num = num + 1)
    {
      product = 1;
      for (power = 1; power <= 8; power = power + 1)
      {
        product = product * num;
        System.out.print(product + "\t");
      }
      System.out.println();
    }
  }
}

