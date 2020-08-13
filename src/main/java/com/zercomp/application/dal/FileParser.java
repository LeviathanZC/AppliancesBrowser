package com.zercomp.application.dal;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileParser {

    private final String DEFAULT_PATH = "resources/appliances_db.txt";

    private FileReader fReader;

    public FileParser(String path) {
        try {
            fReader = new FileReader(path)
        } catch (FileNotFoundException e) {
            fReader = new FileReader(DEFAULT_PATH);
        }
    }

    public List<String> readFile() {
        List<String> strings = new ArrayList<>();
    }
}
