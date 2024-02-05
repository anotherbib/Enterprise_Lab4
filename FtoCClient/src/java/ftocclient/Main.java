/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftocclient;

import java.util.Scanner;
import mybeans.FtoCBeanRemote;


/**
 *
 * @author thebi
 */
public class Main {

    @javax.ejb.EJB
    private static FtoCBeanRemote ftoCBean;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter degree in Fahrenheit: ");
        f = sc.nextInt();
        System.out.println(f + " Fahrenheit = " + ftoCBean.FtoC(f) + " Celsius");
        
    }
    
}
