package com.company.enumeration;

public class season {
    private String name;//季节名称
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    private season(String name,String description){//构造器私有化
        this.name=name;
        this.description=description;
    }

    public  final static season SPRING =new season("春天","舒适");
    public  final static season SUMMER =new season("夏天","炎热");
    public  final static season AUTUMN =new season("秋天","凉爽");
    public  final static season WINTER =new season("冬天","寒冷");


    @Override
    public String toString() {
        return "season{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(season.AUTUMN);
        System.out.println(season.SPRING);
        System.out.println(season.SUMMER);
        System.out.println(season.WINTER);


    }
}
