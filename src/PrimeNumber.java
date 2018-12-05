public class PrimeNumber {
  public static void main(String[] args) {
    int n = 20;
    System.out.println("20 số nguyên tố đầu tiên là:");
    System.out.println(printPrimeNumber(n));
  }

  public static String printPrimeNumber(int n) {
    String result = "";
    for (int i = 2; n != 0; i++) {
      int divisible = 0;
      for (int j = 2; j <= i; j++) {
        if ((i%j) == 0) divisible += 1;
      }
      if (divisible == 1) {
        n--;
        result += i + "\t";
      }
    }

    return result;
  }
}