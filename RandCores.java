import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

class RandCores {
  private static ArrayList<String> cores = new ArrayList<String>();
  
  public static ArrayList rgb(int qntCores) {
    for (int i = 0; i < qntCores; i++) {
      cores.add("#"+String.format("%x", new Random().nextInt()).substring(0,6));
    }
    return cores;
  }
}

public class Main {
  public static void main(String[] args) {
    int qntCores = new Scanner(System.in).nextInt();
    System.out.println(RandCores.rgb(qntCores));
  }
}
