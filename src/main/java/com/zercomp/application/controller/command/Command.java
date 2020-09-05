package com.zercomp.application.controller.command;

import com.zercomp.application.controller.command.parameter.Response;

import java.util.Map;

public interface Command {

    //temp
    Response execute(Map<String, Object> params);

}
