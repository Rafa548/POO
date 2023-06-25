package Aula12;

public class Movie {
    private String nome;
    private double score;
    private String genre;
    private String rating;
    private int runningTime;
    public Movie(String nome, double score, String rating, String genre, int runningTime) {
        this.nome = nome;
        this.score = score;
        this.genre = genre;
        this.rating = rating;
        this.runningTime = runningTime;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }
    
    @Override
    public String toString() {
        return String.format("%-50s %-25.1f %-25s %-25s %-25d", nome, score, genre, rating, runningTime);

    }

}
