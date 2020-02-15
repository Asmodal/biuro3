//package Tour;
//
//import com.example.entity.Tour;
//import com.example.repository.TourRepository;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//
//@Component
//public class StartupComponent {
//    private TourRepository tourRepository;
//
//    public StartupComponent(TourRepository tourRepository){this.tourRepository=tourRepository; }
//    @PostConstruct
//    public void init(){tourRepository.save( new Tour("Wycieczka na Alaske",9,"Polska",
//            "Alaska",2099, "Wylot 03.02.2020","09.0.2020")); }
//}
