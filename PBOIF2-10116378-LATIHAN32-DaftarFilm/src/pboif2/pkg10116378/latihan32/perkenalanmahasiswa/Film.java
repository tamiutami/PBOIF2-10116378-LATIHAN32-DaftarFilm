/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10116378.latihan32.perkenalanmahasiswa;

/**
 *
 * @author Sri Utami Ningsih
 * Nama  : Sri Utami Ningsih
 * Kelas : PBO-IF2
 * Nim   : 10116378
 */
public class Film {
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;
    
    public void nowPlaying(String parJudul, String parGenre, double parRating,
            int parDuration) {
        System.out.println("Judul Film  : " + parJudul);
        System.out.println("Genre Film  : " + parGenre);
        System.out.println("Rating Film : " + parRating);
        System.out.println("Duration Film : " + parDuration + " menit\n");
    }
}
