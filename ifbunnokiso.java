
public class ifbunnokiso {

	public static void main(String[] args) {
		// もしaが２０より小さい場合、Aと表示する
		int a = 10;
		if (a<20) {
			System.out.println("A");	
		}
		
		//もしaが30以下だった場合、Bと表示する
		int a2 = 20;
		if (a<=30) {
			System.out.println("B");	
		}
		
		//もしｂが山田だった場合、山田さんと表示する
		String b ="山田";
		if (b.equals("山田")) {
			System.out.println(b + "さん");	
		}
		
		//もしa3が１０未満であり、かつ３より大きい場合、Ａと表示する
		int a3 = 5;
		if(a3<10 && 3<a3) {
			System.out.println("A");
		}
		
		//もしｃが5以上である、または、0以下のどちらかである場合、Ｂと表示する
		int c = 5;
		if (c>=5 || c <=0){
			 System.out.println("B");
		}
		
		//elseif
		//もしa4が８より大きい場合、Aと表示する。そうでない場合でa4が１０未満の場合、Bと表示する
		int a4 = 7;
		if (a4 > 8) {
			System.out.println("A");
		} else if(a4 < 10) {
			System.out.println("B");
		}
		
		//もしa5が8より大きい場合、Aと表示する。そうでない場合でa4が１０未満の場合、Bと表示する
		int a5 = 11;
		if (a5 > 8) {
			System.out.println("A");
		} else if(a5 < 10) {
			System.out.println("B");
		}
		
		//もしa6が５より大きい場合、Aと表示する。
		//そうでない場合、Zと表示する。
		int a6 = 3;
		if (a6 >5) {
			System.out.println("A");
		} else {
			System.out.println("Z");
		}
		
		//もしdが8より小さい場合、Aと表示する
		//そうでない場合で８の場合、Bと表示する
		//そうでない場合、Cと表示する
		int d = 20;
		if (d < 8) {
			System.out.println("A");
		} else if(d == 8) {
			System.out.println("B");
		} else  {
			System.out.println("C");
		}
		
		//もしa8が２０以上の場合「成人」と表示する
		//そうでない場合、「未成年」と表示する
		int a8 = 18;
		if (a8 >= 20) {
			System.out.println("成人");
		} else {
			System.out.println("未成年");
		}
		
		//もしageが２０未満の場合、「未成年」と表示
		//そうでない場合、８０より大きければ「高齢者」と表示
		//それ以外の場合、「成人」と表示
		int age = 35;
		if (age < 20) {
			System.out.println("未成年");
		} else if(age > 80) {
			System.out.println("高齢者");
		} else {
			System.out.println("成人");
		}
		
		//もしage2が２０未満なら「未成年」表示
		//そうでない場合で２０以上かつ８０以下は「成人」と表示
		//それ以外は「高齢者」と表示
		int age2 = 35;
		if (age2<20) {
			System.out.println("未成年");
		} else if (age2 >= 20 && age2 <= 80) {
			System.out.println("成人");
		} else {
			System.out.println("高齢者");
		}
		
		//もしｇが奇数と偶数の場合、それぞれの名称を表示する
		int g = 5;
		if (g % 2== 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}
		
		
	}

}
