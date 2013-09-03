package com.jf.carrot.web;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jf.carrot.model.transportation.Information;

@RequestMapping("/informations")
@Controller
@RooWebScaffold(path = "informations", formBackingObject = Information.class)
public class InformationController {
}
