package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("timer")
public class Timer {
    @Qualifier("dogBean")
    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
