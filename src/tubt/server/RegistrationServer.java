/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubt.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import javax.swing.JOptionPane;
import tubt.interfaces.impl.RegistrationImpl;
import tubt.utils.Constants;

/**
 *
 * @author buith
 */
public class RegistrationServer {

    public static void main(String[] args) {
        try {
            RegistrationImpl registrationInterface = new RegistrationImpl();
            LocateRegistry.createRegistry(1919);
            Naming.bind(Constants.RMI_URL, registrationInterface);
            JOptionPane.showMessageDialog(null, "Server started!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Cannot start server!");
        }
    }

}
