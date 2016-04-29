package flexjoy.newod.domain;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;

/**
 * @author Sergey Cherepanov on 12.04.2016.
 */

@Entity
@Table(name = "store")
public class Store {

	@Id
	@GeneratedValue
	private int id;

	@NotBlank
	@Length(min = 3, max = 45)
	private String name;

	private boolean enabled = true;

	@ManyToOne
	@JoinColumn(name = "city_id", nullable = false)
	private City city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
}
