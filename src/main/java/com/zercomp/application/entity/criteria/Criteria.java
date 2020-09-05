package com.zercomp.application.entity.criteria;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Criteria {

    private final String groupName;
    private Map<String, Object> criteria = new HashMap<String, Object>();

    public Criteria(String name) {
        this.groupName = name;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void add(String searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }

    public Map<String, Object> getCriteria() {
        return Collections.unmodifiableMap(criteria);
    }

}
