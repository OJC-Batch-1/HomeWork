
public class Movie {
	private String title;
	private String studio;
	private String rating;

	/*part(a)*/
	public Movie(String t,String s,String r) {
		title=t;
		studio=s;
		rating=r;
	}
	
	/*part(b)*/
	public Movie (String t, String s) {
		title = t;
		studio=s;
		rating="PG";
	}
	
	/*part(c)*/
	public static Movie[] getPG(Movie[] m) {
		Movie[] mo=new Movie[m.length];
		int newArr=0;
		for(int i=0;i<m.length;i++) {
			if(m[i].rating.equals("PG")) {
				mo[newArr]=m[i];
				newArr++;
			}
		}
		return mo;
	}
	
	/*part(d)*/
	Movie mov = new Movie("Casino Royale","EonProductions","PG-13");


}
