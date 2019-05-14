package com.qmlg.learn.pojos;

import java.io.PrintStream;

/**
 * Created by a123456 on 2019/5/14.
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
