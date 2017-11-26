package core.initializers.impls;

import core.datatypes.Job;
import core.handlers.Handler;
import core.initializers.Chain;
import lombok.Synchronized;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dhwanit on 25/11/17.
 */
public class HandlersChain implements Chain {

    private List<Handler> handlers;

    public HandlersChain(List<Handler> handlers) {
        this.handlers = handlers;
    }

    public HandlersChain(){}

    private void initializeHandlers() {
        this.handlers = new ArrayList<Handler>();
    }

    @Synchronized
    public void addHandler(Handler handler) {
        if (handlers == null) {
            initializeHandlers();
        }
        handlers.add(handler);
    }

    public void execute(Job job) {
        int size = handlers.size();

        try {
            for (int i = 0; i < size; i++) {
                handlers.get(i).before(job);
            }

            for (int i = size - 1; i >=0 ; i--) {
                handlers.get(i).after(job);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }

        System.out.println(job.getResponseOutputStream().toString());
    }
}
