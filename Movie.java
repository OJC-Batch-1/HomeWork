package ClassProgram;

public class Movie {

	private String title;
	private String studio;
	private String rating;

	public Movie(String title, String studio, String rating) {
		this.title = title;
		this.studio = studio;
		this.rating = rating;
	}

	public Movie(String title, String studio) {
		this.title = title;
		this.studio = studio;
		rating = "PG";
	}

	public Movie() {}

	private Movie[] getPG(Movie[] movies) {
		int j = 0;
		Movie[] obj1 = new Movie[movies.length];
		for (int i = 0; i < movies.length; i++) {
			if (movies[i].rating == "PG") {
				obj1[j++] = movies[i];
			}
		}
		Movie obj2[] = new Movie[j];
		for (int i = 0; i < obj2.length; i++) {
			obj2[i] = obj1[i];
		}
		return obj2;
	}

	public static void main(String[] args) {

		Movie m1 = new Movie("Casino Royale", "Eon Productions", "PG­13");
		Movie m2 = new Movie("Stills Collection", "Sony Pic.");
		Movie m3 = new Movie("Jessica Jones", "S.Pictures", "PG-10");
		Movie m4 = new Movie("Black Sales", "United Art.", "PG-4");
		Movie m5 = new Movie("Guardians Galaxy", "A.Production");
		Movie m6 = new Movie("Vertigo galaxy", "Paramount");

		Movie[] movies = { m1, m2, m3, m4, m5, m6 };

		Movie m = new Movie();

		Movie[] films = m.getPG(movies);

		System.out.println("S No." + " \t\t " + "Title" + " \t\t " + "Studio" + " \t\t " + "Rating");
		for (int i = 0; i < films.length; i++) {
			System.out.println(i + 1 + " \t " + films[i].title + " \t " + films[i].studio + " \t\t " + films[i].rating);
		}
	}

}
