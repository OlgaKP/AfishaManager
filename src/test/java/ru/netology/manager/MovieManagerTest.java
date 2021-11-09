package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    public void shouldAddNullMovie() {
        MovieManager manager = new MovieManager(0);
        manager.addMovie(null);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneMovieWithConstructor() {
        MovieManager manager = new MovieManager(1);
        Movie one = new Movie(12233445, "One", "drama", "jnncnkc");
        manager.addMovie(one);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{one};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneMovieWithoutConstructor() {
        MovieManager manager = new MovieManager();
        Movie one = new Movie(12233445, "One", "drama", "jnncnkc");
        manager.addMovie(one);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{one};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddTenMovieWithConstructor() {
        MovieManager manager = new MovieManager(10);
        Movie one = new Movie(12233445, "One", "drama", "jnncnkc");
        Movie two = new Movie(56565454, "Two", "drama", "mm,ncnkc");
        Movie three = new Movie(545, "Three", "triller", "qqqqkc");
        Movie four = new Movie(1212, "Four", "drama", "wwncnkc");
        Movie five = new Movie(56565, "Five", "drama", "jnncnkc");
        Movie six = new Movie(787, "Six", "drama", "jnncnkc");
        Movie seven = new Movie(32, "Seven", "drama", "jnncnkc");
        Movie eigth = new Movie(111, "Eigth", "drama", "jnncnkc");
        Movie nine = new Movie(56, "Nine", "drama", "jnncnkc");
        Movie ten = new Movie(45, "Ten", "drama", "jnncnkc");

        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eigth);
        manager.addMovie(nine);
        manager.addMovie(ten);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{ten, nine, eigth, seven, six, five, four, three, two, one};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddTenMovieWithoutConstructor() {
        MovieManager manager = new MovieManager();
        Movie one = new Movie(12233445, "One", "drama", "jnncnkc");
        Movie two = new Movie(56565454, "Two", "drama", "mm,ncnkc");
        Movie three = new Movie(545, "Three", "triller", "qqqqkc");
        Movie four = new Movie(1212, "Four", "drama", "wwncnkc");
        Movie five = new Movie(56565, "Five", "drama", "jnncnkc");
        Movie six = new Movie(787, "Six", "drama", "jnncnkc");
        Movie seven = new Movie(32, "Seven", "drama", "jnncnkc");
        Movie eigth = new Movie(111, "Eigth", "drama", "jnncnkc");
        Movie nine = new Movie(56, "Nine", "drama", "jnncnkc");
        Movie ten = new Movie(45, "Ten", "drama", "jnncnkc");

        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eigth);
        manager.addMovie(nine);
        manager.addMovie(ten);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{ten, nine, eigth, seven, six, five, four, three, two, one};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMoreTenMovieWithConstructor() {
        MovieManager manager = new MovieManager(10);
        Movie one = new Movie(12233445, "One", "drama", "jnncnkc");
        Movie two = new Movie(56565454, "Two", "drama", "mm,ncnkc");
        Movie three = new Movie(545, "Three", "triller", "qqqqkc");
        Movie four = new Movie(1212, "Four", "drama", "wwncnkc");
        Movie five = new Movie(56565, "Five", "drama", "jnncnkc");
        Movie six = new Movie(787, "Six", "drama", "jnncnkc");
        Movie seven = new Movie(32, "Seven", "drama", "jnncnkc");
        Movie eigth = new Movie(111, "Eigth", "drama", "jnncnkc");
        Movie nine = new Movie(56, "Nine", "drama", "jnncnkc");
        Movie ten = new Movie(45, "Ten", "drama", "jnncnkc");
        Movie elleven = new Movie(709, "Elleven", "drama", "jnncnkc");
        Movie twelve = new Movie(38, "Twelve", "drama", "jnncnkc");

        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eigth);
        manager.addMovie(nine);
        manager.addMovie(ten);
        manager.addMovie(elleven);
        manager.addMovie(twelve);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{twelve, elleven, ten, nine, eigth, seven, six, five, four, three};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMoreTenMovieWithoutConstructor() {
        MovieManager manager = new MovieManager(10);
        Movie one = new Movie(12233445, "One", "drama", "jnncnkc");
        Movie two = new Movie(56565454, "Two", "drama", "mm,ncnkc");
        Movie three = new Movie(545, "Three", "triller", "qqqqkc");
        Movie four = new Movie(1212, "Four", "drama", "wwncnkc");
        Movie five = new Movie(56565, "Five", "drama", "jnncnkc");
        Movie six = new Movie(787, "Six", "drama", "jnncnkc");
        Movie seven = new Movie(32, "Seven", "drama", "jnncnkc");
        Movie eigth = new Movie(111, "Eigth", "drama", "jnncnkc");
        Movie nine = new Movie(56, "Nine", "drama", "jnncnkc");
        Movie ten = new Movie(45, "Ten", "drama", "jnncnkc");
        Movie elleven = new Movie(709, "Elleven", "drama", "jnncnkc");
        Movie twelve = new Movie(38, "Twelve", "drama", "jnncnkc");

        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eigth);
        manager.addMovie(nine);
        manager.addMovie(ten);
        manager.addMovie(elleven);
        manager.addMovie(twelve);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{twelve, elleven, ten, nine, eigth, seven, six, five, four, three};
        assertArrayEquals(expected, actual);
    }
}