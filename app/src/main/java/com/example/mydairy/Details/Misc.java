package com.example.mydairy.Details;

public class Misc {

    String GasBill, ElectricityBill, MaintenanceAmount, MaintenanceDetails, OtherDetails, OtherAmount,date;

    public Misc(String gasBill, String electricityBill, String maintenanceAmount, String maintenanceDetails, String otherDetails, String otherAmount) {
        this.GasBill = gasBill;
        this.ElectricityBill = electricityBill;
        this.MaintenanceAmount = maintenanceAmount;
        this.MaintenanceDetails = maintenanceDetails;
        this.OtherDetails = otherDetails;
        this.OtherAmount = otherAmount;
    }

    public Misc(String gasBill, String electricityBill, String maintenanceAmount, String maintenanceDetails, String otherDetails, String otherAmount, String date) {
        this.GasBill = gasBill;
        this.ElectricityBill = electricityBill;
        this.MaintenanceAmount = maintenanceAmount;
        this.MaintenanceDetails = maintenanceDetails;
        this.OtherDetails = otherDetails;
        this.OtherAmount = otherAmount;
        this.date=date;
    }

    public String getDate() {
        return date;
    }

    public String getGasBill() {
        return GasBill;
    }

    public String getElectricityBill() {
        return ElectricityBill;
    }

    public String getMaintenanceAmount() {
        return MaintenanceAmount;
    }

    public String getMaintenanceDetails() {
        return MaintenanceDetails;
    }

    public String getOtherDetails() {
        return OtherDetails;
    }

    public String getOtherAmount() {
        return OtherAmount;
    }
}
