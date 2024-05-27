class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0];
        int x = bandage[1];
        int y = bandage[2];
        
        int currentHealth = health;
        int success = 0;
        int nextattack = 0;
        
        for(int time = 0; time <= attacks[attacks.length-1][0]; time++){
            // 현재 시간이 공격시간인지 확인
            if(nextattack < attacks.length && attacks[nextattack][0] == time){
                // 공격이 발생하면 체력 감소
                currentHealth -= attacks[nextattack][1];
                // 다음 공격으로 이동
                nextattack++;
                // 연속 성공 시간 초기화
                success = 0;
                
                // 체력이 0이하면 -1 반환
                if (currentHealth <= 0) {
                    return -1;
                }
            } else {
                // 공격이 없으면 최력 회복
                currentHealth = Math.min(currentHealth + x, health);
                success++;
                
                // 연속 성공 시간이 t 초가 되먄 추가 회복..
                if(success == t) {
                    currentHealth = Math.min(currentHealth + y, health);
                    success = 0; 
                }
            }
        }
        return currentHealth;
    }
}