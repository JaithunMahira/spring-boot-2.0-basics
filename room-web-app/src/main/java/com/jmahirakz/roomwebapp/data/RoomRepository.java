package com.jmahirakz.roomwebapp.data;

import com.jmahirakz.roomwebapp.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long>  {
}
