package Lesson.RemoteControllers;

public class PhilipsRemoteController implements IDVDRemoteController,ITVRemoteController{
    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void eject() {
        System.out.println("Eject DVD");
    }

    @Override
    public void insertDisc() {
        System.out.println("Insert DVD");
    }

    @Override
    public void stop() {
        System.out.println("Stop playing");
    }

    @Override
    public void startTV() {
        System.out.println("Starting TV");
    }

    @Override
    public void stopTV() {
        System.out.println("Stopping TV");
    }

    @Override
    public void channelUp() {
        System.out.println("Going to one channel up");
    }

    @Override
    public void channelDown() {
        System.out.println("Going to one channel down");
    }

    @Override
    public void goToChannel(int channel) {
        System.out.println("Changing to channel " + channel);
    }
}
