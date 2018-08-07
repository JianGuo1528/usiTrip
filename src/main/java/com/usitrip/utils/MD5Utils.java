package com.usitrip.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Utils {
    public static String md5(String password) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] bys = md5.digest(password.getBytes());
            return (new BigInteger(1, bys)).toString(16);
        } catch (NoSuchAlgorithmException var3) {
            var3.printStackTrace();
            return null;
        }
    }
}
