package com.opetstudio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Created by opetstudio on 4/7/17.
 */
@Controller
public class HomePageController {
    @RequestMapping(value="/", method= RequestMethod.GET)
    public ModelAndView indexAction(
            HttpServletRequest request,
            HttpServletResponse response) {

        return new ModelAndView("home-page-index");
    }
}
