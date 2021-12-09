package krzysztof.hotelsapplication.remote.rest.dto.response;

import javax.swing.*;
import java.util.List;

public class HotelDto {
    private Integer id;
    private Integer name;
    private List<RoomDto> rooms;

    public HotelDto() {
    }

    public HotelDto(Integer id, Integer name, List<RoomDto> rooms) {
        this.id = id;
        this.name = name;
        this.rooms = rooms;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public List<RoomDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomDto> rooms) {
        this.rooms = rooms;
    }
}
