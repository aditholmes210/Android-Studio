package com.aditas.viewpager;

import java.util.ArrayList;

public class CarSpec {
    private String name;
    //private String data;
    private ArrayList<Carf> data;

    public static class Carf{
//        public int harga;
//        public int nama;
        private String nama;
        private String harga;

        public Carf(String nm, String hrg){
            this.nama = nm;
            this.harga = hrg;
        }

        public int getName() {

        }

        public int getHarga() {
        }
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
