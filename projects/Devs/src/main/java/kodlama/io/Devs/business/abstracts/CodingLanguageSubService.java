package kodlama.io.Devs.business.abstracts;

import kodlama.io.Devs.business.requests.CreateCodingLanguageSubRequest;
import kodlama.io.Devs.business.responses.GetAllCodingLanguageSubResponse;

import java.util.List;

public interface CodingLanguageSubService {
    List<GetAllCodingLanguageSubResponse> getAll();

//    CodingLanguageSub getById(int codingId,int libraId);
//
//    CodingLanguageSub getById(int codingId);

    void add(final CreateCodingLanguageSubRequest createCodingLanguageSubRequest);

    void update(final  CreateCodingLanguageSubRequest createCodingLanguageSubRequest,int id);

    void delete(final int id);

    void deleteAll();

}
