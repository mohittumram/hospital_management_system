/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author mohittumram
 */
import java.util.Random;

public class GenerateOTP {
    public static String getOTP () {
        Random random = new Random();
        return String.format("%04d", random.nextInt(10000));
    }
}