package api_conf.conf.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import api_conf.conf.model.ApiGroup;

@Transactional("tm2")
@Repository
public interface ApiGroupDao extends CrudRepository<ApiGroup, Integer>{
	
	@Query("SELECT p FROM ApiGroup p WHERE name = :name")
	public ApiGroup findByName(@Param("name")String name);
}
