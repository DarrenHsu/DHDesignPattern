package tw.com.dh.dhdesignpattern.behavioral.ChainOfResponsibilityPattern;

public class LeaveRequest {
    private String empName;
    private int levelDays;
    private String reason;

    public LeaveRequest(String empName, int levelDays, String reason) {
        this.empName = empName;
        this.levelDays = levelDays;
        this.reason = reason;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getLevelDays() {
        return levelDays;
    }

    public void setLevelDays(int levelDays) {
        this.levelDays = levelDays;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
