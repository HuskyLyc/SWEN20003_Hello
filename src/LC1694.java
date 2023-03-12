import java.lang.*;
class LC1694 {
    public static String reformatNumber(String number) {
        String pureNum = "";
        for(int i = 0; i < number.length(); ++i){
            if (Character.isDigit(number.charAt(i))){
                pureNum += number.charAt(i);
            }
//            System.out.println(pureNum);
        }
        int len = pureNum.length();
        if(len <= 3) return pureNum;
        else {
            int leave = pureNum.length() % 3;
//            if()
            for(int i = 2; i < pureNum.length(); i += 3){
                String substring = pureNum.substring(i - 2,i);
                String substring1 = pureNum.substring(i,pureNum.length());
                String substring2 = substring+"-"+substring1;
            }
        }
        return pureNum;
    }
    public static void main(String[] args){
        System.out.println(reformatNumber("1-23-45 6"));
    }
}