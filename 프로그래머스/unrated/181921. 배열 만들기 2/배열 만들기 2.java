import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = l; i <= r; i++){
            int result = 1;
            for (String s: (i+"").split("")){
                if (s.equals("5") || s.equals("0"))
                    continue;
                result = 0;
                break;
            }
            if (result==1) 
                arr.add(i);
        }
        int n = arr.size();
        if (n==0) {
            int[] ans = new int[1];
            ans[0] = -1;
            return ans;
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++)
            ans[i] = arr.get(i);
            return ans;
    }
}