package compares;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Game implements Comparable<Game> {

    private double rating;
    private String name;
    private int year;

    public Game(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    @Override
    public int compareTo(Game o) {
        return this.year - o.year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    static class RatingComparator implements Comparator<Game> {

        @Override
        public int compare(Game o1, Game o2) {
            if(o1.rating > o2.rating) return 1;
            if(o1.rating < o2.rating) return -1;
            else return 0;
        }
    }

    static class NameComparator implements Comparator<Game> {

        @Override
        public int compare(Game o1, Game o2) {
            return o1.name.compareTo(o2.name);
        }
    }

}

class GameCoparisons {
    public static void main(String[] args) {
        List<Game> games = new ArrayList<>();
        Game medalOfHonor = new Game(8, "Medal Of Honor", 2002);
        Game igi = new Game(7, "Project IGI", 2000);
        Game cs = new Game(9, "Counter strike", 2008);
        games.add(medalOfHonor);
        games.add(igi);
        games.add(cs);

        Game.RatingComparator ratingComparator = new Game.RatingComparator();
        Collections.sort(games, ratingComparator);
        games.forEach(game -> System.out.println(game.getName() + " " + game.getYear() + " " + game.getRating()));

        System.out.println("Now will be sorted against names------------>");
        Game.NameComparator nameComparator = new Game.NameComparator();
        Collections.sort(games, nameComparator);
        games.forEach(game -> System.out.println(game.getName() + " " + game.getYear() + " " + game.getRating()));

        System.out.println("Now we can use comparable to sort by year------------>");
        Collections.sort(games);
        games.forEach(game -> System.out.println(game.getName() + " " + game.getYear() + " " + game.getRating()));

    }
}
