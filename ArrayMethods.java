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

  public static int columnSum(int[][] ary, int x) {
    int sum=0;
    int i1=0;
    for (int i2=0; i2<ary[i1].length; i2++) {
      for (i1=0; i1<ary.length; i1++) {
        sum += ary[i1][i2];
      }
    }
    return sum;
  }

  public static int[] allRowsSum(int[][] ary) {
    int[] newAry = new int[ary.length];
    for (int i=0; i<newAry.length; i++) {
      newAry[i] = rowSum(ary, i);
    }
    return newAry;
  }

}
