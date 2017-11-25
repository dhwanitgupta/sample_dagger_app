package core.handlers;

import core.datatypes.Job;

/**
 * Created by dhwanit on 25/11/17.
 */
public interface Handler {

    public void before(Job job);
    public void after(Job job);
}
