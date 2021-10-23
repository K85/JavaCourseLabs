package lab6;

/**
 * @author : 31729
 * @created : 2021-10-23
**/

public class Compare3 {

  public static Comparable largest(Comparable cmp1, Comparable cmp2, Comparable cmp3) {
    Comparable ret = null;
    ret = cmp1.compareTo(cmp2) < 0 ? cmp2 : cmp1; 
    ret = cmp3.compareTo(ret) < 0 ? ret : cmp3;
    return ret;
  }

}
