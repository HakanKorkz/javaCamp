package kodlama.io.Devs.dataAccess.abstracts;


import kodlama.io.Devs.entities.concretes.CodingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodingLanguageRepository extends JpaRepository<CodingLanguage,Integer> {

}
