package core.api;

import core.datatypes.Request;
import core.datatypes.Response;
import lambda.Context;

/**
 * Created by dhwanit on 25/11/17.
 */
public interface Api<X extends  Request, Y extends Response> {
    public Y enact(X request, Context context);
}
