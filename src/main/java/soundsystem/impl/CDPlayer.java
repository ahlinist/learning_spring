package soundsystem.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import soundsystem.MediaPlayer;
import soundsystem.cd.CompactDisc;
import soundsystem.cd.qualifier.Metal;
import soundsystem.cd.qualifier.Rock;

@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired
    @Rock
    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}