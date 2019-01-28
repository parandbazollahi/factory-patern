package week1;

public class ChoclateCake extends DecoratorCake {

  public ChoclateCake(BasicCake SpecialCake) {
    super(SpecialCake);
  }

	  public String makeIcecream() {
	    return SpecialCake.makeCake() + addChoclate();
	  }
		  private String addChoclate() {
		    return " + dark choclate";
		  }
}