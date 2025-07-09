import Interfaces.MusicPlayer;
import Interfaces.VideoPlayer;
import records.User;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var teste = MusicPlayer.message;
        System.out.println(teste);

        Smartphone smartphone = new Smartphone();
        runMusic(smartphone);
        runVideo(smartphone);


        List<User> users = List.of(
                new User("Maria", 21),
                new User("Antonia", 28),
                new User("Cecilia", 1),
                new User("Barbara", 85),
                new User("Carla", 33));

    }


    public static void runVideo(VideoPlayer videoPlayer){
        videoPlayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer){
        musicPlayer.playMusic();
    }
}