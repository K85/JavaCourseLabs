package lab4;

import java.util.Scanner;

class BandBooster {

  private String name;
  private int boxesSold;

  public BandBooster(String name) {
    this.name = name;
    this.boxesSold = 0;
  }

  public String getName() {
    return this.name;
  }

  public void updateSales(int delta) {
    this.boxesSold += delta;
  }

  public String toString() {
    return String.format("%s : %d boxes", this.name, this.boxesSold);
  }

  public void inputSales(int weeks) {
    Scanner scanner = new Scanner(System.in);
    for (int i = 1; i <= weeks; i++) {
      System.out.println(String.format("Please enter %s's %dth week sales: ", this.name, i));
      int delta = scanner.nextInt();
      this.updateSales(delta);
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter band1's name: ");
    String band1Name = scanner.nextLine();
    System.out.println("Enter band2's name: ");
    String band2Name = scanner.nextLine();

    BandBooster bandBooster1 = new BandBooster(band1Name);
    bandBooster1.inputSales(3);
    BandBooster bandBooster2 = new BandBooster(band2Name);
    bandBooster2.inputSales(3);

    // print bandboosters.
    System.out.println(bandBooster1);
    System.out.println(bandBooster2);
  }

}
