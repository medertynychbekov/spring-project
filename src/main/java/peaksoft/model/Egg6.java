package peaksoft.model;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Egg6 {

    private final Needle7 needle7;

    @Override
    public String toString() {
        return ", в яйце иголка " + needle7.toString();
    }
}
