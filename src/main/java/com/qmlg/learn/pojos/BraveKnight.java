package com.qmlg.learn.pojos;

/**
 * Created by a123456 on 2019/5/14.
 */
public class BraveKnight implements Knight{

    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }

    public static void main(String[] args) {

    }
}
