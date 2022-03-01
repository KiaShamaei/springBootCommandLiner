package com.room.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    private final  RoomService roomService ;

    public ApiController(RoomService roomService) {
        this.roomService = roomService;
    }
    @GetMapping("/rooms")
    public List<Room> getAllRoom (){
        return  roomService.getAllRoom();
    }
}
