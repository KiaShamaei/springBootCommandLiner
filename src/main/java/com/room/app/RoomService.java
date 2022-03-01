package com.room.app;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {

    private static List<Room> rooms = new ArrayList<>();
    static {
        for( int i=0 ; i < 10 ; i ++){
            rooms.add(new Room(i ,"room"+i ,"R"+ i, "Q" + i));
        }
    }
    public List<Room> getAllRoom(){
        return rooms ;

    }

}

