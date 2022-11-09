package kodlama.io.Devs.dataAccess.abstracts;

import kodlama.io.Devs.entities.concretes.CodingLanguageSub;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodingLanguageSubRepository extends JpaRepository<CodingLanguageSub,Integer> {
}
