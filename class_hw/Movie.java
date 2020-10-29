public class Movie {
	private String title;
	private String studio;
	private String rating;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie mf=new Movie("iron man","marvel studios","PG13");
		
		Movie mf1=new Movie("the dark knight","warner bros pictures");
		
		Movie m1=new Movie("guest inn london","panorama studios","PG");
		Movie m2=new Movie("kahaani","Viacom 18 Motion Pictures Pen India Limited");
		Movie m3=new Movie("Eon Productions","Casino Royale","PG");
		Movie m4=new Movie("venom","colombia pictures","PG5");
		Movie m5=new Movie("gangs of wasseypur","eagle pictures","PG");
		mf1.MovieDetails();
		mf.MovieDetails();
		Movie[] movies={m1,m2,m3,m4,m5};
		Movie[] newMovies=m1.getPG(movies);
		System.out.println("_________________________movies with rating PG_______________________");	
		for(int i=0; i<newMovies.length; i++) {
				System.out.print("movie name = "+newMovies[i].title + "||| ");
				System.out.print("Studio = "+newMovies[i].studio + "||| ");
				System.out.print("Rating = "+newMovies[i].rating);
				System.out.println("\n");
				
		    }

	}
	
	public Movie(String title,String studio,String rating){
		this.title=title;
		this.studio=studio;
		this.rating=rating;
	}
	public void MovieDetails(){
		System.out.println("movie name = " + title + "||| Studio = " + studio + "||| Rating = " + rating);
	}
		
	public Movie(String title,String studio){
		this.title=title;
		this.studio=studio;
		this.rating="PG";
	}
	public Movie[] getPG(Movie[] mov){
		Movie[] newMovie=new Movie[mov.length];
		int count=0;
		for(int i=0;i<mov.length;i++){
			Movie m=mov[i];
			if(m.rating=="PG"){
				newMovie[count]=m;
				count++;
			}
		}
		Movie[] newMov=new Movie[count];
			for(int i=0;i<count;i++){
				newMov[i]=newMovie[i];
				}
				return newMov;
			} 
	public Movie(){
		String title="Eon Productions";
		String studio="Casino Royale";
		String rating="PG13";
	System.out.println("title of movie="+title +", studio of movie="+studio +", rating of movie="+rating);
	}
}
