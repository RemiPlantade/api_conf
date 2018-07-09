package api_conf.conf.service;

import java.util.List;

import api_conf.conf.model.ApiConf;
import api_conf.conf.model.form.ApiConfWrapper;
public interface ApiConfService {
	public void save(ApiConf c);
	public void update(ApiConf c);
	public List<ApiConf> findAll();
	public List<ApiConf> findAllModifiable();
	public ApiConf findById(int id);
	public void delete(int id);
	public ApiConf findByParamKey(String paramName);
	public ApiConf findByKey(String paramName);
	public void updateConfFromWrapper(ApiConfWrapper apiConfWrapper);
	public ApiConf updateServerPort(ApiConfWrapper apiConfWrapper);
	public void saveActualPorts(ApiConfWrapper apiConfWrapper);
	public ApiConfWrapper getApiConfWrapper();
	public void manageHTTPSConfig(ApiConfWrapper apiConfWrapper);
}
