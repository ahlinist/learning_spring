package soundsystem.cd.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import soundsystem.cd.CompactDisc;
import soundsystem.cd.qualifier.Metal;

@Component
@Metal
public class TheBlackWaltz implements CompactDisc{
    private String title = "The Black Waltz";
    private String artist = "Kalmah";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
