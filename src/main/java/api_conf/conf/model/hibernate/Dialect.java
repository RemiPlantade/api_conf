package api_conf.conf.model.hibernate;

public class Dialect {
	private String name; 
	
	private String path;

	public String getName() {
		return name;
	}

	public Dialect setName(String name) {
		this.name = name;
		return this;
	}

	public String getPath() {
		return path;
	}

	public Dialect setPath(String path) {
		this.path = path;
		return this;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
	
	
}
