package com.zercomp.application.service.factory.impl;

import com.zercomp.application.service.factory.AbstractFactory;
import com.zercomp.application.service.factory.HouseholdFactory;
import com.zercomp.application.entity.HouseholdAppliance;
import com.zercomp.application.entity.criteria.paramType.SpeakersParam;
import com.zercomp.application.entity.household.FrequencyRange;
import com.zercomp.application.entity.household.Speakers;

import java.util.Map;

public class SpeakersFactory extends HouseholdFactory {
    private static SpeakersFactory INSTANCE;

    private SpeakersFactory() {
    }

    public static HouseholdFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SpeakersFactory();
        }
        return INSTANCE;
    }

    @Override
    public HouseholdAppliance createHouseholdAppliance(Map<String, String> applianceInfo) {
        int powerConsumption = Integer.parseInt(AbstractFactory.getParameter(applianceInfo, SpeakersParam.POWER_CONSUMPTION));
        int numberOfSpeakers = Integer.parseInt(AbstractFactory.getParameter(applianceInfo, SpeakersParam.NUMBER_OF_SPEAKERS));
        double startRange = Double.parseDouble(parseFreq(AbstractFactory.getParameter(applianceInfo, SpeakersParam.FREQUENCY_RANGE), true));
        double endRange = Double.parseDouble(parseFreq(AbstractFactory.getParameter(applianceInfo, SpeakersParam.FREQUENCY_RANGE), false));
        int coordLength = Integer.parseInt(AbstractFactory.getParameter(applianceInfo, SpeakersParam.CORD_LENGTH));;
        return new Speakers(powerConsumption, numberOfSpeakers, new FrequencyRange(startRange, endRange), coordLength);
    }

    private static final String DELIMETER = "-";

    private String parseFreq(String range, boolean start) {
        if (start) {
            return range.substring(0, range.indexOf(DELIMETER) - 1);
        }
        return range.substring(range.indexOf(DELIMETER) + 1);
    }
}
