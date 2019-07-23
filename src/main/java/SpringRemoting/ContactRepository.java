package SpringRemoting;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContactRepository extends CrudRepository<Contact,Long> {
//    Seule méthode de ContactService non prise en charge par defaut par CrudRepo
//    On doit donc la declarer explicitement.
    List<Contact> findByFirstName(String firstName);
}
