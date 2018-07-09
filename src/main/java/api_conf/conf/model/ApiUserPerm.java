package api_conf.conf.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@Entity
@Table(name="api_user_perm")
@DatabaseTable(tableName = "api_user_perm")
public class ApiUserPerm {
	@DatabaseField(id = true)
	private Integer id;
	@DatabaseField(foreign = true)
	private ApiBean apiBean;
	@DatabaseField(foreign = true)
	private ApiUser apiUser;
	@DatabaseField
	private Boolean selection;
	@DatabaseField
	private Boolean deletion;
	@DatabaseField
	private Boolean updating;
	@DatabaseField
	private Boolean creation;
	
	public ApiUserPerm() {
		super();
	}
	
	public ApiUserPerm(Integer id, ApiBean apiBean, ApiUser apiUser, Boolean selection,
			Boolean deletion, Boolean updating, Boolean creation) {
		super();
		this.id = id;
		this.apiBean = apiBean;
		this.apiUser = apiUser;
		this.selection = selection;
		this.deletion = deletion;
		this.updating = updating;
		this.creation = creation;
	}
	@Id @GeneratedValue(strategy=IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@OneToOne
    @JoinColumn(name="api_bean")
	public ApiBean getApiBean() {
		return apiBean;
	}
	
	public void setApiBean(ApiBean apiBean) {
		this.apiBean = apiBean;
	}
	
	@OneToOne
    @JoinColumn(name="api_user")
	public ApiUser getApiUser() {
		return apiUser;
	}
	public void setApiUser(ApiUser apiUser) {
		this.apiUser = apiUser;
	}

	@Column(name="selection")
	public Boolean getSelection() {
		return selection;
	}
	public void setSelection(Boolean selection) {
		this.selection = selection;
	}
	
	@Column(name="deletion")
	public Boolean getDeletion() {
		return deletion;
	}
	public void setDeletion(Boolean deletion) {
		this.deletion = deletion;
	}
	
	@Column(name="updating")
	public Boolean getUpdating() {
		return updating;
	}
	public void setUpdating(Boolean updating) {
		this.updating = updating;
	}
	
	@Column(name="creation")
	public Boolean getCreation() {
		return creation;
	}
	public void setCreation(Boolean creation) {
		this.creation = creation;
	}
	
	
}
