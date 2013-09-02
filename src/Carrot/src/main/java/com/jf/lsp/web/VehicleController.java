package com.jf.lsp.web;
import com.jf.lsp.model.transportation.Vehicle;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vehicles")
@Controller
@RooWebScaffold(path = "vehicles", formBackingObject = Vehicle.class)
public class VehicleController {
}
