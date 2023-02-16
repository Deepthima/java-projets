package corejava;

public class bank2 extends bank {

    public void Name() {
        System.out.println("Deepthi");
    }
}

class bank3 {
    public static void main(String[] aStrings) {
        bank2 b1 = new bank2();
        b1.Current();
        b1.Name();
        b1.Saving();
    }

}
