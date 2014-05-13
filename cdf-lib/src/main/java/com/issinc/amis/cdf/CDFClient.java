package com.issinc.amis.cdf;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brandon Nesterenko on 5/12/14.
 */
public class CDFClient implements ICDFClient {
    @Override
    public List<String> getAllActors() {
        List<String> actors = new ArrayList<>();

        actors.add("actor1");
        actors.add("actor2");

        return actors;
    }
}
