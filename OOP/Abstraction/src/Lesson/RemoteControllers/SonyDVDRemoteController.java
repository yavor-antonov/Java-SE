package Lesson.RemoteControllers;

public class SonyDVDRemoteController implements IDVDRemoteController{
    @Override
    public void play() {
        System.out.println("Welcome to Sony DVD");
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
}
