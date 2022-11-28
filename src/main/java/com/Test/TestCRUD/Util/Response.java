package com.Test.TestCRUD.Util;

import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;

public class Response <R>{

    private boolean success = true;
    private boolean info = false;
    private boolean warning = false;
    private String message;
    private boolean valid = false;

    //private Long id;
    private Map<String, R> model;
    private List<R> items;
    private R obj;
    private Page page;
    private Map<Object, List<R>> groupData;
}
