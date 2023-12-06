package org.example.week8.task4;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StartGenreFilter {
    public static void main(String[] args) {
        // Create a playlist of songs
        List<Song> playlist = new ArrayList<>();
        playlist.add(new Song("Song1", "Artist1", "Pop"));
        playlist.add(new Song("Song2", "Artist2", "Rock"));
        playlist.add(new Song("Song3", "Artist3", "Pop"));
        playlist.add(new Song("Song4", "Artist4", "Hip-Hop"));
        playlist.add(new Song("Song5", "Artist5", "Rock"));


        GenreFilterIterator iterator = new GenreFilterIterator(playlist, "Pop");

        System.out.println("Songs with the target genre:");
        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println("Title: " + song.getTitle() + ", Artist: " + song.getArtist() + ", Genre: " + song.getGenre());
        }
    }
}
