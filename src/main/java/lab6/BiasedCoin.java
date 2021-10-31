package lab6;

// ******************************************************************* 
//   Coin.java            Author: Lewis and Loftus 
// 
//   Represents a coin with two sides that can be flipped. 
// ******************************************************************* 

public class BiasedCoin {
  public static final int HEADS = 0;
  public static final int TAILS = 1;
  private final double bias;
  private int face;

  // ---------------------------------------------
  // Sets up the coin by flipping it initially.
  // ---------------------------------------------
  public BiasedCoin() {
    this(0.5);
  }

  public BiasedCoin(double bias) {
    if (bias > 0 && bias <= 1) {
      this.bias = bias;
    } else {
      this.bias = 0.5;
    }
    flip();
  }

  // -----------------------------------------------
  // Flips the coin by randomly choosing a face.
  // -----------------------------------------------
  public void flip() {
    face = Math.random() < bias ? HEADS : TAILS;
  }

  // ---------------------------------------------------------
  // Returns true if the current face of the coin is heads.
  // ---------------------------------------------------------
  public boolean isHeads() {
    return (face == HEADS);
  }
  
  public double getBias() {
    return this.bias;
  }

  // ----------------------------------------------------
  // Returns the current face of the coin as a string.
  // ----------------------------------------------------
  public String toString() {
    String faceName;

    if (face == HEADS)
      faceName = "Heads";
    else
      faceName = "Tails";

    return faceName;
  }
}
