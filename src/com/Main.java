package com;

import sun.awt.geom.AreaOp;

public class Main {
    public static void main(String[] args) {
        Celicat celicat = new Celicat();
        workInTaxi(celicat);
    }

    static void workInTaxi(Car car) {
        car.workInTaxi();

    }
}
interface Car{
    void workInTaxi();
}

 class Toyota implements Car{
    void getPassangers(){
        System.out.println("get passangers");
    }


     @Override
     public void workInTaxi() {
        getPassangers();
     }
 }
class Celicat implements Car{

    @Override
    public void workInTaxi() {
        getPassangers();
    }
    void getPassangers(){
        System.out.println("Get passanger");
    }
}












































