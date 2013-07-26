package com.lsp.web;

import com.lsp.model.transportation.Information;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/informations")
@Controller
@RooWebScaffold(path = "informations", formBackingObject = Information.class)
public class InformationController {
}
