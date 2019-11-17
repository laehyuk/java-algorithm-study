package com.ex.week1;

/**
 * 문제 설명
 입력받은 숫자를 거꾸로 배열에 담아 출력함
 */

public class Solution {

    public static void main( String[] args ) {
        Solution s = new Solution();
        int[] answer = s.solution(1234567);

        for(int i =0 ; i < answer.length ; i++){
            System.out.print(answer[i]);
        }
    }

    public int[] solution(long n) {
        String n_string = Long.valueOf(n).toString();
        int[] answer = new int[n_string.length()];
        for(int i = 0 ; i < n_string.length() ; i ++) {
            answer[i] = Integer.parseInt(String.valueOf(n_string.charAt(n_string.length()-i-1)) );
        }
        return answer;
    }
}