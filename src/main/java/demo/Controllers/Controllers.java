package demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demo.Models.Product;
import demo.Repositories.ProductRepository;

@Controller
public class Controllers {

	@Autowired 
	ProductRepository productRepo;
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String showIndex(Model model){
		model.addAttribute("product", new Product());
		return "index";
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String showResults(@ModelAttribute("product") Product product, Model model){
		model.addAttribute("product", product);
		//productRepo.save(product);
		return "result";
	}
}
