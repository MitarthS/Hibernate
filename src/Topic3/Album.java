package Topic3;
import javax.persistence.*;
import org.hibernate.annotations.CollectionOfElements;

import java.util.*;


@Entity @Table 
public class Album {
	@Id
	@Column(name="AlbumID")
	int aid;
	@Column(name="Album name")
	String name;
	@CollectionOfElements
	Map<String,Inner> photo;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String,Inner> getPhoto() {
		return photo;
	}
	public void setPhoto(Map<String, Inner> photo) {
		this.photo = photo;
	}
}
