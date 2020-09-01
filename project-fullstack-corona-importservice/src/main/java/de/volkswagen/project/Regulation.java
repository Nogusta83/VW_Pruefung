package de.volkswagen.project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Regulation {
    @Id
    private  Long id;
    private  String state;
    public  int maxPersonsClosedRooms;
    public  int maxPersonsOutside;
    public  int maxHouseholdsClosedrooms;
    public  int maxHouseholdsOutside;
    public  boolean maskDuty;
    public  EbuildingTypes closedBuildingtypes;
    public  double maxPersonsPerSquareMeterClosedRooms;
    public  double maxPersonsPerSquareMeterOutside;
    public String otherRegulations;



    public Regulation() {
    }

    public Regulation(Long id, String state, int maxPersonsClosedRooms, int maxPersonsOutside, int maxHouseholdsClosedrooms, int maxHouseholdsOutside, boolean maskDuty, EbuildingTypes closedBuildingtypes, double maxPersonsPerSquareMeterClosedRooms, double maxPersonsPerSquareMeterOutside, String otherRegulations) {
        this.id = id;
        this.state = state;
        this.maxPersonsClosedRooms = maxPersonsClosedRooms;
        this.maxPersonsOutside = maxPersonsOutside;
        this.maxHouseholdsClosedrooms = maxHouseholdsClosedrooms;
        this.maxHouseholdsOutside = maxHouseholdsOutside;
        this.maskDuty = maskDuty;
        this.closedBuildingtypes = closedBuildingtypes;
        this.maxPersonsPerSquareMeterClosedRooms = maxPersonsPerSquareMeterClosedRooms;
        this.maxPersonsPerSquareMeterOutside = maxPersonsPerSquareMeterOutside;
        this.otherRegulations = otherRegulations;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getMaxPersonsClosedRooms() {
        return this.maxPersonsClosedRooms;
    }

    public void setMaxPersonsClosedRooms(int maxPersonsClosedRooms) {
        this.maxPersonsClosedRooms = maxPersonsClosedRooms;
    }

    public int getMaxPersonsOutside() {
        return this.maxPersonsOutside;
    }

    public void setMaxPersonsOutside(int maxPersonsOutside) {
        this.maxPersonsOutside = maxPersonsOutside;
    }

    public int getMaxHouseholdsClosedrooms() {
        return this.maxHouseholdsClosedrooms;
    }

    public void setMaxHouseholdsClosedrooms(int maxHouseholdsClosedrooms) {
        this.maxHouseholdsClosedrooms = maxHouseholdsClosedrooms;
    }

    public int getMaxHouseholdsOutside() {
        return this.maxHouseholdsOutside;
    }

    public void setMaxHouseholdsOutside(int maxHouseholdsOutside) {
        this.maxHouseholdsOutside = maxHouseholdsOutside;
    }

    public boolean isMaskDuty() {
        return this.maskDuty;
    }

    public boolean getMaskDuty() {
        return this.maskDuty;
    }

    public void setMaskDuty(boolean maskDuty) {
        this.maskDuty = maskDuty;
    }

    public EbuildingTypes getClosedBuildingtypes() {
        return this.closedBuildingtypes;
    }

    public void setClosedBuildingtypes(EbuildingTypes closedBuildingtypes) {
        this.closedBuildingtypes = closedBuildingtypes;
    }

    public double getMaxPersonsPerSquareMeterClosedRooms() {
        return this.maxPersonsPerSquareMeterClosedRooms;
    }

    public void setMaxPersonsPerSquareMeterClosedRooms(double maxPersonsPerSquareMeterClosedRooms) {
        this.maxPersonsPerSquareMeterClosedRooms = maxPersonsPerSquareMeterClosedRooms;
    }

    public double getMaxPersonsPerSquareMeterOutside() {
        return this.maxPersonsPerSquareMeterOutside;
    }

    public void setMaxPersonsPerSquareMeterOutside(double maxPersonsPerSquareMeterOutside) {
        this.maxPersonsPerSquareMeterOutside = maxPersonsPerSquareMeterOutside;
    }

    public String getOtherRegulations() {
        return this.otherRegulations;
    }

    public void setOtherRegulations(String otherRegulations) {
        this.otherRegulations = otherRegulations;
    }

 


}