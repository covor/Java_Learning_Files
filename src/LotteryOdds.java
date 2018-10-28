import java.util.Scanner;

public class LotteryOdds {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("How many numbers do you need to draw?");
        int k = in.nextInt();
        System.out.println("What is the highest number you can draw?");
        int n = in.nextInt();
        int lottertyOdds = 1;
        for(int i=1;i <=k;i++)
            lottertyOdds=lottertyOdds*(n-i+1)/i;
        System.out.println("Your odds are 1 in "+lottertyOdds +".Good Luck!");
    }
}
