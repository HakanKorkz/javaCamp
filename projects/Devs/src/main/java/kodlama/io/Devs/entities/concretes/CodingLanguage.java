package kodlama.io.Devs.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "codings")
@Data
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CodingLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "codeName")
    private String codeName;
    @OneToMany(mappedBy = "codingLanguage")
    private List<CodingLanguageSub> codingLanguageSubs;
}
