

public class DataBase {
	int databaseCapacity=3;
	Movie[] movies= new Movie[databaseCapacity];
	
	int sayac=0;
	
	
	public void addMovie(Movie movie) {
		if(sayac>=databaseCapacity) {
			System.out.println("No capacity ");
			return;
		}
		
		movies[sayac]=movie;
		sayac++;
	}
	
	public void list() {
		for(int i=0;i<sayac;i++) {
			movies[i].Info();
		}
	}
}
