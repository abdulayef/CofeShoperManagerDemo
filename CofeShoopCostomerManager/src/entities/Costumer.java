package entities;

import abstracts.Entities;

public class Costumer implements Entities {

    public String firstName;
    public String lastNAme;
    public String date;
    public String nationalityId;

    public Costumer(String firstName, String lastNAme, String date, String nationalityId) {
        this.firstName = firstName;
        this.lastNAme = lastNAme;
        this.date = date;
        this.nationalityId = nationalityId;
    }

}
