package org.sid.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "Convert")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt * 11;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(1,Math.random() * 9875,new Date());
    }
    @WebMethod
    public List<Compte> listComptes(){
        return List.of(
                new Compte(1,Math.random() * 9875,new Date()),
                new Compte(2,Math.random() * 9875,new Date()),
                new Compte(3,Math.random() * 9875,new Date()),
                new Compte(4,Math.random() * 9875,new Date()),
                new Compte(5,Math.random() * 9875,new Date())
        );
    }

}
