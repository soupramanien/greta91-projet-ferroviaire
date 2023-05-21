package com.example.demo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Desserte;
import com.example.demo.entity.Gare;
import com.example.demo.entity.Ligne;
import com.example.demo.repository.DesserteRepository;
import com.example.demo.repository.GareRepository;
import com.example.demo.repository.LigneRepository;

@Controller
public class LigneController {
	@Autowired
	DesserteRepository desserteRepository;
	@Autowired
	LigneRepository ligneRepository;
	@Autowired
	GareRepository gareRepository;
	
	@GetMapping("/ligne/update/{id}")
	public ModelAndView add(ModelAndView mv, @PathVariable int id) {
		List<Gare> gares = gareRepository.findAll();
		Ligne ligne = ligneRepository.findById(id).get();
		mv.addObject("gares", gares);
		mv.addObject("ligne", ligne);
		mv.addObject("titrePage", "modifier une ligne");
		mv.setViewName("ligne/update");
		return mv;
	}
	@PostMapping("/ligne/update/{id}/desserte/add")
	public ModelAndView addAction(@PathVariable int id, @RequestParam("rang") int rang, @RequestParam("gareId") int gareId,
			ModelAndView mv) {
		Desserte desserte = new Desserte();
		desserte.setRang(rang);
		desserte.setGare(gareRepository.findById(gareId).get());
		desserte.setLigne(ligneRepository.findById(id).get());
		desserteRepository.save(desserte);
		mv.setViewName("redirect:/ligne/update/"+id);
		return mv;
	}
	@GetMapping("/ligne/list")
	public ModelAndView list(ModelAndView mv) {
		mv.addObject("titrePage", "Liste des lignes");

		List<Ligne> lignes = ligneRepository.findAll();
		mv.addObject("lignes", lignes);
		mv.setViewName("ligne/list");
		return mv;
	}
}
