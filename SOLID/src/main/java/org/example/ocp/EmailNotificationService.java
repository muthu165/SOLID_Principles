package org.example.ocp;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendOTP(String medium) {
        System.out.println("Sending OTP to " + medium);
    }
}
