import java.util.*;

public class PlaylistService {

    LinkedList<Song> playlist = new LinkedList<>();
    Stack<Song> history = new Stack<>();
    Set<Integer> songIds = new HashSet<>();   // prevent duplicates

    // add song
    public void addSong(Song s) throws SongAlreadyExistsException {
        if (songIds.contains(s.id)) {
            throw new SongAlreadyExistsException("Song already in playlist");
        }

        playlist.add(s);
        songIds.add(s.id);
    }

    // play next song
    public void play() {
        if (playlist.isEmpty()) return;

        Song s = playlist.removeFirst();
        history.push(s);
        System.out.println("Playing: " + s);
    }

    public void showPlaylist() {
        System.out.println("Playlist: " + playlist);
    }

    public void showHistory() {
        System.out.println("Recently played: " + history);
    }
}
