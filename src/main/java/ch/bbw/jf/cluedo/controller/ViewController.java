package ch.bbw.jf.cluedo.controller;

import ch.bbw.jf.cluedo.datamodel.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Class: ViewController
 *
 * @author: Schules
 * @date: 29.08.2023
 */

@Controller
public class ViewController {
    private DataService dataService;

    @Autowired
    public ViewController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping
    public String showCluedo(Model model){
        model.addAttribute("peopleList", dataService.getPeople());
        return "cluedoview";
    }
}
