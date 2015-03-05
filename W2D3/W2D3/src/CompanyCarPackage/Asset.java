/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompanyCarPackage;

/**
 *
 * @author Kevin
 */
public interface Asset {
    public abstract int getPurchasePrice();
    public abstract int getCurrentValue();
    public abstract int amoritize(int years);
}
