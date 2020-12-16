package com.company.jokeapp.controllers;

import com.company.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * JokeController creates a JokeService object uses showJoke to
 * add attributes to a model and return view name chucknorris
 */
@Controller
public class JokeController {

    private JokeService jokeService;

    /**
     * Autowired construct to inject dependency
     * @param jokeService
     */
    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    /**
     * Adds joke attribute to model and returns view name chucknorris
     * @param model Model to have attribute added.
     * @return View name for ThymeLeaf
     */
    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }

}
