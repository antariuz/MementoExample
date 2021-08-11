package model;

public class Save {
    private final String driverFullName;
    private final String driverID;

    public Save(String driverFullName, String driverID) {
        this.driverFullName = driverFullName;
        this.driverID = driverID;
    }

    public String getDriverFullName() {
        return driverFullName;
    }

    public String getDriverID() {
        return driverID;
    }
}
