package core.datatypes.impl;

import core.datatypes.Request;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by dhwanit on 25/11/17.
 */
@AllArgsConstructor
public class GetUserRequest implements Request {

    @Getter @Setter
    private String id;
}
