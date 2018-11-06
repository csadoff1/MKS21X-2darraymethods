public class ArrayMethods {
  public static int rowSum(int[][] ary, int x) {
    int sum=0;
    for (int i1=0; i1<ary.length; i1++) {
      for (int i2=0; i2<ary[i1].length; i2++) {
        sum += ary[i1][i2];
      }
    }
    return sum;
  }

}
