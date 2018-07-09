package api_conf.conf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import api_conf.conf.dao.ApiGroupDao;
import api_conf.conf.model.ApiGroup;
import api_conf.conf.service.ApiGroupPermService;
import api_conf.conf.service.ApiGroupService;
import api_conf.conf.service.ApiUserPermService;

@Service
@Transactional
public class ApiGroupServiceImpl implements ApiGroupService{
	
	@Autowired
	private ApiGroupDao groupconfDAO;
	
	@Resource
	private ApiGroupPermService userGroupService;
	
	@Override
	public void save(ApiGroup c) {
       	generateDefaultPermissions(groupconfDAO.save(c));
	}

	private void generateDefaultPermissions(ApiGroup apiGroup) {
		userGroupService.genDefaultPerm(apiGroup);
		
	}

	@Override
	public void update(ApiGroup c) {
		this.groupconfDAO.save(c);
	}

	@Override
	public List<ApiGroup> findAll() {
		return (List<ApiGroup>) this.groupconfDAO.findAll();
	}

	@Override
	public ApiGroup findById(int id) {
		return this.groupconfDAO.findOne(id);
	}

	@Override
	public void delete(int id) {
		this.groupconfDAO.delete(id);
		
	}

	public ApiGroupDao getCondDAO() {
		return groupconfDAO;
	}

	public void setCondDAO(ApiGroupDao condDAO) {
		this.groupconfDAO = condDAO;
	}

	@Override
	public ApiGroup findByName(String name) {
		// TODO Auto-generated method stub
		return groupconfDAO.findByName(name);
	}

}
