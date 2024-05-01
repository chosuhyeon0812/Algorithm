class Solution {
    public int solution(int n) {
        String sam = Integer.toString(n, 3);
        String reverse_sam = new StringBuilder(sam).reverse().toString();
        int decimal = Integer.parseInt(reverse_sam, 3);

        return decimal;
    }
    
}