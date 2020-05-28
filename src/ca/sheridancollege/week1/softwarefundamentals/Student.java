/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author man-l-May 2020
 */
public class Student {
    
    private String name;
    
    private String numHours;

    /**
     * Get the value of numHours
     *
     * @return the value of numHours
     */
    public String getNumHours() {
        return numHours;
    }

    /**
     * Set the value of numHours
     *
     * @param numHours new value of numHours
     */
    public void setNumHours(String numHours) {
        this.numHours = numHours;
    }

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    
}
