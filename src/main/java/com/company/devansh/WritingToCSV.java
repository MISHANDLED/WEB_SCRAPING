package com.company.devansh;

import com.opencsv.CSVWriter;
import java.io.FileWriter;

public class WritingToCSV {
    public CSVWriter writer;
    WritingToCSV() throws Exception {
         writer = new CSVWriter(new FileWriter("/home/mishandled/Desktop/Try1.csv"));
         //Create a File and change the existing path ("/home/mishandled/Desktop/Try1.csv") to the created file to save data to that file
    }

    public void write(String[] arr) throws Exception{
        this.writer.writeNext(arr);
        this.writer.flush();
        //System.out.println("Data entered");
    }
}
