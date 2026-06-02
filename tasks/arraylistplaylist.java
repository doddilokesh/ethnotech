import java.util.ArrayList;
import java.util.*;
public class arraylistplaylist {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> playlist = new ArrayList<String>();
        System.out.println("My first song:");
        String firstSong = scanner.nextLine();
        playlist.add(firstSong);
        System.out.println("My second song:");
        String secondSong = scanner.nextLine();
        playlist.add(secondSong);
        System.out.println("My third song:");
        String thirdSong = scanner.nextLine();
        playlist.add(thirdSong);
        System.out.println("enter fourth song");
        String fourthsong =scanner.nextLine();
        playlist.add(fourthsong);

        playlist.remove(2);
        for(String song:playlist){
            System.out.println(song);
        }
    }
}

