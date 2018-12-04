package com.gtm.controller;


import org.multimodule.domaine.Voiture;
import org.multimodule.service.IGestionPersonne;
import org.multimodule.service.IGestionVoiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/voitures")
public class VoitureController {

	@Autowired
	IGestionPersonne igp;
	@Autowired
	IGestionVoiture igv;
	
	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("personnes", igp.findAll());
		model.addAttribute("voitures",igv.findAllVoitures());
		model.addAttribute("voiture",new Voiture());
		return "voitures";
	}
	
	@RequestMapping("/saveVoit")
	public String saveVoit(Model model, Voiture v) {
		if(v.getIdVoiture()==0)
		{
			igv.ajouterVoiture(v);
		}
		else {
			igv.updateVoiture(v);
		}
		model.addAttribute("personnes", igp.findAll());
		model.addAttribute("voitures",igv.findAllVoitures());
		model.addAttribute("voiture",new Voiture());
		return "voitures";
	}
	@RequestMapping("/supprVoit")
	public String supprVoit(Integer idVoit, Model model) {
		igv.detruireVoiture(idVoit);
		model.addAttribute("personnes", igp.findAll());
		model.addAttribute("voitures", igv.findAllVoitures());
		model.addAttribute("voiture",new Voiture());
		return "voitures";
	}
	@RequestMapping("/editVoit")
	public String editVoit(Integer idVoit, Model model) {
		Voiture v = igv.getVoiture(idVoit);
		model.addAttribute("personnes", igp.findAll());
		model.addAttribute("voitures", igv.findAllVoitures());
		model.addAttribute("voiture",v);
		return "voitures";
	}
}
