package tk.vvtf.jobs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tk.vvtf.jobs.FakeDB;

@Controller
public class WebOfferController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String offers(Model model) {
        model.addAttribute("offers", FakeDB.offers);
        return "index";
    }

}
