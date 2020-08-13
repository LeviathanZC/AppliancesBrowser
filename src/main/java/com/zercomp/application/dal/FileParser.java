package com.zercomp.application.dal;

import com.zercomp.application.exception.InvalidDataException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileParser {

    private final String DEFAULT_PATH = "resources/appliances_db.txt";

    private FileReader fReader;

    public FileParser() {
        this(DEFAULT_PATH);
    }

    public FileParser(String path) throws InvalidDataException {
        try {
            fReader = new FileReader(path);
        } catch (FileNotFoundException e) {
            throw new InvalidDataException("Cannot read a file located on the path:" + path);
        }
    }

    public List<String> readFile() {
        List<String> strings = new ArrayList<>();
    }
}
