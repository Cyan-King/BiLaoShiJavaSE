package day8;

/*
 * 程序功能:继承的使用
 * 程序员:魏国平
 * 编写时间:11月7日
 */

/*
 * 继承的好处：
 * 	1.提高了代码的复用性
 * 	2.让类与类之间产生了关系，给第三个特征多态提供了前提
 * 
 * java中支持单继承。不直接支持多继承，但对C++中的多继承机制进行改良
 * 
 * 单继承：一个子类只能有一个直接父类
 * 
 * 多继承：一个子类可以有多个直接父类（java中不允许，进行改良）
 * 		不直接支持，因为多个父类中有相同成员，会产生调用不确定性。
 * 		在java中是通过“多是实现”的方式来体现
 * 
 * java支持多层（多重）继承
 * 
 * C继承B。B继承A
 * 就会出现继承体系
 * 
 * 当要使用一个继承体系时
 * 1.查看该体系中的顶层类，了解该体系的基本功能
 * 2.创建体系中的最子类对象，完成功能的使用
 * 
 * 什么时候定义继承呢？
 * 
 * 当类与类之间存在这所属关系的时候，就定义继承。
 * 
 * 所属关系： is a 关系。
 */
public class ExtebdsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.name = "张三";
		s.age = 19;
		s.study();
	}

}

class Person
{
	String name;
	int age;
}

class Student extends Person
{
	/*String name;
	int age;*/
	void study()
	{
		System.out.println("student study" + age);
	}
}

class Wordker extends Person
{
	/*String name; 
	int age;*/
	void work()
	{
		System.out.println("worker work");
	}
}