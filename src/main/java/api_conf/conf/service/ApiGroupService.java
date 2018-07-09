package api_conf.conf.service;

import java.util.List;

import api_conf.conf.model.ApiGroup;
public interface ApiGroupService {
	public void save(ApiGroup c);
	public void update(ApiGroup c);
	public List<ApiGroup> findAll();
	public ApiGroup findById(int id);
	public void delete(int id);
	public ApiGroup findByName(String name);
}
