package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.domain.Item;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
       private AccountService accountService;
    @RequestMapping("/item")
    public ModelAndView findOne(ModelAndView modelAndView){
        Item item = accountService.findOne(1);
        modelAndView.addObject("item",item);
        modelAndView.setViewName("itemDetail");
        System.out.println(modelAndView);
        return modelAndView;
    }

}
