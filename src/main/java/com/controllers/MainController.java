package com.controllers;

import com.db.ImplementsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;
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

    @RequestMapping(value = "/log/{username}/{password}", method = RequestMethod.POST)
    public List<String> log(@PathVariable("username") String username,
                            @PathVariable("password") String password) {
        List list = null;
        List<String> result = Collections.singletonList("Undefined");
        try {
            list = implementsDAO.getList();

            for (Object object : list){
                Object[] objects = (Object[])object;
                if (objects[1].toString().equals(username)){
                    if (objects[2].toString().equals(password)){
                        result = getListPage(objects[0].toString());
                    }
                    else {
                        result = Collections.singletonList("Incorrect password");
                    }
                    break;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    List<String> getListPage(String id) {
        List list = null;
        List result = new ArrayList<>();
        try {
            list = implementsDAO.getListPages(id);
            for (Object object : list){
                Object[] objects = (Object[])object;
                result.add(objects[0].toString());
                result.add(objects[1].toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

}
