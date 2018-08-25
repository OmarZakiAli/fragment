package com.examble.omar.fragment.DataWork;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by omar on 8/15/18.
 */

public class Player implements Parcelable {

    String name;

    protected Player(Parcel in) {
        name = in.readString();
        image = in.readInt();
        desc = in.readString();
    }

    public static final Creator<Player> CREATOR = new Creator<Player>() {
        @Override
        public Player createFromParcel(Parcel in) {
            return new Player(in);
        }

        @Override
        public Player[] newArray(int size) {
            return new Player[size];
        }
    };

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getDesc() {
        return desc;
    }

    int image;
    String desc;

    public Player(String name, int image, String desc) {
        this.name = name;
        this.image = image;
        this.desc = desc;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(image);
        dest.writeString(desc);
    }
}
