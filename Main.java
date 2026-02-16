import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String[] answerArray = new String[20];
    Scanner scan = new Scanner(System.in);
    for(int i = 0; i < answerArray.length; i ++){
      System.out.print("Type your answer:");
      String ans = scan.nextLine();
      answerArray[i] = ans.toUpperCase();
    }
    scan.close();
    UnitTest stAns = new UnitTest(answerArray);
    System.out.print(stAns);
    System.out.println("\nTotal Correct:" + stAns.totalCorrect());
    System.out.println("Total Mistake:" + stAns.totalMistakes());
    if(stAns.isPassing()){
      System.out.println("This student is Passing");
    }else{
      System.out.println("This student is Failing");
    }
    
  }
}
