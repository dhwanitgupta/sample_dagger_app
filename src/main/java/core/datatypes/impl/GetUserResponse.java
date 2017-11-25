package core.datatypes.impl;

import core.datatypes.Response;
import lombok.AllArgsConstructor;

/**
 * Created by dhwanit on 25/11/17.
 */
@AllArgsConstructor
public class GetUserResponse implements Response {

    private String userName;
    private String id;
    private boolean isActive;
}
