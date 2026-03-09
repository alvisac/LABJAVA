package Lab8;

import java.util.Scanner;

public class Recording2 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Recording[] songs = new Recording[5];

        for(int i = 0; i < songs.length; i++){

            songs[i] = new Recording();

            System.out.println("Enter title:");
            songs[i].setTitle(input.nextLine());

            System.out.println("Enter artist:");
            songs[i].setArtist(input.nextLine());

            System.out.println("Enter playing time (seconds):");
            songs[i].setPlayingTime(input.nextInt());
            input.nextLine();
        }

        System.out.println("Sort by:");
        System.out.println("1 - Title");
        System.out.println("2 - Artist");
        System.out.println("3 - Playing Time");

        int choice = input.nextInt();

        for(int i = 0; i < songs.length - 1; i++){
            for(int j = i + 1; j < songs.length; j++){

                boolean swap = false;

                if(choice == 1){
                    if(songs[i].getTitle().compareTo(songs[j].getTitle()) > 0)
                        swap = true;
                }

                else if(choice == 2){
                    if(songs[i].getArtist().compareTo(songs[j].getArtist()) > 0)
                        swap = true;
                }

                else if(choice == 3){
                    if(songs[i].getPlayingTime() > songs[j].getPlayingTime())
                        swap = true;
                }

                if(swap){
                    Recording temp = songs[i];
                    songs[i] = songs[j];
                    songs[j] = temp;
                }
            }
        }

        System.out.println("\nSorted Recordings:\n");

        for(int i = 0; i < songs.length; i++){
            System.out.println(
                    songs[i].getTitle() + " - " +
                            songs[i].getArtist() + " - " +
                            songs[i].getPlayingTime() + " seconds"
            );
        }
    }
}