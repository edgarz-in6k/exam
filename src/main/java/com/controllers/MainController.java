package com.controllers;

import com.db.ImplementsDAO;
import com.db.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

        return Collections.singletonList("test success");
    }

    @RequestMapping(value = "/log/{username}/{password}", method = RequestMethod.POST)
    public List<String> log(@PathVariable("username") String username, @PathVariable("password") String password) {
        List list = null;
        String result = "Undefined";
        try {
            list = implementsDAO.getList();
            for (Object object : list){
                Object[] objects = (Object[])object;
                if (objects[1].toString().equals(username)){
                    if (objects[2].toString().equals(password)){

                        result = objects[3].toString();

                    }
                    else {
                        result = "Incorrect password";
                    }
                    break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Collections.singletonList(result);
    }

    List<String> getListPage(String id) {

        return null;
    }

}
