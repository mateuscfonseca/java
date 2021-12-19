package com.mateus;

import com.mateus.utilitarios.HashUtils;

import org.junit.jupiter.api.Test;


public class HashUtilsTest {
    
    @Test
    void test_sha256(){
         System.out.println(HashUtils.sha256("bar21mat14"));
    }
}
