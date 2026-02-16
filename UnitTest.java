public class UnitTest {

  // instance variables
  private String[] answerKey =  {"B", "D", "C", "A", "E", "A", "B", "A", "E", "B", "B", "E", "E", "D", "D", "A", "C", "C", "A", "E"};
  private String[] studentAns;
  // constructor
  public UnitTest(String[] arr){
    studentAns = new String[arr.length];
    for(int i=0; i < arr.length; i++ ){
      studentAns[i] = arr[i];
    }
  }

  
  // instance methods
  public String[] getStudentAns(){
    return studentAns;
  }
  public int totalCorrect(){
    int  total = 0;
    for(int i=0; i < studentAns.length; i++ ){
      if(studentAns[i].equals(answerKey[i])){
        total += 1;
      }
      
    }
    return total;
  }
  public int totalMistakes(){
    int  total = 0;
    for(int i=0; i < studentAns.length; i++ ){
      if(!studentAns[i].equals(answerKey[i])){
        total += 1;
      }
      
    }
    return total;
  }
  public boolean isPassing(){
    int  total = 0;
    for(int i=0; i < studentAns.length; i++ ){
      if(studentAns[i].equals(answerKey[i])){
        total ++;
      }
      i++;
    }
    if (total >= 14){
      return true;
    }
    return false;
  }
  public String toString(){
    String answerTable = "Answer Key\tStudent Ans \n" ;
    for(int i=0; i < studentAns.length; i++ ){
      answerTable += (i +1) + ")" + answerKey[i]+"\t"+ (i+ 1)+ ")"+ studentAns[i] +"\n" ;
    }
    return answerTable;
  }
  
}
