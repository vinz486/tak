package com.vinz.tak.controller;

import com.vinz.tak.exception.HttpExceptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractController
{
    @Autowired
    protected HttpExceptions exceptions;

    protected Logger log = LoggerFactory.getLogger(getClass());
}
