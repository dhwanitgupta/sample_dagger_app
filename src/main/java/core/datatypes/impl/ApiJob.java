package core.datatypes.impl;

import core.datatypes.Job;
import core.datatypes.Request;
import core.datatypes.Response;
import lambda.Context;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by dhwanit on 25/11/17.
 */
public class ApiJob extends Job {
    public ApiJob(InputStream requestInputStream, OutputStream responseOutputStream, Context context) {
        super(requestInputStream, responseOutputStream, context);
    }
}
