package api_conf.conf.service;

import java.util.List;

import api_conf.conf.model.ApiUser;
public interface ApiUserService {
	public void save(ApiUser c);
	public List<ApiUser> findAll();
	public ApiUser findById(int id);
	public void delete(int id);
	public boolean tokenExists(String token);
	public List<ApiUser> findAllNotInGroup();
	public void update(ApiUser user);
}
