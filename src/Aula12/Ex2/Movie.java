package Aula12.Ex2;

public class Movie {
	
	private String Name;
	private float score;
	private String Rating;
    private String Genre;
	private int r_time;
	

	public Movie(String Name, float score, String Rating, String Genre, int r_time) {
        this.Name = Name;
        this.score = score;
        this.Rating = Rating;
        this.Genre = Genre;
		this.r_time = r_time;
	}
	

	public String getName() {
		return Name;
	}

	public float getScore() {
		return score;
	}

	public String getRating() {
		return Rating;
	}

	public String getGenre() {
		return Genre;
	}

	public int getR_time() {
		return r_time;
	}

	@Override
	public String toString() {
		return String.format("%-40s%-10.1f%-10s%-10s%-15d", Name, score, Rating, Genre, r_time);
	}

}

