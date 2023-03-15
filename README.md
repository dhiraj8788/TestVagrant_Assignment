# TestVagrant_Assignment

Recently Played Songs Store is a Java program that stores and retrieves recently played songs for a user. 
The program uses a hash map to store the songs for each user and a linked list to maintain the order of the recently played songs.

To use the Recently Played Songs Store, you can create an instance of the class with a capacity for the number of recently played songs to store.
Then, you can add songs for a user and retrieve their recently played songs.


The code is for a Java class called RecentlyPlayedSongsStore which stores and retrieves recently played songs for a user. The class has a constructor that takes an integer capacity as a parameter, which represents the maximum number of recently played songs that can be stored for each user.

The class contains a private instance variable songUserMap of type Map<String, LinkedList<String>>, which is a HashMap that maps each user to a linked list of their recently played songs.

The addSong method takes two string parameters: user and song. It first checks if the user already has a linked list of recently played songs in the songUserMap. If not, it creates a new linked list for the user.

Next, it retrieves the linked list of songs for the given user and performs the following operations:

If the song is already in the list, it removes it from its current position and adds it to the beginning of the list.
If the list is at its maximum capacity, it removes the last song and adds the new song to the beginning of the list.
If the list is not at its maximum capacity and the song is not already in the list, it adds the song to the beginning of the list.
The getRecentSongs method takes a string parameter user and returns a list of the most recently played songs for the given user. If the user does not have a linked list of recently played songs, an empty list is returned. Otherwise, the method returns a copy of the linked list of songs for the user as an ArrayList.

The MainMethod class contains a main method that creates an instance of the RecentlyPlayedSongsStore class and adds several songs for the user "Song". It then prints the user's most recently played songs after each addition.
