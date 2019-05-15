package com.qmlg.learn.pojos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by a123456 on 2019/5/15.
 */
@Component
public class CDPlayer implements MediaPlayer{

    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
