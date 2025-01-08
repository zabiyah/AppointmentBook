public class Main{
    public static void main(String[] args){
       boolean[][]schedule = new boolean [8][60];
       AppointmentBook a = new AppointmentBook(schedule);
        for(int i =10; i<15; i++){schedule[1][i]=true;}
        for(int i =30; i<45; i++){schedule[1][i]=true;}
        for(int i =50; i<60; i++){schedule[1][i]=true;}
        a.printPeriod(2);
        public int findFreeBlock(int period, int duration){
            int block =0;{
            for(int i =0; i<60; i++){
                if(isMinuteFree(period,i)){
                    block++;
                    if(block==duration){
                        return i - duration +1;
                    }
                    else block =0;
                    return -1;
                }
            }
        }
        }
        schedule = new boolean [8][60];
        for(int i =25; i<30; i++){schedule[1][i]=true;}
        for(int i =0; i<15; i++){schedule[2][i]=true;}
        for(int i =41; i<60; i++){schedule[2][i]=true;}
        for(int i =5; i<30; i++){schedule[3][i]=true;}
        for(int i =44; i<60; i++){schedule[3][i]=true;}
    }
}