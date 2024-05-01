package peaksoft.model;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Ocean1 {

    private final Island2 island;

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }
}
