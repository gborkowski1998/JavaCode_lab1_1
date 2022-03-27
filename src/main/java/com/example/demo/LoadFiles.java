package com.example.demo;

import java.io.*;

public class LoadFiles {
    static Object loadFiles() {
        try (FileInputStream input = new FileInputStream("file.txt")) {

            int data = input.read();
            while (data != -1) {
                System.out.print((char) data);
                data = input.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    static Object saveFiles() {
        try (FileOutputStream output = new FileOutputStream("file2.txt")) {

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            String text = reader.readLine();

            byte[] mybytes = text.getBytes();

            output.write(mybytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}