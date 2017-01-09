package soundsystem.audience;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Melomaniac {

    @Pointcut("execution(** soundsystem.MediaPlayer.play(..))")
    public void whenPlaying() {}

    @Before("whenPlaying()")
    public void turnOnDevice() {
        System.out.println("The melomaniac turned the device on.");
    }

    @AfterReturning("whenPlaying()")
    public void enjoyMusic() {
        System.out.println("The melomaniac enjoyed the music.");
    }
}
