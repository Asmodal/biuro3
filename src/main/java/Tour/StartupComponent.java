package Tour;

import org.springframework.stereotype.Component;

@Component
public class StartupComponent {
    private TourRepository tourRepository;

    public StartupComponent(TourRepository tourRepository){this.tourRepository=tourRepository }
}
