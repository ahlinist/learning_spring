package soundsystem.audience;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Melomaniac {

    @Pointcut("execution(** soundsystem.MediaPlayer.play(..))")
    public void whenPlaying() {}

    @Around("whenPlaying()")
    private void listenToCDPlayer(ProceedingJoinPoint jp)  throws Throwable {
        System.out.println("The melomaniac turned the device on.");
        jp.proceed();
        System.out.println("The melomaniac enjoyed the music.");
    }
}
