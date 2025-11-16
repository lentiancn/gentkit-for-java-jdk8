/**
 * Logback: the reliable, generic, fast and flexible logging framework.
 * Copyright (C) 1999-2015, QOS.ch. All rights reserved.
 * <p>
 * This program and the accompanying materials are dual-licensed under
 * either the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation
 * <p>
 * or (per the licensee's choosing)
 * <p>
 * under the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation.
 */
package ch.qos.logback.classic.pattern.color;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase;

import static ch.qos.logback.core.pattern.color.ANSIConstants.*;

/**
 * Highlights inner-text depending on the level, in bold red for events of level
 * ERROR, in red for WARN, in BLUE for INFO, and in the default color for other
 * levels.
 */
public class HighlightingCompositeConverter extends ForegroundCompositeConverterBase<ILoggingEvent> {

    public static void main(String[] args) {
        String color = "#C00000";

        System.out.println(Integer.parseInt(color.substring(1, 3), 16) + ";" + Integer.parseInt(color.substring(3, 5), 16) + ";" + Integer.parseInt(color.substring(5, 7), 16));
    }

    @Override
    protected String getForegroundColorCode(ILoggingEvent event) {
        // {FATAL=bold #C00000, ERROR=bold #B22234, WARN=yellow, INFO=green, DEBUG=blue, TRACE=cyan}

        Level level = event.getLevel();
        switch (level.toInt()) {
            case Level.ERROR_INT:
                return BOLD + RED_FG;
            case Level.WARN_INT:
                return RED_FG;
            case Level.INFO_INT:
                return BLUE_FG;
            default:
                return DEFAULT_FG;
        }

    }
}
