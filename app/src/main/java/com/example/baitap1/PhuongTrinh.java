package com.example.baitap1;

public class PhuongTrinh {
    private int a,b,c;
    private Double delta;
    private String ketqua;

    public String tinhToan(){
        delta = Math.pow(b,2) - 4*a*c;
        if(a == 0){
            ketqua = "đây là phương trình bậc nhất";
        }
        else if(delta < 0) {
            ketqua = "phương trình vô nghiệm!";
        } else if(delta == 0){
            ketqua = "phương trình có 2 nghiệm kép x1=x2=" + (0-b)/(2*a);
        } else {
            ketqua = "phương trinnh có 2 nghiệm phân biệt x1 = " + ((0-b) + Math.sqrt(delta))/(2*a)+", x2 = " + ((0-b) - Math.sqrt(delta))/(2*a);
        }
        return ketqua;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
