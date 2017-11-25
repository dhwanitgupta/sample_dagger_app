package core.datatypes.impl;

import core.datatypes.Request;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by dhwanit on 25/11/17.
 */
@AllArgsConstructor
@Getter
public class CreateUserRequest implements Request{

    private String userName;
    private String phoneNumber;
}
