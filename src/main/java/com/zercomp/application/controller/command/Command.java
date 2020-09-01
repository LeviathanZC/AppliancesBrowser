package com.zercomp.application.controller.command;

import com.zercomp.application.controller.command.parameter.ResponseParameter;

import java.util.Map;

public interface Command {

    //temp
    ResponseParameter execute(Map<String, Object> params);

}
