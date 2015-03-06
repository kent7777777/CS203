/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConstructorCorporateCarPackage;

/**
 *
 * @author Kevin
 */
public class CorporateCar extends Vehicle implements Asset{
    private int purchasePrice;
    private int currentValue;
    private int yearPurchased;
    private String employeeName;
    
    public CorporateCar(int price, int value){
        this(price, value, 0, "bob");
    }
    
    public CorporateCar(int price, int value, int year, String employee){
        this(0, 0, 0, price, value, year, employee);
    }
    
    public CorporateCar(int x, int y, int direction, int price, 
            int value, int year, String employee){
        super(x, y, direction);
        purchasePrice = price;
        currentValue = value;
        yearPurchased = year;
        employeeName = employee;
    }
    
    
    
    @Override
    public void accelerate(){
        setSpeed(getSpeed() + 5);
        if(getSpeed() > 65){
            setSpeed(65);
        }
    }
    
    @Override
    public void brake(){
        setSpeed(getSpeed() - 5);
        if(getSpeed() < 0){
            setSpeed(0);
        }
    }
    
    @Override
    public int amoritize(int years){
        return purchasePrice / years;
    }

    @Override
    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    @Override
    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    public int getYearPurchased() {
        return yearPurchased;
    }

    public void setYearPurchased(int yearPurchased) {
        this.yearPurchased = yearPurchased;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    
}
