class Solution {

    public List<String> letterCasePermutation(String s) {
        Set<String>res = new HashSet<>();
        res.add(s);
        permute(s, 0, res, "");
        return new ArrayList<>(res);

    }

    public void permute(String s, int idx, Set<String>res, String cur){
        if(idx==s.length()){
            res.add(cur);
            return;
        }
        if(s.charAt(idx)>='0' && s.charAt(idx)<='9'){
            permute(s, idx+1, res, cur+s.charAt(idx));
            return;
        }
        permute(s, idx+1, res, cur+s.charAt(idx));

        permute(s, idx+1, res, cur +(('a' <= s.charAt(idx) && s.charAt(idx) <= 'z') ? (char)(s.charAt(idx) - 'a' + 'A') : (char)(s.charAt(idx) + 'a' - 'A')));


    }
}