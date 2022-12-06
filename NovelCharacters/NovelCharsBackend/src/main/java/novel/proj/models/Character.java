package novel.proj.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "FICTIONAL_CHARACTER")
public class Character {
	
    @Id
    @Column(name = "char_id")
    @GeneratedValue(generator = "character_id_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(allocationSize = 1, name = "character_id_seq")
	private int charid;
	
    @Column(name = "char_name")
	private String charname;
	
    @Column(name = "char_age")
	private int charage;
    
    @Column(name = "char_gender")
	private String chargender;
    
    @Column(name = "char_ability")
	private String charability;
	
    @Column(name = "char_description")
	private String chardescription;
    
}
