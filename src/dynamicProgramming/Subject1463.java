package dynamicProgramming;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * 문제
 * 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
 *
 * X가 3으로 나누어 떨어지면, 3으로 나눈다.
 * X가 2로 나누어 떨어지면, 2로 나눈다.
 * 1을 뺀다.
 * 정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
 *
 * 입력
 * 첫째 줄에 1보다 크거나 같고, 106보다 작거나 같은 정수 N이 주어진다.
 *
 * 출력
 * 첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.
 *
 * 예제 입력 1
 * 2
 * 예제 출력 1
 * 1
 * 예제 입력 2
 * 10
 * 예제 출력 2
 * 3
 * 힌트
 *
 * 출처 : https://www.acmicpc.net/problem/16194
 *
 * */

public class Subject1463 {
    public static void main(String[] args) {
        /**
         * 스캐너 구현
         * */
        int value = 10;


        /**
         * 탈출문 조건
         *      연산 값이 1이 될 때 연산한 횟수를 return한다.
         * */
        int count = 0;
        int result = solution(value, count);

        System.out.println(count);


    }

    private static <Map> int solution(int value, int count) {

        //탈출 조건 = value의 값이 1 일때 return 한다.
        if (value == 1) {
            return count;
        }

        /**
         * 조건 1. 연산을 마쳤을 때 정수 값이 나와야 한다.
         * 조건 2. 각 연산을 하였을 때 그 값이 가장 작은 값이여야함.
         *      -> 왜? 로직의 최소값을 찾는 것이 최종 목표 이기 떄문
         * */
        HashMap<String, Integer> resultMap = new HashMap<>();

        // 최소값 벨리데이션 로직
        // 1. 상황별로 맞는 케이스가 아니라 모든 트리를 파봐야 할 것 같은데 고도화
        if(value % 3 == 0){
            resultMap.put("3", value/3);
        }else if(value % 2 == 0){
            resultMap.put("2", value/2);
        } else {
            resultMap.put("1", value-1);
        }

        // 2. 최소값인 친구를 찾아보자.
        int result = 0;
        Iterator<String> iterator = resultMap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            int temp = resultMap.get(key);

            //최초 초기화라는 뜻
            if(result==0){
                result = temp;
            } else {
                //본격적으로 벨리데이션을 해보자.



            }

        }

        return 0;
    }
}
