package com.controllers;

import com.db.ImplementsDAO;
import com.db.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@Controller
public class MainController {

    @Autowired
    public ImplementsDAO implementsDAO;

    @RequestMapping("/")
    public String printWelcome(ModelMap model) {
        model.addAttribute("welcome", "Information of shops and shoppers");
        return "../../index";
    }

    @RequestMapping("/angular")
    public List<String> printWelcomeAngular() {
        System.out.println("ANGULAR111");

        return Arrays.asList("1", "2", "1", "2");
    }

    @RequestMapping(value = "/log", method = RequestMethod.POST)
    public List<UsersEntity> reg() {
        System.out.println("LOG111");
        List list = null;
        List<UsersEntity> listUsers = new ArrayList<>();
        try {
            list = implementsDAO.getList();
            for (Object object : list){
                Object[] objects = (Object[])object;
                System.out.println(objects[0].toString());
                System.out.println(objects[1].toString());
                System.out.println(objects[2].toString());
                System.out.println(objects[3].toString());
                listUsers.add(new UsersEntity(objects[1].toString(),
                        objects[2].toString(),
                        objects[3].toString()));
            }
            System.out.println();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listUsers;
    }
}
