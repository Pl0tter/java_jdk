package org.seminar06;

import java.io.IOException;
import java.io.InputStream;

public class Task03 {
    void testReadResource() {
        try (InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream("test.txt")) {
            if (resourceAsStream != null) {
                System.out.println(new String(resourceAsStream.readAllBytes()));
            } else {
                System.out.println("Ресурс не найден");
            }
        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        new Task03().testReadResource();
    }
}