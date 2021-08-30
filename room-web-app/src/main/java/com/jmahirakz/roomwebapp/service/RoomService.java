package com.jmahirakz.roomwebapp.service;

import com.jmahirakz.roomwebapp.data.RoomRepository;
import com.jmahirakz.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {
//    private static final List<Room> rooms = new ArrayList<>();
//
//    static {
//        for (int index = 0; index < 10; index++) {
//            rooms.add(new Room(index, "Room " + index, "R" + index, "Q"));
//        }
//    }

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public Room getById(long id) {
        return roomRepository.findById(id).get();
    }
}
