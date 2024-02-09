package com.example.practice1.ex;

public class Ex115Bicycle {

    static final String north = "北";
    static final String south = "南";
    static final String west = "西";
    static final String east = "東";
    
    String bearing;

    public Ex115Bicycle() {
    }

    public Ex115Bicycle(String bearing) {
        this.bearing = bearing;
    }

    void trunLeft(){
    if(north.equals(bearing)){
        bearing = west;
    }else
    if(west.equals(bearing)){
        bearing = south;
    }
    if(south.equals(bearing)){
        bearing = east;
    }
    if(east.equals(bearing)){
        bearing = north;
    }
    System.out.println("左へ曲がったので" + bearing + "を向きました");
	
}

void turnRight(){
    if(north.equals(bearing)){
        bearing = east;
    }else
    if(east.equals(bearing)){
        bearing = south;
    }
    if(south.equals(bearing)){
        bearing = west;
    }
    if(west.equals(bearing)){
        bearing = north;
    }
    System.out.println("右へ曲がったので" + bearing + "を向きました");
}

    void display(){
        System.out.println("現在向いている方角は" + bearing +"です");
    }
}
