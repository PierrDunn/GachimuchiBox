package com.pierrdunn.beatbox;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by pierrdunn on 06.03.18.
 */

public class SoundViewModel extends BaseObservable {
    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox beatBox){
        mBeatBox = beatBox;
    }

    public Sound getSound() {
        return mSound;
    }

    @Bindable
    public String getTitle(){
        return mSound.getName();
    }

    public void setSound(Sound sound) {
        mSound = sound;
        notifyChange();
    }

    public void onButtonClicked() {
        mBeatBox.play(mSound);
    }
}
