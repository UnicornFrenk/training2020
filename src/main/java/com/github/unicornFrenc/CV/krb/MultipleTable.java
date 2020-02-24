package com.github.unicornFrenc.CV.krb;


public class MultipleTable implements Runnable{

    String a,b;
    public void run(){
        for (int i =0;i<100;i++){
            synchronized (this){
                a = "A";
                b ="B";
            }
            System.out.print(a+b+" ");
        }
    }



    public static void main(String[] args)  {
    MultipleTable run = new MultipleTable();
    Thread t1= new Thread(run);
    Thread t2 = new Thread(run);
    t1.start();
    t2.start();
    }



    }

//    List<String> letters = Arrays.asList("l","o","g","i","c");
//        letters.sort((a,b)->b.compareTo(a));
//        letters.stream().forEach(System.out::print);
