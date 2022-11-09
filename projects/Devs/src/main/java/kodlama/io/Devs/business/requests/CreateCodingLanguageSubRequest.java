package kodlama.io.Devs.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCodingLanguageSubRequest {
    private String libraName;
    private int codingLanguageId;

}
