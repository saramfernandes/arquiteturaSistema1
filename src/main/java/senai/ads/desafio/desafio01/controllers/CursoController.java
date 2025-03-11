package senai.ads.desafio.desafio01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import senai.ads.desafio.desafio01.model.Curso;

@Controller
public class CursoController {

    @GetMapping("/desafio01/cadastroCurso")
    public String cadastroCurso() {
        return "cadastroCurso";
    }

    @PostMapping("/desafio01/cadastroCurso")
    public ModelAndView cadastroCurso(Curso curso) {
        ModelAndView mv = new ModelAndView("listaCurso");
        mv.addObject("curso", curso);
        return mv;
    }
}
