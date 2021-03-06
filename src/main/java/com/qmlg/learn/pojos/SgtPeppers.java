package com.qmlg.learn.pojos;

import org.springframework.stereotype.Component;

/**
 * Created by a123456 on 2019/5/14.
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
