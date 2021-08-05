package homework.home1;

import java.util.Objects;

/**
 * @Author: Yaolong
 * @Date: 2021/7/30 9:49
 * @Pagename: homework.home1
 * @ProjectName: java复习
 * @Describe:
 * 1.编写一个Worker类，为Worker类添加相应的代码，使得Worker对象能正确放入TreeSet中。并编写相应的测试代码。
 * 提示:
 * 1)Worker类含有name,age,salary三个属性
 * 2)取值，赋值的方法可省略
 * 3)比较时，先比较工人的年龄大小，年龄小的排在前面。如果两个工人年龄相同，则根据字典顺序比较工人姓名。
 * 4)编写测试类，向集合中添加三条数据
 * 5)遍历集合，输出集合中的元素信息(Worker类编写toString方法)
 **/
public class worker  implements Comparable{
    private  String name;
    private  int age;
    private double salary;

    public worker() {
    }

    public worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        worker worker = (worker) o;
        return age == worker.age && Double.compare(worker.salary, salary) == 0 && Objects.equals(name, worker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }


    @Override
    public int compareTo(Object o) {

        worker j = (worker) o;
        if (j.age!=this.age) {
            return this.age-j.age;
        }else {
            return  this.name.compareTo(j.name);
        }

    }
}
