package de.volkswagen.project;

public class Regulation {

    private final long id;
    private final String state;
    public final int maxPersonsClosedRooms;
    public final int maxPersonsOutside;
    public final int maxHouseholdsClosedrooms;
    public final int maxHouseholdsOutside;
    public final boolean maskDuty;
    public final EbuildingTypes closedBuildingtypes;
    public final double maxPersonsPerSquareMeterClosedRooms;
    public final double maxPersonsPerSquareMeterOutside;
    public final String otherRegulations;


    public Regulation(long id, String state, int maxPersonsClosedRooms, int maxPersonsOutside, int maxHouseholdsClosedrooms, int maxHouseholdsOutside, boolean maskDuty, EbuildingTypes closedBuildingtypes, double maxPersonsPerSquareMeterClosedRooms, double maxPersonsPerSquareMeterOutside, String otherRegulations) {
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



    public long getId() {
        return this.id;
    }

    public String getState() {
        return this.state;
    }

    public int getMaxPersonsClosedRooms() {
        return this.maxPersonsClosedRooms;
    }

    public int getMaxPersonsOutside() {
        return this.maxPersonsOutside;
    }

    public int getMaxHouseholdsClosedrooms() {
        return this.maxHouseholdsClosedrooms;
    }

    public int getMaxHouseholdsOutside() {
        return this.maxHouseholdsOutside;
    }

    public boolean getMaskDuty() {
        return this.maskDuty;
    }

    public boolean isMaskDuty() {
        return this.maskDuty;
    }

    public EbuildingTypes getClosedBuildingtypes() {
        return this.closedBuildingtypes;
    }

    public double getMaxPersonsPerSquareMeterClosedRooms() {
        return this.maxPersonsPerSquareMeterClosedRooms;
    }

    public double getMaxPersonsPerSquareMeterOutside() {
        return this.maxPersonsPerSquareMeterOutside;
    }

    public String getOtherRegulations() {
        return this.otherRegulations;
    }



}