package pl.Muthukumar.BusTicketsBooking.models.respositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.Muthukumar.BusTicketsBooking.models.PassengerModel;

import java.util.List;

@Repository
public interface PassengerRespository extends CrudRepository<PassengerModel, Integer> {
    List<PassengerModel> findAll();
    void deleteAllByNumberPassenger(int number);

}
