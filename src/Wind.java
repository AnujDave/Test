
public class Wind extends Instrument{

	private String brass,woodwind;
	
	public Wind(String b, String w){
		brass=b;
		woodwind=w;
	}
	
	public String gettype(){
		return (brass+" "+woodwind);
	}
	
	
}
