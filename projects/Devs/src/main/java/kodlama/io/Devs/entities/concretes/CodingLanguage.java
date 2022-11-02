package kodlama.io.Devs.entities.concretes;

public class CodingLanguage {
    private int id;
    private String codeName;

    public CodingLanguage() {
    }

    public CodingLanguage(int id, String codeName) {
        this.id = id;
        this.codeName = codeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }
}
