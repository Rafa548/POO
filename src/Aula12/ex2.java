package Aula12;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ex2 {
    public static void main(String[] args) throws IOException {
        // (b
        List<Movie> MovieList = new ArrayList<>();
        Scanner Movies = new Scanner(new FileReader("src/Aula12/movies.txt"));
        Movies.nextLine();
        while (Movies.hasNextLine()) {
            String[] MovieInfo = Movies.nextLine().split("\t");
            MovieList.add(new Movie(MovieInfo[0], Double.parseDouble(MovieInfo[1]), MovieInfo[2], MovieInfo[3],
                    Integer.parseInt(MovieInfo[4])));
        }

        System.out.println(String.format("%-50s %-25s %-25s %-25s %-25s", "Name", "Score", "rating", "Genre",
                "Running Time"));
        MovieList.sort((Movie m1, Movie m2) -> m1.getNome().compareTo(m2.getNome()));
        for (Movie Movie : MovieList) {
            System.out.println(Movie); // b)
        } // (c

        MovieList.sort(
                (Movie m1, Movie m2) -> {
                    if (m1.getScore() > m2.getScore()) {
                        return -1;
                    } else if (m1.getScore() < m2.getScore()) {
                        return 1;
                    } else {
                        return 0;
                    }
                });

        System.out.println(String.format("\n\n\n%-50s %-25s %-25s %-25s %-25s", "Name", "Score", "rating", "Genre",
                "Running Time"));
        for (Movie Movie : MovieList) {
            System.out.println(Movie);
        }

        MovieList.sort(
                (Movie m1, Movie m2) -> {
                    if (m1.getRunningTime() < m2.getRunningTime()) {
                        return -1;
                    } else if (m1.getRunningTime() > m2.getRunningTime()) {
                        return 1;
                    } else {
                        return 0;
                    }
                });
        System.out.println(String.format("\n\n\n%-50s %-25s %-25s %-25s %-25s", "Name", "Score", "rating", "Genre",
                "Running Time"));
        for (Movie Movie : MovieList) {
            System.out.println(Movie);
        }
        // c)
        // (d
        Set<String> GenreList = new HashSet<>();
        for (Movie Movie : MovieList) {
            GenreList.add(Movie.getGenre());
        }
        System.out.println("\n");
        System.out.println("Genres: " + GenreList);
        // d)
        // (e
        try {
            File file = new File("myselection.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(String.format("%-50s %-25s %-25s %-25s %-25s", "Name", "Score", "rating", "Genre",
            "Running Time"));
            for (Movie movie : MovieList) {
                if (movie.getGenre().equals("comedy") && movie.getScore() > 60){
                    writer.write(movie.toString() + "\n");
                }
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Failed to write to file");
            e.printStackTrace();
        } //e)

    }
}