package com.pidev.phset.controllers;

import com.pidev.phset.entities.User;
import com.pidev.phset.services.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserRestController {
    private final IUserService iUserService;

    @PostMapping("/addUser")
       User addUser (@RequestBody User user)
        {
            return iUserService.addUser(user);
        }
    @PutMapping("/updateUser")
      User updateUser (@RequestBody User user)
        {
         return iUserService.updateUser(user);
        }

    @GetMapping("/getUser/{iduser}")
       User getUser (@PathVariable Integer iduser)
        {
         return iUserService.getUser(iduser);
        }
    @GetMapping("/getAllUser")
    List<User> getAllUser()
    {
        return iUserService.getAllUsers();
    }

    @DeleteMapping("/removeUser/{iduser}")
     void removeUser (@PathVariable Integer iduser)
    {
        iUserService.removeUser(iduser);
    }

}
