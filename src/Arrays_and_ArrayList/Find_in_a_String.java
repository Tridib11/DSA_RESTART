package Arrays_and_ArrayList;

public class Find_in_a_String {
  public static void main(String[] args){
    String s="rohan";
    char c='x';
    System.out.println(find(s,c));
  }

  private static boolean find(String s,char c){
    if(s.length()==0) return false;
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)==c){
        return true;
      }
    }
    return false;
  }
}
