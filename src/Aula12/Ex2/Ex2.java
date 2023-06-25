package Aula12.Ex2;

import java.util.*;
import java.io.*;

public class Ex2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new FileReader("movies.txt"));
        ArrayList<String> lines = new ArrayList<>();
        ArrayList<ArrayList<String>> lista_movies = new ArrayList<>();
        while (input.hasNextLine()) {
            String line = input.nextLine();
            lines.add(line);
        }
        for (int i=1;i<lines.size();i++){
            ArrayList<String> lista2 = new ArrayList<>();
            String[] params = lines.get(i).split("\t");
            for (String p : params){
                lista2.add(p);
            }
            lista_movies.add(lista2);
        }
        ArrayList<Movie> l_movies = new ArrayList<>();
        
        for (ArrayList<String> M : lista_movies){
            l_movies.add(new Movie(M.get(0),Float.parseFloat(M.get(1)),M.get(2),M.get(3),Integer.parseInt(M.get(4))));
        }

        //b)
        l_movies.sort((a,b) -> a.getName().compareToIgnoreCase(b.getName()));
        for (Movie M_1 : l_movies) {
			 System.out.println(M_1);				
		}
        //c) 1

        l_movies.sort((a,b) -> Float.compare(a.getScore(),b.getScore()));
        for (Movie M_2 : l_movies) {
			 System.out.println(M_2);				
		}

        //c 2
        l_movies.sort((a,b) -> Integer.compare(b.getR_time(),a.getR_time()));
        for (Movie M_3 : l_movies) {
			 System.out.println(M_3);				
		}

        //d 
        ArrayList<String> Genres = new ArrayList<>();
        for (ArrayList<String> movies : lista_movies){
            if (!Genres.contains(movies.get(3)))
                Genres.add(movies.get(3));
        }

        for (String gen : Genres) {
            System.out.println(gen);    
        }

        //e
        PrintWriter out = new PrintWriter(new File("myselection.txt"));
        ArrayList<Movie> m_c = new ArrayList<>();
        String c = "comedy";
        for (ArrayList<String> mov : lista_movies) {
            if (mov.get(3).equals(c) && Float.parseFloat(mov.get(1)) > 60){
                m_c.add(new Movie(mov.get(0),Float.parseFloat(mov.get(1)),mov.get(2),mov.get(3),Integer.parseInt(mov.get(4))));
            }
        }
        for (Movie m : m_c){
            out.println(m);
        }
        out.close();
    }
        
}
