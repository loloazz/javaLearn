package com.company.oop.codeBlock.homeWork01;

public class Frock {
    private static int CurrentNum=100000;
    private int SerialNumber;

    public Frock() {
        SerialNumber = getNextNum();
    }

    public void setSerialNumber(int serialNumber) {
        SerialNumber = serialNumber;
    }

    public int getNextNum(){
        return CurrentNum+=100;
    }

    @Override
    public String toString() {
        return "Frock{" +
                "SerialNumber=" + SerialNumber +
                '}';
    }
}
class TesFrock{
    public static void main(String[] args) {
        Frock frock = new Frock();
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        frock2.setSerialNumber(122002);
        System.out.println(frock.toString());
        System.out.println(frock1.toString());
        System.out.println(frock2.toString());

    }

}