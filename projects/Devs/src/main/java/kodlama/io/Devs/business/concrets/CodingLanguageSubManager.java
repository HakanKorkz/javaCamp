package kodlama.io.Devs.business.concrets;

import kodlama.io.Devs.business.abstracts.CodingLanguageSubService;
import kodlama.io.Devs.business.requests.CreateCodingLanguageSubRequest;
import kodlama.io.Devs.business.responses.GetAllCodingLanguageSubResponse;
import kodlama.io.Devs.dataAccess.abstracts.CodingLanguageSubRepository;
import kodlama.io.Devs.entities.concretes.CodingLanguageSub;

import java.util.List;

public class CodingLanguageSubManager implements CodingLanguageSubService {
    private CodingLanguageSubRepository codingLanguageSubRepository;

    @Override
    public List<GetAllCodingLanguageSubResponse> getAll() {
        return null;
    }

    @Override
    public CodingLanguageSub getById(int codingId, int libraId) {

    }
    @Override
    public CodingLanguageSub getById(int codingId) {
        return null;
    }

    @Override
    public void add(CreateCodingLanguageSubRequest createCodingLanguageSubRequest) {

    }

    @Override
    public void update(CreateCodingLanguageSubRequest createCodingLanguageSubRequest, int id) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void deleteAll() {

    }
}
