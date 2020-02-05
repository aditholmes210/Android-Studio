package com.aditas.viewpager;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class CarSpec {
    private String name;
    //private String data;
    private ArrayList<Carf> data;

    public static class Carf implements Parcelable { //implement parcelable ke Carf
//        public int harga;
//        public int nama;
        private String nama;
        private String harga;

        public Carf(String nm, String hrg){
            this.nama = nm;
            this.harga = hrg;
        }

        public String getName() {
            return nama;
        }

        public String getHarga() {
            return harga;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) { //masukin data dari Carf ke parcel
            dest.writeString(this.nama);
            dest.writeString(this.harga);
        }

        protected Carf(Parcel in) { //baca data parcel dari Carf
            this.nama = in.readString();
            this.harga = in.readString();
        }

        public static final Parcelable.Creator<Carf> CREATOR = new Parcelable.Creator<Carf>() {
            @Override
            public Carf createFromParcel(Parcel source) {
                return new Carf(source);
            }

            @Override
            public Carf[] newArray(int size) {
                return new Carf[size];
            }
        };
    }

//    public String getName(){
//        return name;
//    }
//    public ArrayList<Carf> getHrg(){
//        ArrayList<Carf> hrg;
//        return hrg;
//    }

    public CarSpec(String name, ArrayList<Carf> data){
        this.name = name;
        this.data = data;
    }
    public String getName(){
        return name;
    }
    public ArrayList<Carf> getData(){
        return data;
    }
}
