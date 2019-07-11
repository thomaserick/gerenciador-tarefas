package br.com.tefhome.gerenciadortarefas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.tefhome.gerenciadortarefas.repositorios.RepositorioTarefa;

@Controller
@RequestMapping("/tarefas")
public class TarefasController {
	
	@Autowired
	private RepositorioTarefa repositorioTarefa;
	
	@GetMapping("/listar")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("tarefas/listar");
		mv.addObject("tarefas",repositorioTarefa.findAll());
		return mv;
		
	}
	
	

}
