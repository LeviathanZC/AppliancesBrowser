package com.zercomp.application.entity.criteria;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Criteria {

    private final String groupName;
    private Map<String, String> criteria = new HashMap<String, String>();

    public Criteria(String name) {
        this.groupName = name;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void add(String searchCriteria, String value) {
        criteria.put(searchCriteria, value);
    }

    public Map<String, String> getCriteria() {
        return Collections.unmodifiableMap(criteria);
    }

}
