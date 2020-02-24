package com.github.unicornFrenc.CV.final_finally_finalize;

public class Final_finally_finalize {

    public void finalize() {
        System.out.println("finalize called");
    }

    public static void main(String[] args) {
        //final - variable (can't be change), method (can't be overridden),
        // class (can't have inhe'rited)
        final int variable = 3;


        System.out.println(method());
        System.out.println(getFirstPlayer());
        getFirstPlayer();
    }



    final static String method() {
        String result = "Final method is called!";
        System.out.println("hi");
        return result;
    }

    final static ChessPlayer getFirstPlayer() {
        return ChessPlayer.WHITE;
    }

}
