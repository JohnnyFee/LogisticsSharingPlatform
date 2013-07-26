package com.lsp.web;

import com.lsp.model.transportation.Commodity;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/commoditys")
@Controller
@RooWebScaffold(path = "commoditys", formBackingObject = Commodity.class)
public class CommodityController {
}
