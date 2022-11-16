package kodlama.io.Devs.business.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCodingLanguageSubResponse {
    private int id;
    private String codingLanguageName;
    private String libraName;
}
