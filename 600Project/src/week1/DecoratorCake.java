package week1;

abstract class DecoratorCake implements BasicCake {

  protected BasicCake SpecialCake;

	  public DecoratorCake(BasicCake SpecialCake) {
	    this.SpecialCake = SpecialCake;
	  }

	  	public String makeCake() {
	    return SpecialCake.makeCake();
	  	}
}
