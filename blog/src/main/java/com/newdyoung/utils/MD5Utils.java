package com.newdyoung.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Utils {

    public static String code(String str){
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] digest = md.digest();
            int i;
            StringBuffer buffer = new StringBuffer("");
            for (int offset = 0;offset < digest.length; offset++){
                i=digest[offset];
                if (i<0)
                    i+=256;
                if (i<16)
                    buffer.append("0");
                buffer.append(Integer.toHexString(i));
            }
//            32加密
            return buffer.toString();
//            16加密
//            return buffer.toString().substring(8,24);
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(code("123"));
    }
//202cb962ac59075b964b07152d234b70
}
