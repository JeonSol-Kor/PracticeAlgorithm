class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int video_lenInt = timeChangeSec(video_len);
        int posInt = timeChangeSec(pos);
        int op_startInt = timeChangeSec(op_start);
        int op_endInt = timeChangeSec(op_end);
        
        int result = posInt;
        if(result >= op_startInt && result < op_endInt) result = op_endInt;
        
        for(String command : commands){
            if(command.equals("next")) result += 10;
            else result -= 10;
            
            if(result < 0) result = 0;
            else if(result > video_lenInt) result = video_lenInt;
            if(result >= op_startInt && result < op_endInt) result = op_endInt;
        }
        int min = result / 60;
        int sec = result % 60;
        String answer = timeToString(min) + ":" + timeToString(sec);
        return answer;
    }
    
    public int timeChangeSec(String timeString){
        String[] splitString = timeString.split(":");
        return Integer.parseInt(splitString[0]) * 60 + Integer.parseInt(splitString[1]);
    }
    
    public String timeToString(int time){
        String strTime = "";
        if(time < 10) strTime = "0" + time;
        else strTime = String.valueOf(time);
        return strTime;
    }
}