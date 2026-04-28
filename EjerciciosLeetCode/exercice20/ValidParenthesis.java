public class ValidParenthesis {
    public boolean isValid(String s) {
        for(int i = 0; i < s.length() - 1; i++){
            //System.out.println(0 + s.charAt(i));
            //System.out.println(s.charAt(i+1) - 2);
            if(s.charAt(i) == s.charAt(i+1) - 2 || s.charAt(i) == s.charAt(i+1) - 1  ){

                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {



        ValidParenthesis vp = new ValidParenthesis();
        System.out.println(vp.isValid("()")); // true
        System.out.println(vp.isValid("()[]{}")); // true
        System.out.println(vp.isValid("(]")); // false
        System.out.println(vp.isValid("([)]")); // false
        System.out.println(vp.isValid("{[]}")); // true 
    }
}