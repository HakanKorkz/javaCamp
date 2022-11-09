package kodlama.io.Devs.business.abstracts;

import kodlama.io.Devs.business.requests.CreateCodingLanguageSubRequest;
import kodlama.io.Devs.business.responses.GetAllCodingLanguageSubResponse;
import kodlama.io.Devs.entities.concretes.CodingLanguageSub;

import java.util.List;

public interface CodingLanguageSubService {
    List<GetAllCodingLanguageSubResponse> getAll();

    CodingLanguageSub getById(int codingId,int libraId);

    CodingLanguageSub getById(int codingId);

    void add(CreateCodingLanguageSubRequest createCodingLanguageSubRequest);

    void update(CreateCodingLanguageSubRequest createCodingLanguageSubRequest,int id);

    void delete(int id);

    void deleteAll();

}
