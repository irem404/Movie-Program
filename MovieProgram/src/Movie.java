
public class Movie {
	String name;
	String director;
	int time;
	
	double imdb;
	
	public Movie (String name, String director, int time, double imdb) {
		this.name = name;
		this.director = director;
		this.time =  time;
		this.imdb = imdb;
		
	}
	
	public void Info() {
		String info = name + " " + 
				director + " " + 
				time + " " +
				imdb;
		
		System.out.println(info);
	}
	
	
	
}
