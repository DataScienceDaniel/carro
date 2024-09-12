package br.edu.ibmec.projeto.backend.controller;
import org.springframework.web.bind.annotation.*;

import br.edu.ibmec.projeto.backend.model.Model;
import org.springframework.ui.Model;
import br.edu.ibmec.projeto.backend.repository.FabricanteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/fabricantes")
public class FabricanteController {
    
    @Autowired
    private FabricanteRepository fabricanteRepository;

    @GetMapping
    public String listarFabricantes(Model model) {
        model.addAttribute("fabricantes", fabricanteRepository.findAll());
        return "fabricantes/lista";
    }
}
