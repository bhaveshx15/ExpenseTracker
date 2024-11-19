/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;
import java.util.Date;

/**
 *
 * @author Vecna
 */
class d {
     public void setSelectableDateRange(Date startDate, Date endDate) {
        if (startDate == null || endDate == null) {
            System.out.println("Invalid date range: start date or end date is null.");
        } else {
            System.out.println("Date range set from " + startDate + " to " + endDate);
        }
    }
    
}
