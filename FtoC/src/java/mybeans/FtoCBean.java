/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybeans;

import javax.ejb.Stateless;

/**
 *
 * @author thebi
 */
@Stateless
public class FtoCBean implements FtoCBeanRemote {

    @Override
    public double FtoC(int f) {
        double C = (((double)5/9) * (f-32));
        return C;
    }
}
