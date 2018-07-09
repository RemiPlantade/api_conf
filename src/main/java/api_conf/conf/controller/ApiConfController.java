package api_conf.conf.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import api_conf.conf.model.ApiConf;
import api_conf.conf.model.form.ApiConfWrapper;
import api_conf.conf.service.ApiConfService;

@Controller
@SessionAttributes("apiConfWrapper")
@RefreshScope
public class ApiConfController {

	@Autowired
	private ApiConfService apiConfService;	

	@ModelAttribute("apiConfWrapper")
	public ApiConfWrapper addNewRapperConf() {
		return apiConfService.getApiConfWrapper();
	}

	@GetMapping("/admin/settings")
	public String displayApiConf(Model model) {
		model.addAttribute("apiConfWrapper", apiConfService.getApiConfWrapper());
		model.addAttribute("serverPort", apiConfService.findByKey("server.port").getParamValue());
		model.addAttribute("httpsEnabled", apiConfService.findByKey("server.ssl.enabled").getParamValue());
		return "admin/settings";
	}


	@PostMapping(value = "/admin/settings")
	public String updateConf(HttpSession session, @ModelAttribute("apiConfWrapper") ApiConfWrapper apiConfWrapper, Model model, SessionStatus sa) {
		ApiConf serverPort = apiConfService.updateServerPort(apiConfWrapper);
		apiConfService.saveActualPorts(apiConfWrapper);
		apiConfService.manageHTTPSConfig(apiConfWrapper);
		apiConfService.updateConfFromWrapper(apiConfWrapper);
		session.removeAttribute("apiConfWrapper");
		sa.setComplete();
		model.addAttribute("serverPort",serverPort.getParamValue());
		model.addAttribute("httpsEnabled", apiConfService.findByKey("server.ssl.enabled").getParamValue());
		return "redirect:/admin/settings";
	}

	
}
