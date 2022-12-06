package novel.proj.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "NOVEL")
public class Novel {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "novel_id")
	private int novelid;
	
    @Column(name = "title")
	private String title;
	
    @Column(name = "author")
	private String author;
	
    @Column(name = "genre")
	private String genre;
	
    @Column(name = "setting")
	private String setting;
	
    @Column(name = "plot")
	private String plot;
    
    // Novels require characters but characters aren't required to be in Novels
    // @OneToMany is the parent association
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "char_id")
    private Set<Character> characters;

}
