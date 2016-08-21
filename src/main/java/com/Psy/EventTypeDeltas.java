package com.Psy;

import java.util.HashMap;
import java.util.Map;

/**
 * - informal chat 50 points
 * - common mutual activities (rehearsal) 100 points
 * - help event (helped the person to solve some problem) 150 points
 * - uncommon mutual activities (concert played) 200 points
 */


public class EventTypeDeltas {
    public final int CHAT = 100;
    public final int COMMON_MUTUAL_ACTIVITIES = 100;
    public final int HELP = 100;
    public final int UNCOMMON_MUTUAL_ACTIVITIES = 100;

    public static int getTypeDelta(String type) {
        if (type.equals("CHAT")) {
            return CHAT;
        } else if (type.equals("COMMON_MUTUAL_ACTIVITIES")) {
            return COMMON_MUTUAL_ACTIVITIES;
        } else if (type.equals("HELP")) {
            return HELP;
        } else if (type.equals("UNCOMMON_MUTUAL_ACTIVITIES")) {
            return UNCOMMON_MUTUAL_ACTIVITIES;
        }
        return 0;
    }

}
