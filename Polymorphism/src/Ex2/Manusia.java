/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;

/**
 *
 * @author hp
 */
public class Manusia {

    public void nyalakanPerangkat(Elektronik perangkat) {

        if (perangkat instanceof TelevisiJadul) {
            System.out.println("Nyalakan televisi jadul dengan input : DVI");
            System.out.println("Voltase televisi : 220");
        } else if (perangkat instanceof TelevisiModern) {
            System.out.println("Nyalakan televisi Modern dengan input : HDMI");
            System.out.println("Voltase televisi : 220");
        }
    }
}
