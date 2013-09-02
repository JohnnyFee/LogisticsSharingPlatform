package com.jf.lsp.web;
import com.jf.lsp.model.transportation.CommodityProvider;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/commodityproviders")
@Controller
@RooWebScaffold(path = "commodityproviders", formBackingObject = CommodityProvider.class)
public class CommodityProviderController {
}
