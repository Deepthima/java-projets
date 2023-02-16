package corejava;

public class samsung extends mobile {
    public void CameraClick() {
        System.out.println("Default");
    }

    public void CameraClick(String cameraOption) {
        System.out.println("Camera weith option");
    }

    public void CameraClick(String cameraOption, int model) {
        System.out.println("Camera weith option");
    }

    @Override
    public void SendMessage() {
        SendMessage();// sper class and method
        System.out.println("samsung class send msg");
    }

}
