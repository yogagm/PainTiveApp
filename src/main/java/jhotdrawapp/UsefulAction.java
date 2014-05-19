/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jhotdrawapp;

import java.lang.reflect.Constructor;

/**
 *
 * @author Yogayustiawan
 */
public class UsefulAction implements Runnable {
    //run untuk menjalankan tools jhotdraw
    @SuppressWarnings("empty-statement")
    public void run() {
        Constructor construct;
        try {
            construct = UsefulHandler.class.getDeclaredConstructor();
            construct.setAccessible(true);
            construct.newInstance();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}
