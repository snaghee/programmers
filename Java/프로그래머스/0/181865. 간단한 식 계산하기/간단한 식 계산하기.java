class Solution {
    public long solution(String binomial) {
        long answer = 0;
        String[] opArray={"+","-","*"};
        
        for(String op : opArray){
            if(binomial.contains(op)){
                String[] ab = binomial.split("\\s*\\" + op + "\\s*");
                long a = Long.parseLong(ab[0].trim());
                long b = Long.parseLong(ab[1].trim());
                switch(op){
                    case "+":
                        answer=a+b;
                        break;
                    case "-":
                        answer=a-b;
                        break;
                    case "*":
                        answer=a*b;
                        break;
                }
                break;
            }
        }
        return answer;
    }
}