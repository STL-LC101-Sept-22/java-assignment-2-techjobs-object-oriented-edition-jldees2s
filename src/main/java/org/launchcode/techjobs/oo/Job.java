package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
    this.id = nextId;
    nextId++;
}
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    @Override
    public String toString() {
        String errorMessage = "Data not available";
        String printName;
        String printLocation;
        String printEmployer;
        String printPositionType;
        String printCoreCompetency;

        if (name == null || name.equals("")) {
            printName = errorMessage;
        } else {
            printName = name;
        }
        if (location == null || location.equals("")) {
            printLocation = errorMessage;
        } else {
            printLocation = getLocation().getValue();
        }
        if (employer == null || employer.equals("")) {
            printEmployer = errorMessage;
        } else {
            printEmployer = getEmployer().getValue();
        }
        if (positionType == null || positionType.equals("")) {
            printPositionType = errorMessage;
        } else {
            printPositionType = getPositionType().getValue();
        }
        if (coreCompetency == null || coreCompetency.equals("")) {
            printCoreCompetency = errorMessage;
        } else {
            printCoreCompetency = getCoreCompetency().getValue();
        }

        String output = "\nID: " + getId() + "\n" +
                "Name: " + printName + "\n" +
                "Employer: " + printEmployer + "\n" +
                "Location: " + printLocation + "\n" +
                "Position Type: " + printPositionType + "\n" +
                "Core Competency: " + printCoreCompetency + "\n";
        return output;
    }

}
