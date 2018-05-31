package edu.cnm.deepdive;

import java.util.Random;

/**
 * Class - utils for shuffling primatives and generic objects
 * 
 * @author Stephen ver 0.1
 */

public class ArrayShuffles {

  /**
   * Shuffle deck with def source of randomness. Invokes {@link #shuffles(int[], Random)}.
   * 
   * @param deck data array
   */

  public static void shuffle(int[] deck) { // fisher yates shuffle
    shuffle(deck, new Random());
  }

  /**
   * Shuffles deck using FY algorithm with spec source of randomness.
   * 
   * @param deck data array
   * @param rng Source of randomness
   */

  public static void shuffle(int[] deck, Random rng) { // fisher yates shuffle
    for (int i = deck.length - 1; i > 0; i--) {
      int source = rng.nextInt(i + 1);
      int temp = deck[i];
      deck[i] = deck[source];
      deck[source] = temp;
    }
  }

  /**
   * Shuffle deck with def source of randomness. Invokes {@link #shuffles(long[], Random)}
   * 
   * @param deck data array
   */

  public static void shuffle(boolean[] deck) { // fisher yates shuffle
    shuffle(deck, new Random());
  }

  /**
   * /** Shuffles deck using FY algorithm with spec source of randomness.
   * 
   * @param deck data array
   * @param rng Source of randomness
   */

  public static void shuffle(boolean[] deck, Random rng) { // fisher yates shuffle
    for (int i = deck.length - 1; i > 0; i--) {
      int source = rng.nextInt(i + 1);
      boolean temp = deck[i];
      deck[i] = deck[source];
      deck[source] = temp;
    }
  }

  /**
   * Shuffle deck with def source of randomness. Invokes {@link #shuffles(long[], Random)}
   * 
   * @param deck data array
   */

  public static void shuffle(short[] deck) { // fisher yates shuffle
    shuffle(deck, new Random());
  }

  /**
   * /** Shuffles deck using FY algorithm with spec source of randomness.
   * 
   * @param deck data array
   * @param rng Source of randomness
   */

  public static void shuffle(short[] deck, Random rng) { // fisher yates shuffle
    for (int i = deck.length - 1; i > 0; i--) {
      int source = rng.nextInt(i + 1);
      short temp = deck[i];
      deck[i] = deck[source];
      deck[source] = temp;
    }
  }

  /**
   * Shuffle deck with def source of randomness. Invokes {@link #shuffles(long[], Random)}
   * 
   * @param deck data array
   */

  public static void shuffle(char[] deck) { // fisher yates shuffle
    shuffle(deck, new Random());
  }

  /**
   * /** Shuffles deck using FY algorithm with spec source of randomness.
   * 
   * @param deck data array
   * @param rng Source of randomness
   */

  public static void shuffle(char[] deck, Random rng) { // fisher yates shuffle
    for (int i = deck.length - 1; i > 0; i--) {
      int source = rng.nextInt(i + 1);
      char temp = deck[i];
      deck[i] = deck[source];
      deck[source] = temp;
    }
  }

  /**
   * Shuffle deck with def source of randomness. Invokes {@link #shuffles(long[], Random)}
   * 
   * @param deck data array
   */

  public static void shuffle(float[] deck) { // fisher yates shuffle
    shuffle(deck, new Random());
  }

  /**
   * /** Shuffles deck using FY algorithm with spec source of randomness.
   * 
   * @param deck data array
   * @param rng Source of randomness
   */

  public static void shuffle(float[] deck, Random rng) { // fisher yates shuffle
    for (int i = deck.length - 1; i > 0; i--) {
      int source = rng.nextInt(i + 1);
      float temp = deck[i];
      deck[i] = deck[source];
      deck[source] = temp;
    }
  }

  /**
   * Shuffle deck with def source of randomness. Invokes {@link #shuffles(long[], Random)}
   * 
   * @param deck data array
   */

  public static void shuffle(double[] deck) { // fisher yates shuffle
    shuffle(deck, new Random());
  }

  /**
   * /** Shuffles deck using FY algorithm with spec source of randomness.
   * 
   * @param deck data array
   * @param rng Source of randomness
   */

  public static void shuffle(double[] deck, Random rng) { // fisher yates shuffle
    for (int i = deck.length - 1; i > 0; i--) {
      int source = rng.nextInt(i + 1);
      double temp = deck[i];
      deck[i] = deck[source];
      deck[source] = temp;
    }
  }


  /**
   * ???Shuffle deck with def source of randomness. Invokes {@link #shuffles(long[], Random)}
   * added as an object wrapper
   * @param deck data array
   */

  public static <T> void shuffle(T[] deck) { // fisher yates shuffle
    shuffle(deck, new Random());
  }

  /**
   * /** Shuffles deck using FY algorithm with spec source of randomness.
   * 
   * @param deck data array
   * @param rng Source of randomness
   */

  public static <T> void shuffle(T[] deck, Random rng) { // fisher yates shuffle
    for (int i = deck.length - 1; i > 0; i--) {
      int source = rng.nextInt(i + 1);
      T temp = deck[i];
      deck[i] = deck[source];
      deck[source] = temp;
    }
  }


}


