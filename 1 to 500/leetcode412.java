
DATE : 21-NOV-2025
LEVEL : Easy
TOPIC : String Manipulation,Math

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                answer.add("FizzBuzz");
            }else if(i%3==0){
                answer.add("Fizz");
            }else if(i%5==0){
                answer.add("Buzz");
            }else{
                answer.add(String.valueOf(i));
              //  to convert intger to string
                // answer.add(Integer.toString(i));
                // answer.add(i+"");
            }
        }
        return answer;
    }
}