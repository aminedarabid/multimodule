package com.gtm.controller;

import javax.validation.Valid;

import org.multimodule.domaine.Adresse;
import org.multimodule.service.IGestionAdresse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/Adresse")
public class AdresseController {
	@Autowired
	IGestionAdresse igp;

	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("adresse", new Adresse());
		return "adresse";
	}

	@RequestMapping("/saveAdresse")
	public String savePers(@Valid Adresse a,BindingResult bindingResult,
			Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("adresse", igp.findAllAdresse());
			return "adresse";
		}
		if (a.getId() == 0) {
			igp.insertAdresse(a);
		} /*else {
			igp.updateAdresse(a, String numRue, String ville, String codePostal);
		}*/
		model.addAttribute("adresses", igp.findAllAdresse());
		model.addAttribute("adresse", new Adresse());
		return "adresse";
	}

	/*@RequestMapping("/supprAdress")
	public String supprPers(Integer idAdresse, Model model) {
		igp.deleteAdresse(idAdresse);
		model.addAttribute("Adresse", igp.findAll());
		model.addAttribute("Adresse", new Adresse());
		return "Adresse";
	}*/
	/*
	@RequestMapping("/editPers")
	public String editPers(Integer idPers, Model model) {
		Personne p = igp.getPersonne(idPers);
		model.addAttribute("personne", p);
		model.addAttribute("personnes", igp.findAll());
		return "personnes";
	}*/
}
