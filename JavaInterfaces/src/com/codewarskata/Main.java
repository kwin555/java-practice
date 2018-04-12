package com.codewarskata;

public class Main {

    public static void main(String[] args) {
        Telephone kevinsPhone;
        kevinsPhone = new DeskPhone(123456);
        kevinsPhone.powerOn();
        kevinsPhone.callPhone(123456);
        kevinsPhone.answer();

        kevinsPhone = new MobilePhone(24565);
        kevinsPhone.callPhone(34565);
        kevinsPhone.answer();
    }


}
