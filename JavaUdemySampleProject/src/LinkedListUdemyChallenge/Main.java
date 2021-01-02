package LinkedListUdemyChallenge;

import java.util.*;

public class Main {
    private static ArrayList<Albums> albums = new ArrayList<>();
    public static void main(String[] args) {
        Albums album  = new Albums("StromBringer","Deep Purple");
        album.addSong("Strombringer",4.6);
        album.addSong("love dont mean a thing",4.22);
        album.addSong("Holy man",4.6);
        album.addSong("Hold on",4.22);
        album.addSong("lady double dealer",4.6);
        album.addSong("high ball shooter",4.22);
        album.addSong("the gypy",4.6);
        albums.add(album);
        LinkedList<Song> playlist = new LinkedList<>();
        albums.get(0).addToPlayList("Strombringer",playlist);
        albums.get(0).addToPlayList("Holy man",playlist);
        albums.get(0).addToPlayList("the gypy",playlist);
        play(playlist);

    }
    private static void play(LinkedList<Song> playList){
        Scanner scanner =  new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator= playList.listIterator();
        if(playList.size()==0){
            System.out.println("no songs in playlist");
        }else{
            System.out.println("Now Playing "+listIterator.next().toString());
            printMenu();
        }
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("playList complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing song"+listIterator.next().toString());
                    }else{
                        System.out.println("se have reached end of play list test");
                        forward=false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward=false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("now playing"+ listIterator.previous().toString());
                    }
                    else{
                        System.out.println(" reached starting of the album");
                        forward =true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("now replaying"+ listIterator.previous().toString());
                            forward =false;
                        }else{
                            System.out.println("we are at the start of the list");

                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("now playing +" +listIterator.next());
                            forward=true;
                        }else {
                            System.out.println("we have reached end");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
            }
        }
    }
    private  static void  printMenu(){
        System.out.println("Avaiable action:\npress");
        System.out.println("0 - to quite\n"+
                            "1 - to play next song\n"+
                            "2 - to play previous song\n"+
                            "3 - to replay the current song\n"+
                            "4 - list songs in the playList\n"+
                            " 5 - print available actions.");
    }
    private static void printList(LinkedList<Song> playlist){
        Iterator<Song> iterator= playlist.iterator();
        System.out.println("=========");
        while(iterator.hasNext()){
            System.out.println(iterator.hasNext());
        }
        System.out.println("=======");
    }
}
