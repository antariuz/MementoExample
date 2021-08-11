package model;

public class Scooter {
    private String driverFullName;
    private String driverID;

    public void setDriverFullNameAndDriverID(String driverFullName, String driverID) {
        this.driverFullName = driverFullName;
        this.driverID = driverID;
    }

    public Save save() {
        return new Save(driverFullName, driverID);
    }

    public void loadPreviousDriver(Save save) {
        driverFullName = save.getDriverFullName();
        driverID = save.getDriverID();
    }

    @Override
    public String toString() {
        return  "\nFull name: " + driverFullName +
                "\nDriver ID: " + driverID;
    }
}
