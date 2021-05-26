package com.company.enumeration;

public enum season02 {
    SPRING("春天","舒适"),
    SUMMER("夏天","炎热"),
    AUTUMN ("秋天","凉爽"),
    WINTER("冬天","寒冷");
    private String name;//季节名称
    private String description;

   private season02(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "season02{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println( season02.AUTUMN);
        System.out.println( season02.SPRING);
        System.out.println("===================");
        season02[] values = season02.values();
        System.out.println(AUTUMN.name());
        season02.valueOf("SPRING");



        for (season02 value : values) {
            System.out.println(value);
        }
    }



}
