package com.mateus.utilitarios;

import org.apache.commons.codec.digest.DigestUtils;

public class HashUtils {
  public static String sha256(String value) {
    return new DigestUtils("SHA3-256").digestAsHex(value);
  }
}
