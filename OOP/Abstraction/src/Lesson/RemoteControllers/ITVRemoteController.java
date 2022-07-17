package Lesson.RemoteControllers;

public interface ITVRemoteController {
    void startTV();
    void stopTV();
    void channelUp();
    void channelDown();
    void goToChannel(int channel);
}
