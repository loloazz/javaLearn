package com.company.enumeration;

public class homeWork {
    public static void main(String[] args) {
        Week[] values = Week.values();
        for (Week value : values) {
            System.out.println(value);
        }


    }

}

enum Week {
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期日");
    private String name;

    Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ""+name;
    }
}