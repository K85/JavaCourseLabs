package lab5;


public class LakeLazyDays {

  public static void suggest(int temperature) {
    if (temperature > 95 || temperature < 20) System.out.println("Visit our shops!"); 
    else if (temperature >= 80) System.out.println("swimming");
    else if (temperature >= 60 && temperature < 80) System.out.println("tennis");
    else if (temperature >= 40 && temperature < 60) System.out.println("golf");
    else System.out.println("skiing");
  }

  public static void main(String[] args) {
    suggest(100);
  }

}
