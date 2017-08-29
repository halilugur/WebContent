/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Otels;
import model.WebUrl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import other.GetURLContent;

/**
 *
 * @author Halil
 */
@Controller
@RequestMapping(value = "/")
public class DefaultController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView mov = new ModelAndView("index");
        return mov;
    }

    @RequestMapping(value = "/url", method = RequestMethod.POST)
    public ModelAndView Url(WebUrl webUrl) {
        String url = "https://www.etstur.com/" + webUrl.getUrl() + "-From-"+webUrl.getIstekSayisi()+"-For-20?sort=searchRank&filters=&fetchAvailableOnly=false";
        ModelAndView mov = new ModelAndView("oteller");
        List<Otels> oteller = new GetURLContent(url).getContent();
        mov.addObject("lists", oteller);
        return mov;
    }

}
