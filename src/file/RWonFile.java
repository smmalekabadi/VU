/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;

/**
 *
 * @author morteza
 */
public final class RWonFile {

    

    public static ArrayList ReadFromfile(String path) throws Exception {
        FileReader fr = null;
        BufferedReader br = null;
        ArrayList<String> places = new ArrayList<String>();
        String str[];
        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

        } catch (Exception e) {
        }
        int n = getNumberOfline(path);
        str = new String[n];
        for (int i = 0; i < n; i++) {
            places.add(br.readLine());

        }
        br.close();
        return places;
    }

    public static int getNumberOfline(String path) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(path));
        int counter = 0;
        while (br.readLine() != null) {
            counter++;

        }
        br.close();
        return counter;
    }

    public static void appendOnFile(String append,String path) {
        ArrayList<String> readabl = null;
        try {
            readabl = ReadFromfile(path);

        } catch (Exception ex) {
        }
        readabl.add(append);

        Writer writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("filename.txt"), "utf-8"));
            for (int i = 0; i < readabl.size(); i++) {
                writer.write(readabl.get(i)+"\n");
            }

        } catch (IOException ex) {
            // report
        } finally {
            try {
                writer.close();
            } catch (Exception ex) {/*ignore*/
            }
        }
    }
}
