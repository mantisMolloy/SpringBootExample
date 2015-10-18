package doit.controller;

import doit.domain.MyProduct;
import doit.domain.MyProductChild;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tmolloy on 03/10/2015.
 */
@Controller
public class DoItController {

    @RequestMapping("/")
    public String index(Model model) {
        MyProduct product = new MyProduct();
        product.getChildren().add(new MyProductChild());
        model.addAttribute("myproduct", product);
        return "hello";
    }

    @RequestMapping("/save")
    public String save(MyProduct product) {
        System.out.println(product.getField1());
        System.out.println(product.getField2());
        for(MyProductChild child : product.getChildren()) {
            System.out.println(child.getChildField1());
            System.out.println(child.getChildField2());
        }
        return "redirect:/";
    }
}
