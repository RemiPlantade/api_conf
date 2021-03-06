package api_conf.conf.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@Entity
@Table(name="api_bean")
@DatabaseTable(tableName = "api_bean")
public class ApiBean {
	@DatabaseField(id = true)
	private Integer id;
	@DatabaseField
	private String name;
	@DatabaseField
	private Boolean managed;
	@DatabaseField(columnName = "url_bean_name")
	private String urlBeanName;
	@DatabaseField(columnName = "bean_url")
	private String beanUrl;

	public ApiBean() {
		super();
	}

	public ApiBean(Integer id, String name, Boolean managed) {
		super();
		this.id = id;
		this.name = name;
		this.managed = managed;
	}
	@Id @GeneratedValue(strategy=IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="name", length=45)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="managed")
	public Boolean getManaged() {
		return managed;
	}
	public void setManaged(Boolean managed) {
		this.managed = managed;
	}
	@Column(name="url_bean_name", length=200)
	public String getUrlBeanName() {
		return urlBeanName;
	}

	public void setUrlBeanName(String urlBeanName) {
		this.urlBeanName = urlBeanName;
	}
	@Column(name="bean_url", length=255)
	public String getBeanUrl() {
		return beanUrl;
	}

	public void setBeanUrl(String beanUrl) {
		this.beanUrl = beanUrl;
	}
	
}
