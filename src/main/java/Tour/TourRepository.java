package Tour;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface TourRepository extends PagingAndSortingRepository<Tour,Integer> {
 Collection<Tour> findAllById(Integer Id);
}
