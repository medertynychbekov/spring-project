package peaksoft.model;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Rabbit4 {

    private final Duck5 duck5;


    @Override
    public String toString() {
        return ", в зайце утка " + duck5.toString();
    }
}
