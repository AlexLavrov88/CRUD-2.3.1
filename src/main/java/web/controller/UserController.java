package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {


    private UserService carService;

    public UserController(UserService carDao) {
        this.carService = carDao;
    }

    @GetMapping("")
    public String getCarList(Model model) {

        model.addAttribute("user", carService.getUserList());
        return "users";

    }

    @GetMapping(value = "/{index}")
    public String getCarId(@PathVariable("index") int index, Model model) {
        if (index >= 5) {
            model.addAttribute("user", carService.getUserList());
        } else {
            model.addAttribute("user", carService.getUserById(index));
        }
        return "users";
    }
}
