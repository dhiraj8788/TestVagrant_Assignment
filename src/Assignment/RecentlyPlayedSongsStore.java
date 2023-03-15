package Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RecentlyPlayedSongsStore
{
	private final int capacity;
    private Map<String, LinkedList<String>> songUserMap;

    //Creating parameterized constructor
    public RecentlyPlayedSongsStore(int capacity) {
        this.capacity = capacity;
        this.songUserMap = new HashMap<>();
    }

    //creating method to add song
    public void addSong(String user, String song) {
        if (!songUserMap.containsKey(user)) {
            songUserMap.put(user, new LinkedList<>());
        }

        LinkedList<String> songs = songUserMap.get(user);

        if (songs.contains(song)) {
            songs.remove(song);
        } else if (songs.size() == capacity) {
            songs.removeLast();
        }

        songs.addFirst(song);
    }

    public List<String> getRecentSongs(String user) {
        if (!songUserMap.containsKey(user)) {
            return new ArrayList<>();
        }

        LinkedList<String> songs = songUserMap.get(user);

        return new ArrayList<>(songs);
    }

}
