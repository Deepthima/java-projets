package corejava;

public class mobile {
    public int IMENumber;// encapsulation
    public String model;

    public void Dial() {
        System.out.println("Dialing.....");
    }

    public void Receive() {
        System.out.println("Receiving.....");
    }

    public int GetImeNumber(int imeNum) {
        return imeNum;
    }

    public void SendMessage() {
        System.out.println("mobile class send msg");
    }
}
