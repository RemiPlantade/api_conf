package api_conf.conf.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@Entity
@Table(name="api_conf")
@DatabaseTable(tableName = "api_conf")
public class ApiConf {
	@DatabaseField(id = true)
	private Integer id;
	@DatabaseField(columnName = "param_name")
	private String paramName;
	@DatabaseField(columnName = "param_value")
	private String paramValue;
	@DatabaseField(dataType=DataType.ENUM_INTEGER,columnName = "param_type")
	private ApiParamType paramType;
	@DatabaseField(columnName = "param_key")
	private String paramKey;
	@DatabaseField
	private boolean modifiable;
	@DatabaseField
	private boolean added;
	@DatabaseField(dataType=DataType.ENUM_INTEGER,columnName = "param_category")
	private ApiParamCat paramCategory;
	@DatabaseField
	private String description;
	
	
	public ApiConf() {
		super();
	}


	@Id @GeneratedValue(strategy=IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="param_name", length=45)
	public String getParamName() {
		return paramName;
	}
	public void setParamName(String name) {
		this.paramName = name;
	}

	@Column(name="param_value", length=45)
	public String getParamValue() {
		return paramValue;
	}

	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}
	@Column(name="param_type", length=45)
	public ApiParamType getParamType() {
		return paramType;
	}

	public void setParamType(ApiParamType paramType) {
		this.paramType = paramType;
	}

	@Column(name="param_key")
	public String getParamKey() {
		return paramKey;
	}


	public void setParamKey(String paramKey) {
		this.paramKey = paramKey;
	}

	@Column(name="modifiable")
	public boolean isModifiable() {
		return modifiable;
	}


	public void setModifiable(boolean modifiable) {
		this.modifiable = modifiable;
	}



	@Column(name="param_category")
	public ApiParamCat getParamCategory() {
		return paramCategory;
	}


	public void setParamCategory(ApiParamCat paramCategory) {
		this.paramCategory = paramCategory;
	}
	

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return obj instanceof ApiConf 
				&& ((ApiConf)obj).getParamKey().equals(this.getParamKey())
				&&  ((ApiConf)obj).getParamKey().equals(this.getParamValue());
	}

	@Column(name="added")
	public boolean isAdded() {
		return added;
	}


	public void setAdded(boolean added) {
		this.added = added;
	}

	@Column(name="description")
	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
}
