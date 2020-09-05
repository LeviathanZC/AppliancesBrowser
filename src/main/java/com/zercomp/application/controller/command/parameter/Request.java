package com.zercomp.application.controller.command.parameter;

import java.util.Collection;
import java.util.Map;

public class Request implements CommandParameter {

    private String command;
    private Map<String, Object> parameters;

    public Request(String command, Map<String, Object> params) {
        this.command = command;
        this.parameters = params;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Request request = (Request) o;

        if (getCommand() != null ? !getCommand().equals(request.getCommand()) : request.getCommand() != null)
            return false;
        return getParameters() != null ? getParameters().equals(request.getParameters()) : request.getParameters() == null;
    }

    @Override
    public int hashCode() {
        int result = getCommand() != null ? getCommand().hashCode() : 0;
        result = 31 * result + (getParameters() != null ? getParameters().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(this.command + '[');
        for (Map.Entry<String, Object> entry : parameters.entrySet()) {
            builder.append("parameter:").append(entry.getKey()).append(", ");
            builder.append("value:").append(entry.getValue());
            builder.append(';');
        }
        builder.append("]\n");
        return builder.toString();
    }
}
