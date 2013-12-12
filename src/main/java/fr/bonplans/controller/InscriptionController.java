package fr.bonplans.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.bonplans.controller.interfaces.IInscriptionController;

@Controller
public class InscriptionController implements IInscriptionController {

        @RequestMapping(value={"/Inscription"},method=RequestMethod.GET)
        public String afficherInscription() {
                System.out.println("afficherInscription()");
                
                
                return "Inscription";
        }

}
