package com.zercomp.application.dal;

import com.zercomp.application.exception.InvalidDataException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileParser {

    private static final String DEFAULT_PATH = "resources/appliances_db.txt";

    private FileReader fReader;

    public FileParser() throws InvalidDataException {
        this(DEFAULT_PATH);
    }

    public FileParser(String path) throws InvalidDataException {

    }

    public List<String> readFile() {
        return null;
    }
}
