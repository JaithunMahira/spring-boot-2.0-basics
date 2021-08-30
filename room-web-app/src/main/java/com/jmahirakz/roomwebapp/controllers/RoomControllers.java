package com.jmahirakz.roomwebapp.controllers;

import com.jmahirakz.roomwebapp.models.Room;
import com.jmahirakz.roomwebapp.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomControllers {

    private  static RoomService roomService;

    public RoomControllers(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public String getAllRooms(Model model) {
        model.addAttribute("rooms", roomService.getAllRooms());
        return "rooms"; //template name
    }
}
