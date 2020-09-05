package com.zercomp.application.dal.parser;

import com.zercomp.application.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplianceParser {

    private static ApplianceParser INSTANCE;

    private ApplianceParser() {
    }

    public static ApplianceParser getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ApplianceParser();
        }
        return INSTANCE;
    }

    private Pattern NAME_PATTERN = Pattern.compile("^\\w+");
    private Pattern PARAM_PATTERN = Pattern.compile("(\\S+)=([^,\\s]+)");

    private Matcher commonMatcher;

    public List<String> selectSpecifiedAppliance(List<String> allAppliances, Criteria criteria) {
        List<String> foundAppliance = new ArrayList<>();
        String groupSearch = criteria.getGroupName();
        NAME_PATTERN = Pattern.compile(groupSearch);
        for (String appliance : allAppliances) {
            if (NAME_PATTERN.matcher(appliance).find()) {
                foundAppliance.add(appliance);
            }
        }
        return foundAppliance;
    }

    public List<String> selectParams(String appliance) {
        List<String> foundParams = new ArrayList<>();
        commonMatcher = PARAM_PATTERN.matcher(appliance);
        while (commonMatcher.find()) {
            foundParams.add(appliance.substring(commonMatcher.start(), commonMatcher.end()));
        }
        return foundParams;
    }

    public String parseParam(String param) {
        commonMatcher = Pattern.compile("(\\S+)=").matcher(param);
        commonMatcher.find();
        return param.substring(commonMatcher.start(), commonMatcher.end() - 1);
    }

    public String parseValue(String param) {
        String[] values = Pattern.compile("(\\S+)=").split(param);
        return values[values.length - 1];
    }

}
