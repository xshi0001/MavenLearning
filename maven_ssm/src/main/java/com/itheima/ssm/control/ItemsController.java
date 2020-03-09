package com.itheima.ssm.control;


import com.itheima.ssm.pojo.Items;
import com.itheima.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findDetail")
    public String findDetail(Model model) {
        Items items = itemsService.selectById(1);
        model.addAttribute("item", items);
        return "itemDetail";
    }
}
