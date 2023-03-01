import java.util.List;

public class MeetingRoom implements Training {
    private List<Training> trainings;

    public MeetingRoom(List<Training> trainings) {
        this.trainings = trainings;
    }

    public void conductTraining() {
        for (Training training : trainings) {
            training.attendTraining();
        }
    }


    @Override
    public void attendTraining() {

    }
}