package org.example.srp;

public class NotificationService {
    public void sendOTP(String medium){
        if(medium.equals("email")){
            System.out.println("OTP via email");
        }
        if(medium.equals("phone")){
            System.out.println("OTP via phone");
//
        }
    }
}
