package com.example.shapes;

public class Square extends Rectangle {
    // コンストラクタ: 正方形の一辺を受け取り、Rectangle クラスに渡す
    public Square(double side) {
        super(side, side);  // 正方形なので、幅と高さを同じ値に設定
    }

    // draw メソッドをオーバーライドして、正方形の一辺を表示
    @Override
    public void draw() {
    	System.out.println("Square: side = " + width + " / 正方形: 辺の長さ = " + width);
    }
}
