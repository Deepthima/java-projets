package corejava;

public class Report {
    String reportType;
    String deptGroup;

    Report() {
    }

    Report(String reportType, String deptGroup) {// constructor ovrloading because class and functn name same
        this.reportType = reportType;// this keywrd is used when argument and variable of class are same
        this.deptGroup = deptGroup;// this keyword always points to the variable of the current class
    }

    public void Displayreport() {
        System.out.println("Report loading....");
    }
}
