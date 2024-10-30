public class AssignmentBook{
    private boolean isMinuteFree(int period, int minute){
            if((1<=period)&&(period<=8)&&(0<=minute)&&(minute<=59)){
                return true;
            }
            return false;
    }
    private void reserveBlock(int period,int startMinute, int duration){
        int block; 
        if((1<=period)&&(period<=8)&&(0<=startMinute)&&(startMinute<=59)&&(1<=duration)&&(duration<=60)){
            block=startMinute;
         }
         block = -1;
    }
}