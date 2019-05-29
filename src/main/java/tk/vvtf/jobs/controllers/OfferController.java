package tk.vvtf.jobs.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tk.vvtf.jobs.FakeDB;
import tk.vvtf.jobs.entity.JobOffer;

@RestController
public class OfferController {

    @PostMapping("/postOffer")
    public void postJobOffer(@RequestBody JobOffer jobOffer) {
        System.out.println(jobOffer);
        FakeDB.offers.add(jobOffer);
    }
}
