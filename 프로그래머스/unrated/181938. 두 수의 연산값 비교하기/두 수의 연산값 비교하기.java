class Solution {
    public int solution(int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b);
        int abc = a * b * 2;
        if (Integer.parseInt(ab) >= abc) {
            return Integer.parseInt(ab);
        } else{
            return abc;
        }

    }
}