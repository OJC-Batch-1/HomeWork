public class Movie { 
    private String title;
    private String studio;
    private String rating;
    // your code goes here 
    public Movie(String title,String studio,String rating){
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }
    public Movie(String title,String studio){
        this.title=title;
        this.studio=studio;;
        this.rating="PG";
    }
    public static Movie[] getPg(Movie[] mv){
        Movie obj[]=new Movie[mv.length];
        int count=0;
        for(int i=0;i<mv.length;i++){
            if(mv[i].rating.equals("PG")){
                count++;
                obj[i]=mv[i];
            }
        }
        Movie obj2[]=new Movie[count];
        for(int j=0;j<count;j++){
            obj2[j]=obj[j];
        }
        return obj2;
    }
    public static void main(String[] args) {
        Movie mv=new Movie("Casino Royale","Eon Productions","PG13");
        Movie mv2[]=new Movie[3];
        mv2[0]=new Movie("Vivah","Raj shree");
        mv2[1]=new Movie("Khiladi","SK Production");
        mv2[2]=new Movie("Rab ne bana di jodi","T series","PG5");
        Movie mv3[]=getPg(mv2);
        for(int i=0;i<mv3.length;i++){
            System.out.println(mv3[i].title);
            System.out.println(mv3[i].studio);
            System.out.println(mv3[i].rating);
        }
    }
}
