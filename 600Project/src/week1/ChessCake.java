package week1;

public class ChessCake extends DecoratorCake {

  public ChessCake(BasicCake SpecialCake) {
    super(SpecialCake);
  }

	  public String makeCake() {
	    return SpecialCake.makeCake() + addChess();
	  }

		  private String addChess() {
		    return " + strawbery chess";
		  }
}