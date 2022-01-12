import java.util.*;

class Main {


  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    Die d1 = new Die();
    Die d2 = new Die();

    boolean ans = d1.equals(d2);
    System.out.println("Are d1 and d2 equal? " + ans);

    System.out.println("\n" + d1);
    System.out.println(d1.roll());
    System.out.println(d1);
    System.out.println(d2);
    System.out.println(d1.getValue());

    System.out.println("\nAre d1 and d2 equal? " + d1.equals(d2));

    Die d3 = new Die(1, 20);
    d3.roll();
    System.out.println("\nd3: " + d3);
    d3.roll();
    System.out.println("d3: " + d3);

    System.out.println("\nAre d1 and d3 equal? " + d1.equals(d3));
    d1.roll();
    System.out.println("Are d1 and d3 equal?" + d1.equals(d3));

    Die d4 = new Die(5, 50);
    System.out.println("\nd4: " + d4);


    // Use TwoDiceGames class

    System.out.println("\n\nHow many rolls of the dice?");
    int num = scan.nextInt();

    TwoDiceGames dg = new TwoDiceGames(num);
    dg.snakeEyes();

  }
  

}