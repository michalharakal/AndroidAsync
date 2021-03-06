package com.koushikdutta.async.http.server;

import java.util.regex.Matcher;

import com.koushikdutta.async.DataEmitter;
import com.koushikdutta.async.http.libcore.RequestHeaders;

public interface AsyncHttpServerRequest extends DataEmitter {
    public RequestHeaders getHeaders();
    public Matcher getMatcher();
}
