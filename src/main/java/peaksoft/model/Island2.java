package peaksoft.model;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Island2 {

    private final Wood3 wood;

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }
}
