public class Main {
    public static void main(String[] args) {

        PlaylistService service = new PlaylistService();

        try {
            service.addSong(new Song(1, "Believer"));
            service.addSong(new Song(2, "Numb"));
            service.addSong(new Song(1, "Believer"));  // duplicate
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        service.showPlaylist();

        service.play();
        service.play();

        service.showHistory();
    }
}
