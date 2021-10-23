package lab6;



public class TestBiasedCoin {

  public static void appleBench(BiasedCoin bc) {
    int heads = 0;
    int tails = 0;
    int total = 100;
    for (int i = 0; i < total; i++) {
      bc.flip();
      if (bc.isHeads()) heads++;
      else tails++;
    }


    System.out.println(String.format("Bias = %.2f, Total = %d, HeadsProp = %.2f", 
          bc.getBias(), total, (double)heads / total));

  }

  public static void main(String[] args) {
    
    BiasedCoin bc1 = new BiasedCoin();
    BiasedCoin bc2 = new BiasedCoin(0.7);
    BiasedCoin bc3 = new BiasedCoin(0.9);

    appleBench(bc1);
    appleBench(bc2);
    appleBench(bc3);
  }
}
