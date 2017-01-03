package soundsystem.cd.impl;

import org.springframework.stereotype.Component;
import soundsystem.cd.CompactDisc;
import soundsystem.cd.qualifier.Rock;

@Component
@Rock
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}