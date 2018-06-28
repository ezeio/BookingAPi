package com.booking.app.bookingapi.converters.populator;

import java.util.List;

public interface Populator<SOURCE, TARGET> {

    TARGET populate(SOURCE source, TARGET target);
    void populate(List<SOURCE> sources, List<TARGET> targets);
}
