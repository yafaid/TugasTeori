/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

/**
 *
 * @author hp
 */
public class Programmer extends Pegawai {

    private int bonus;

    public Programmer(String nama, int gaji, int bonus) {
        super(nama, gaji);
        this.bonus = bonus;
    }

    public int getGaji() {
        return gaji;
    }

    public int getBonus() {
        return bonus;
    }
}
