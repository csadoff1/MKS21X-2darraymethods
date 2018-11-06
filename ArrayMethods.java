public class ArrayMethods {

  public static int longest(int[][] ary) {
    int longest=0;
    for (int i=1; i<ary.length; i++) {
      if (ary[i].length>ary[i-1].length) longest=i;
    }
    return longest;
  }

  public static int rowSum(int[][] ary, int x) {
    int sum=0;
    for (int i=0; i<ary[x].length; i++) {
      if (ary[x].length < ary[longest(ary)].length) {
      sum += ary[x][i];
      }
      else {
        sum=sum;
      }
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

  public static int[] allRowSums(int[][] ary) {
    int[] newAry = new int[ary.length];
    for (int i=0; i<newAry.length; i++) {
      newAry[i] = rowSum(ary, i);
    }
    return newAry;
  }

  public static int[] allColSums(int[][] ary) {
    int longest=0;
    for (int i=1; i<ary.length; i++) {
      if (ary[i].length>ary[i-1].length) longest=i;
    }
    int[] newAry = new int[ary[longest].length];
    for (int i=0; i<newAry.length; i++) {
      newAry[i] = columnSum(ary, i);
    }
    return newAry;
  }

  public static boolean isRowMagic(int[][] ary) {
    boolean magic = false;
    for (int i=1; i<ary.length; i++) {
      if (rowSum(ary, i)==rowSum(ary, i-1)) {
        magic=true;
      }
      else {
        magic=false;
      }
    }
    return magic;
  }

  public static boolean isColumnMagic(int[][] ary) {
    boolean magic = false;
    for (int i=1; i<ary.length; i++) {
      if (columnSum(ary, i)==columnSum(ary, i-1)) {
        magic=true;
      }
      else {
        magic=false;
      }
    }
    return magic;
  }

}
