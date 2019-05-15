package com.qmlg.learn.pojos;

import com.qmlg.learn.config.CDPlayerConfig;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by a123456 on 2019/5/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    //A collection of JUnit rules for testing code which uses java.lang.System.
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Autowired
    private CompactDisc cd;

    @Autowired
    private MediaPlayer player;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }

    @Test
    public void play() {
        player.play();
        assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band" +
        " by The Beatles\n",
                systemOutRule.getLog());
    }

}
