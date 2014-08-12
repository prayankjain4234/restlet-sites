package com.restlet.frontend.web.firewall.handler;

import java.util.logging.Level;

import org.restlet.Context;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.Status;
import org.restlet.routing.Filter;

import com.restlet.frontend.web.firewall.counter.CounterFeedback;

public class BlockingHandler extends ThresholdHandler {

    public BlockingHandler(int limit) {
        super(limit);
    }

    @Override
    public int thresholdActivated(Request request, Response response,
            CounterFeedback counterFeedback) {
        Context.getCurrentLogger().log(Level.FINE,
                "User " + counterFeedback.getCounterValue()
                + " blocked.");

        response.setStatus(Status.CLIENT_ERROR_FORBIDDEN, "Too many calls");
        return Filter.SKIP;
    }

}
