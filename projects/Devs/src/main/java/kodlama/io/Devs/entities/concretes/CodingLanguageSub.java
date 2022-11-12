package kodlama.io.Devs.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "libraries")
@Data
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CodingLanguageSub {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "libraName")
    private String libraName;
    @ManyToOne
    @JoinColumn(name = "coding_language_id")
    private CodingLanguage codingLanguage;

}
