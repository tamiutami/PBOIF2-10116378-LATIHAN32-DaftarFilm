/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10116378.latihan32.perkenalanmahasiswa;

/**
 *
 *@author Sri Utami Ningsih
 * Nama  : Sri Utami Ningsih
 * Kelas : PBO-IF2
 * Nim   : 10116378
 */
public class DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Film film1 = new Film();
        film1.filmName = "Venom";
        film1.filmGenre = "Action, Horor, Scifi";
        film1.filmRating = 8.5;
        film1.filmDuration = 120;
        film1.nowPlaying(film1.filmName, film1.filmGenre, film1.filmRating,
                film1.filmDuration);

        Film film2 = new Film();
        film2.filmName = "Small Foot";
        film2.filmGenre = "Animation";
        film2.filmRating = 9.0;
        film2.filmDuration = 96;
        film2.nowPlaying(film2.filmName, film2.filmGenre, film2.filmRating,
                film2.filmDuration);

        Film film3 = new Film();
        film3.filmName = "Crazy Rich Asian";
        film3.filmGenre = "Comedy";
        film3.filmRating = 7.8;
        film3.filmDuration = 119;
        film3.nowPlaying(film3.filmName, film3.filmGenre, film3.filmRating,
                film3.filmDuration);

        Film film4 = new Film();
        film4.filmName = "Asih";
        film4.filmGenre = "Horor";
        film4.filmRating = 6.0;
        film4.filmDuration = 100;
        film4.nowPlaying(film4.filmName, film4.filmGenre, film4.filmRating,
                film4.filmDuration);
    }
    
}
