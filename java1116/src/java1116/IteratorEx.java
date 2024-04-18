package java1116;

import java.util.*;

public class IteratorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		int sum = 0;
		it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합 : " + sum);
	}

}
//강아지 5마리(1강아지 이름과 나이,2강아지 이름과 나이,3강아지 이름과 나이,4강아지 이름과 나이,5강아지 이름과 나이)
//호텔 방 2개, 체크인, 체크아웃시 나이와 이름을 같이 출력, 투숙객 확인 