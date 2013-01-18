
public class Beta extends Alfa {
	private int w = 7;

	public void inc() {
		super.inc();
		w++;
		}
	public int getTotale(){
		return super.getTotale() + w;
	}
}
