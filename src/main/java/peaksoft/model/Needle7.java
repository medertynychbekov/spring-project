package peaksoft.model;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Needle7 {

    private final Deth8 deth8;

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + deth8.toString();
    }
}
