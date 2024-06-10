class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }
    
    private int dfs(int[] numbers, int target, int index, int sum) {
        // 모든 숫자를 다 사용했을 떄
        if(index == numbers.length) {
            // 목표 숫자와 합이 같으면 경우의 수 1 증가
            return sum == target ? 1 : 0;
        }
        // 현재 숫자를 더하는 경우와 빼는 경우로 재귀 호충..
        return dfs(numbers, target, index + 1, sum + numbers[index]) + dfs(numbers, target, index + 1, sum - numbers[index]);
    }
}