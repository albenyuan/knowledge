package com.albenyuan.java;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author Alben Yuan
 * @Date 2018-04-04 16:16
 */

public class Collection {

    public void test(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> hashTable = new Hashtable<>();
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        Map<String, String> weakHashMap = new WeakHashMap<>();
        Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();

        Thread.State state = Thread.currentThread().getState();
    }


}
