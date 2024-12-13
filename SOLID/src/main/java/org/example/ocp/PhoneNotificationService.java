package org.example.ocp;

public class PhoneNotificationService implements NotificationReport{
    @Override
    public void sendTransactionReport(String medium) {
        System.out.println("Sending transaction report");
    }

    @Override
    public void sendOTP(String medium) {
        System.out.println("Sending to " + medium);
    }
}
