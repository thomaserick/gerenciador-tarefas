package br.com.tefhome.gerenciadortarefas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView  mv = new ModelAndView();
		mv.setViewName("home/home");
		mv.addObject("mensagem","Mensagem do Controller");
		return mv;		
	}
	
	
}
