package kodlama.io.Devs.business.abstracts;

import kodlama.io.Devs.business.requests.CreateCodingLanguageRequest;
import kodlama.io.Devs.business.responses.GetAllCodingsLanguageRequest;

import java.util.List;

public interface CodingLanguageService {
    List<GetAllCodingsLanguageRequest> getAll();

    void add(CreateCodingLanguageRequest createCodingLanguageRequest) throws Exception;

    void update(CreateCodingLanguageRequest createCodingLanguageRequest, int id) throws Exception;

    void delete(int id);


}
