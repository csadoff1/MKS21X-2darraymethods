public class ArrayMethods {
  public static int rowSum(int[][] ary, int x) {
    int sum=0;
    for (int i=0; i<ary[x].length; i++) {
      sum += ary[x][i];
    }
    return sum;
  }

  public static int columnSum(int[][] ary, int x) {
    int sum=0;
    for (int i=0; i<ary.length; i++) {
        sum += ary[i][x];
      }
    return sum;
  }

  public static int[] allRowSum(int[][] ary) {
    int[] newAry = new int[ary.length];
    for (int i=0; i<newAry.length; i++) {
      newAry[i] = rowSum(ary, i);
    }
    return newAry;
  }

  public static int[] allColSum(int[][] ary) {
    int[] newAry = new int[ary.length];
    for (int i=0; i<newAry.length; i++) {
      newAry[i] = columnSum(ary, i);
    }
    return newAry;
  }

}
