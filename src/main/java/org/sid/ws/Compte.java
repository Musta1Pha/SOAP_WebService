package org.sid.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

@XmlRootElement(name="compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int code;
    private double solde;
    @XmlTransient
    private Date datecreation;

    public Compte(){

    }

    public Compte(int code, double solde, Date datecreation) {
        this.code = code;
        this.solde = solde;
        this.datecreation = datecreation;
    }

    public int getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public Date getDatecreation() {
        return datecreation;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDatecreation(Date datecreation) {
        this.datecreation = datecreation;
    }
}
