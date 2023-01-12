
public class Student extends Human {
	void speak() {
//		子クラスの中でオーバーライドする際はsuperを使う
		System.out.println("私の名前は" + super.getName() + "です");
	}


}
