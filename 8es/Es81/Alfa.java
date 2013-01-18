public class Alfa {
	private int x;
	private static int y = 5;

	public Alfa(){
		y++;
	}

	public void inc(){
		x++;
	}

	public int getTotale(){
		return x+y;
	}
}
