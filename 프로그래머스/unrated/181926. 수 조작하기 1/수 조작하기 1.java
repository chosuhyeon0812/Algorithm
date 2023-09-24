class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String[] controling = control.split("");
        for (int i=0; i < controling.length; i++){
            if (controling[i].equals("w")) {
                answer += 1;
            }
            else if (controling[i].equals("s")) {
                answer -= 1;
            }
            else if (controling[i].equals("d")) {
                answer += 10;
            }
            else if (controling[i].equals("a")){
                answer -= 10;
            }
        }
        return answer;
    }
}