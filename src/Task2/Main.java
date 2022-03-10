package Task2;

import java.util.ArrayList;

public class Main {



    public static void main(String[] args)
    {
        ArrayList<Room> rooms = new ArrayList<Room>();

        Room room1 = new Room(4,1,3,4);
        Room room2 = new Room(20,27,15,4);
        Room room3 = new Room(3,2,3,4);

        Building building1 = new Building(rooms,2,2,false);

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);


        int sum = 0;

        for (int i = 0; i < rooms.size(); i++)
        {
            sum = sum + building1.rooms.get(i).getNumberOfLamps();

        }
        System.out.println(sum);
    }
}
