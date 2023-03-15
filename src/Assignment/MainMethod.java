package Assignment;

public class MainMethod 
{
	public static void main(String[] args) {
	    RecentlyPlayedSongsStore store = new RecentlyPlayedSongsStore(3);

	    store.addSong("Song", "S1");
	    store.addSong("Song", "S2");
	    store.addSong("Song", "S3");

	    System.out.println(store.getRecentSongs("Song")); // [S3, S2, S1]

	    store.addSong("Song", "S4");

	    System.out.println(store.getRecentSongs("Song")); // [S4, S3, S2]

	    store.addSong("Song", "S2");

	    System.out.println(store.getRecentSongs("Song")); // [S2, S4, S3]

	    store.addSong("Song", "S1");

	    System.out.println(store.getRecentSongs("Song")); // [S1, S2, S4]
	}

}
