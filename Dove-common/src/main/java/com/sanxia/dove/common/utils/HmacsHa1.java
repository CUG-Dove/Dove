package com.sanxia.dove.common.utils;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class HmacsHa1 {
    private static final String HMAC_SHA1 = "HmacSHA1";

    /**
     *  生成签名数据
     *
     * */
    public static  String getSignature(String dataStr, String KeyStr)
            throws InvalidKeyException, NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] data = dataStr.getBytes("Utf-8");
        byte[] key = KeyStr.getBytes("utf-8");
        SecretKey signingKey = new SecretKeySpec(key , HMAC_SHA1);
        Mac mac = Mac.getInstance(HMAC_SHA1);
        mac.init(signingKey);
        byte[] rawHmac = mac.doFinal(data);
        return MD5Tools.encode(new String(rawHmac, "UTF-8"));
    }
}
