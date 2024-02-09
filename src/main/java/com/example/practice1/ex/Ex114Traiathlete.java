package com.example.practice1.ex;

public class Ex114Traiathlete {

    String place;
    String tool;

    public Ex114Traiathlete(String place, String tool) {
        this.place = place;
        this.tool = tool;
    }

    public Ex114Traiathlete() {
    }

    void move(String newPlace) {
        if(place.equals(newPlace)){
            System.out.println("既に"+ place + "にいます");
        }else {
            System.out.println(place + "から" + newPlace + "へ移動しました" );
            place = newPlace;
        }
    }
    
    void changeTool(String newTool){
        if(tool.equals(newTool)){
            System.out.println("既に"+ tool + "を使っています");
        }else {
            System.out.println(tool + "から" + newTool + "にツールを変更しました" );
            tool = newTool;
        }
    }

    void training(){
        System.out.println(place + "で" + tool +"を使用します");

        if("海".equals(place) && "水着".equals(tool)){
            System.out.println("泳ぎの練習をしました");
        }else if("サイクリングロード".equals(place) && "自転車".equals(tool)){
            System.out.println("自転車の練習をしました");
        }else if("公園".equals(place) && "シューズ".equals(tool)){
            System.out.println("走りの練習をしました");
        }else {
            System.err.println("練習できませんでした");
        }
    }   


}
