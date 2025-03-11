package senai.ads.desafio.desafio01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import senai.ads.desafio.desafio01.model.Professor;

@Controller
public class ProfessorController {
    @GetMapping("/desafio01/cadastroProfessor")
    public String cadastroProfessor() {
        return "cadastroProfessor";
    }

    @PostMapping("/desafio01/cadastroProfessor")
    public ModelAndView cadastroProfessor(Professor professor) {
        ModelAndView mv = new ModelAndView("listaProfessor");
        mv.addObject("professor", professor);
        return mv;
    }
}