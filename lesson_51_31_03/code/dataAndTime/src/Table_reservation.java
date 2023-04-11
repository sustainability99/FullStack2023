import java.time.LocalDateTime;

public class Table_reservation {
    int tableNum;
    boolean tableStatus;
    LocalDateTime timeReservation;

    public Table_reservation(int tableNum, boolean tableStatus, LocalDateTime timeReservation) {
        this.tableNum = tableNum;
        this.tableStatus = tableStatus;
        this.timeReservation = timeReservation;
    }

    public int getTableNum() {
        return tableNum;
    }

    public void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }

    public boolean isTableStatus() {
        return tableStatus;
    }

    public void setTableStatus(boolean tableStatus) {
        this.tableStatus = tableStatus;
    }

    public LocalDateTime getTimeReservation() {
        return timeReservation;
    }

    public void setTimeReservation(LocalDateTime timeReservation) {
        this.timeReservation = timeReservation;
    }

    @Override
    public String toString() {
        return "Table_reservation -- " +
                "tableNum = " + tableNum +
                "  | tableStatus =  " + tableStatus +
                "  | timeReservation =  " + timeReservation;
    }
}
