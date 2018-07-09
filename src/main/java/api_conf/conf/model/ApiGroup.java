package api_conf.conf.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@Entity
@Table(name="api_group")
@DatabaseTable(tableName = "api_group")
public class ApiGroup {
	
	@DatabaseField(id = true)
	private Integer id;
	@NotNull
	@Size(min=1, max=32, message="Group name must be between 1 and 32 characters")
	@DatabaseField
	private String name;
	
	public ApiGroup() {
		super();
	}
	public ApiGroup(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Id @GeneratedValue(strategy=IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="name",length=255)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
