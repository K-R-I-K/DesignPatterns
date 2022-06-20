package ChainOfResponsibility;

public class PalindromeHandler extends ChainOfResponsibility {

    @Override
    public boolean checkWordsCount(String line) {
        int end = line.length()-1;
        for(int i=0;i<line.length();i++){
            if(i<=end){
                if(line.charAt(i) == line.charAt(end)){
                    end--;
                } else {
                    System.out.println("Palindrome check failed...");
                    return false;
                }
            }
        }
        System.out.println("Palindrome check completed...");
        return true;
    }
}
