package com.learn.basics.io;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter any value: ");
        String greeting = getValue();

        System.out.println("Enter filename: ");
        String fileName = getValue();

        recordFile(greeting, fileName);
        System.out.println("File: ");
        readFile(fileName);

    }

    private static String getValue() throws IOException {
        String value;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        value = br.readLine();

        return value;
    }

    private static void recordFile(String value, String fileName) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        fileOutputStream.write(value.getBytes());
        fileOutputStream.close();
    }

    private static void readFile(String fileName) throws IOException {
        int b;
        FileInputStream fileInputStream = new FileInputStream(fileName);

        do {
            b = fileInputStream.read();
            if(b != -1) System.out.print((char) b);
        } while (b != -1);

        fileInputStream.close();

    }

}
