package lambda.dataTypes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by dhwanit on 19/11/17.
 */
@AllArgsConstructor
@Getter @Setter
public class GetUserRequest implements ApiRequest {

    private String name;
    private String apiName;
}
