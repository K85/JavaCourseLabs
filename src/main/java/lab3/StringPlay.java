package lab3;

// ************************************************** 
//   StringPlay.java 
// 
//   Play with String objects 
// ************************************************** 
public class StringPlay {
  public static void main(String[] args) {
    String college = new String("PoDunk College");
    String town = new String("Anytown, USA");

    String change1, change2, change3;

    int stringLength = college.length();

    System.out.println(college + " contains " + stringLength + " characters.");
    change1 = String.valueOf(college).toUpperCase();
    change2 = String.valueOf(change1).replace('o', '*');
    change3 = college.concat(town);

    System.out.println("The final string is " + change3);
  }
}
