package com.example.web;

import com.example.entity.Tour;
import com.example.repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/tour")
public class TourControler {
    private TourRepository tourRepository;

    @Autowired
    public TourControler(TourRepository tourRepository)
    { this.tourRepository = tourRepository; }

    @PostMapping
    public String saveTour(@RequestParam("name") long id) {
        Tour t = new Tour();
        t.getId();
        tourRepository.save(t);
        System.out.println("Nowy produkt id: " + t.getId());
        return "tour";
    }

    @GetMapping
    public String getTour(@RequestParam("id") long id) {
        tourRepository.findById(id)
                .ifPresent(t -> System.out.println(t.getId()));
        return "tour";
    }

//    @GetMapping("/list")
//    public ModelAndView getTour() {
//        Map<String, Object> model = new HashMap<>();
//        model.put("tour", TourRepository.findAll());
//        return new ModelAndView("tour", model);
//    }

    @PostMapping("/save")
    public ModelAndView postSaveTour(@ModelAttribute Tour tour) {
        tourRepository.save(tour);
        Map<String, Object> model = new HashMap<>();
        model.put("created", tour);
        return new ModelAndView("tourCreated", model);
    }}
//
//    @GetMapping("/save")
//    public ModelAndView getSaveProduct() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("tourform");
//        modelAndView.getModel().put("tour", new Tour());
//
//        return modelAndView;
//    }
//}
