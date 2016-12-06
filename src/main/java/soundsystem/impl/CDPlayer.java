package soundsystem.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import soundsystem.MediaPlayer;
import soundsystem.cd.CompactDisc;
import soundsystem.cd.qualifier.Metal;

@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired
    //@Metal
    @Qualifier("theBlackWaltz")
    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}