package api_conf.conf.model.form;

import javax.validation.Valid;

import api_conf.conf.model.ApiGroup;

public class GroupForm {
	@Valid
	private ApiGroup apiGroup;
	
	private ApiGroupPermWrapper apiGroupPermWrapper;

	public ApiGroup getApiGroup() {
		return apiGroup;
	}

	public void setApiGroup(ApiGroup apiGroup) {
		this.apiGroup = apiGroup;
	}

	public ApiGroupPermWrapper getApiGroupPermWrapper() {
		return apiGroupPermWrapper;
	}

	public void setApiGroupPermWrapper(ApiGroupPermWrapper apiGroupPermWrapper) {
		this.apiGroupPermWrapper = apiGroupPermWrapper;
	}
	
	
}
