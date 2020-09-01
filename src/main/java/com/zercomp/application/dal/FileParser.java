package com.zercomp.application.dal;


import java.io.*;
import java.util.List;

public class FileParser {

    private static final String DEFAULT_PATH = "resources/appliances_db.txt";

    private FileReader fReader;

    public FileParser() {
        this(DEFAULT_PATH);
    }

    public FileParser(String path) {

    }

    public List<String> readFile() {
        return null;
    }

}
