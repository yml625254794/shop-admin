package shopAdminTest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shopAdminTest.model.Cellphone;
import shopAdminTest.service.cellphoneService;

@Controller
public class cellphoneController {
	
	private cellphoneService cs;
	
	
	@Autowired
	public cellphoneController(cellphoneService cs) {
		this.cs = cs;
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/cellphone/")
	public String list(Model model){
		List<Cellphone> cellphone=cs.findAll();
		model.addAttribute("cellphone", cellphone);
		return "cellphone-list";	
	}
	@RequestMapping(method=RequestMethod.GET,value="/cellphone/{id}")
	public String details(Model model,@PathVariable Integer id){
		Cellphone cellphone=cs.findOne(id);
		model.addAttribute("cellphone",cellphone);
		return "cellphone-details";
		
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/cellphone/add/")
	public String add(@ModelAttribute Cellphone cellphone){
		return "cellphone-edit";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/cellphone/add/")
	public String create(@ModelAttribute Cellphone cellphone,BindingResult br){
		if (br.hasErrors()) {
			return "cellphone-edit";
		}
		cs.create(cellphone);
		return "redirect:/cellphone/";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/cellphone/{id}/edit")
	public String edit(@PathVariable Integer id,Model model){
		Cellphone cellphone=cs.findOne(id);
		model.addAttribute("cellphone", cellphone);
		return "cellphone-edit";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/cellphone/{id}/edit")
	public String update(@ModelAttribute @Valid Cellphone cellphone,
			BindingResult br){
		if (br.hasErrors()) {
			return "cellphone-edit";
		}
		cs.update(cellphone);
		return "redirect:/cellphone/";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/cellphone/{id}/delete")
	public String delete(@PathVariable Integer id){
		cs.detele(id);
		return "redirect:/cellphone/";
	}
}
