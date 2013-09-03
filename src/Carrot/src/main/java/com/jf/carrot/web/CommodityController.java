package com.jf.carrot.web;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jf.carrot.model.transportation.Commodity;

@RequestMapping("/commoditys")
@Controller
@RooWebScaffold(path = "commoditys", formBackingObject = Commodity.class)
public class CommodityController {
}
