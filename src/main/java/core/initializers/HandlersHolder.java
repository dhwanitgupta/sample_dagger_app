package core.initializers;

import core.handlers.Handler;
import core.handlers.impls.ApiHandler;
import core.handlers.impls.ContextInjector;
import core.handlers.impls.JsonSerializerDeserializer;

import java.util.ArrayList;
import java.util.List;


public class HandlersHolder {


    public static List<Handler> getHandlers() {
        List<Handler> handlers = new ArrayList<Handler>();
        //handlers.add(new JsonSerializerDeserializer());
        handlers.add(new ContextInjector());
        handlers.add(new ApiHandler());
        return handlers;
    }
}
