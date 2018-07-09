package api_conf.conf.service;

import java.util.List;

import api_conf.conf.model.ApiUser;
import api_conf.conf.model.ApiUserPerm;
import api_conf.conf.model.form.ApiUserPermWrapper;
public interface ApiUserPermService {
	public void save(ApiUserPerm c);
	public void update(ApiUserPerm c);
	public List<ApiUserPerm> findAll();
	public ApiUserPerm findById(int id);
	public void delete(int id);
	public void genDefaultPerm(ApiUser c);
	public List<ApiUserPerm> findByUser(ApiUser user);
	public void updatePermFromWrapper(ApiUserPermWrapper userPermWrapper);
}
