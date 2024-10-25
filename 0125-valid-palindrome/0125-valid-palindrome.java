class Solution {
    public boolean isPalindrome(String s) {
        String st = s.replaceAll("[^a-zA-Z0-9]" , "");
        String str=st.toLowerCase();
        int right = str.length()-1;
        boolean answer = false;
        if(str.isEmpty() || str.length()==1){
            answer=true;
        }
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(right)){
                answer = false;
                break;
            } else {
                answer = true;
            }
            right--;
        }
        return answer;
    }
}