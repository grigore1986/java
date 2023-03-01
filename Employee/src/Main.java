import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manger manger = new Manger("Ion", 60000, 6);
        manger.attendTraining();
        manger.conductInterview();

        Programmer programmer = new Programmer("Grigore", 65000, 3);
        programmer.attendTraining();

   List<Training> list = new ArrayList<>();
   list.add(manger);
   list.add(programmer);

MeetingRoom meetingRoom = new MeetingRoom(list);
meetingRoom.conductTraining();


        }
    }
