package jp.ac.uryukyu.ie.ex2.pair27;

public class Main {
    public void static main(String[] args) {
        Map map = new Map(map.txt);
        //map,txtから読み込んだ情報をPlayer classにsetterで代入
        setXlocation();
        setYlocation();
        System.out.println(getXlocation,getYlocation);
        Player player = new Player();
        //Playerメソッドで左に移動
        player.Player(left);
        System.out.println(getXlocation,getYlocation);
        //下に移動
        player.Player(down);
        System.out.println(getXlocation,getYlocation);
        //右に移動(移動不可)
        player.Player(right);
        System.out.println(getXlocation,getYlocation);
    }
}
