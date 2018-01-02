import java.util.Arrays;
public class deleteIntElement{
  public static void main(String[] args){ //for test
    int[] a = new int[5];
    a[0] = 1;
    a[1] = 5;
    a[2] = 4;
    a[3] = 1;
    a[4] = 7;
    int target = 1;
    int[] result = deleteElement(a, target);
    System.out.println(Arrays.toString(result));
  }
  public static int[] deleteElement(int[] a, int target){
    int count = 0;
    for(int n = 0; n < a.length; n++){
      if(a[n] != target){
        count++;
      }
    }
    int[] result = new int[count];
    int ruler = 0;
    for(int x = 0; x < a.length; x++){
      if(a[x] != target){
        result[ruler] = a[x];
        ruler++;
      }
    }
    return result;
  } //this method should be static
}