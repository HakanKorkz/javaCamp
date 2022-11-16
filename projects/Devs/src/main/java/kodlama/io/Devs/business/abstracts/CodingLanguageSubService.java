package kodlama.io.Devs.business.abstracts;

import kodlama.io.Devs.business.requests.CreateCodingLanguageSubRequest;
import kodlama.io.Devs.business.responses.GetAllCodingLanguageSubResponse;
import kodlama.io.Devs.entities.concretes.CodingLanguageSub;

import java.util.List;

public interface CodingLanguageSubService {
    List<GetAllCodingLanguageSubResponse> getAll();

//    CodingLanguageSub getById(int codingId,int libraId);
    CodingLanguageSub getById(int libraId) throws Exception;

    void add(final CreateCodingLanguageSubRequest createCodingLanguageSubRequest) throws Exception;

    void update(final  CreateCodingLanguageSubRequest createCodingLanguageSubRequest, int id) throws Exception;

    void delete(final int id);

    void deleteAll();

}
