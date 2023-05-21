package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Desserte;
import com.example.demo.entity.Gare;
import com.example.demo.entity.Ligne;
import com.example.demo.repository.DesserteRepository;
import com.example.demo.repository.GareRepository;
import com.example.demo.repository.LigneRepository;

@Controller
public class DesserteController {
	@Autowired
	DesserteRepository desserteRepository;
	@Autowired
	LigneRepository ligneRepository;
	@Autowired
	GareRepository gareRepository;
	
	@GetMapping("/desserte/add")
	public ModelAndView add(ModelAndView mv) {
		List<Gare> gares = gareRepository.findAll();
		List<Ligne> lignes = ligneRepository.findAll();
		mv.addObject("desserte", new Desserte());
		mv.addObject("gares", gares);
		mv.addObject("lignes", lignes);
		mv.addObject("titrePage", "Ajouter une desserte");
		mv.setViewName("desserte/add");
		return mv;
	}
	@PostMapping("/desserte/add")
	public ModelAndView addAction(@ModelAttribute("desserte") Desserte desserte,
			ModelAndView mv) {
		desserte = desserteRepository.save(desserte);
		mv.setViewName("redirect:/desserte/list");
		return mv;
	}
	@GetMapping("/desserte/list")
	public ModelAndView list(ModelAndView mv) {
		mv.addObject("titrePage", "Liste des dessertes");

		List<Desserte> dessertes = desserteRepository.findAll();
		mv.addObject("dessertes", dessertes);
		mv.setViewName("desserte/list");
		return mv;
	}
}
