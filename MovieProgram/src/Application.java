import java.util.Scanner;



public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Scanner scn = new Scanner(System.in);
		
		DataBase d = new DataBase();
		
		boolean flag=true;
		
		
		while(flag) {
			
			System.out.println("Add a movie -> 1");
			System.out.println("List of movies -> 2");
			System.out.println("Quit -> 3");
			System.out.print("Choose a action: ");
			
			int action = scn.nextInt(); scn.nextLine();
			
			if(action == 3) {
				System.out.println("Exited the program...");
				return; 
			}
			
			else if(action==1) {
				System.out.println("Name of movie: ");
				String movieName=scn.nextLine();
				
				System.out.println("Director: ");
				String director=scn.nextLine();
				
				System.out.println("Time: ");
				int time=scn.nextInt(); scn.nextLine();
				
				System.out.println("IMDB: ");
				double imdb=scn.nextDouble(); scn.nextLine();
				
				Movie movie = new Movie(movieName, director, time, imdb);
				
				d.addMovie(movie);
				
				}
			else if(action==2) {
				d.list();
			}
			else {
				System.out.println("incorrect action");
			}
		}
		
		
	}

}
