package week1;

public class Test {
  public static void main(String args[]) {
	  BasicCake cake = new ChoclateCake(new ChessCake(new SimpleCake()));
      System.out.println(cake.makeCake());
  }
}