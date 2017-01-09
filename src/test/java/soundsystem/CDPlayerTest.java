package soundsystem;

import static org.junit.Assert.*;

import config.CDPlayerConfig;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.cd.CompactDisc;
import soundsystem.cd.qualifier.Metal;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= CDPlayerConfig.class)
public class CDPlayerTest {
    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Autowired
    private MediaPlayer player;

    @Autowired
    @Metal
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }

    @Test
    public void play() {
        player.play();
        assertTrue(log.getLog().contains("The melomaniac turned the device on."));
        assertTrue(log.getLog().contains("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles"));
        assertTrue(log.getLog().contains("The melomaniac enjoyed the music."));
    }
}