public class AppointmentBook{
    private boolean [][]schedule;
    public AppointmentBook(boolean[][] schedule){
    this.schedule = schedule;
   }
   private boolean isMinuteFree(int period, int minute){
   return schedule[period-1][minute]; 
    }

    public boolean makeAppointment(int startPeriod, int endPeriod, int duration){
        return false;
    }
    public void printPeriod(int period){
        for(int i = 0; i<schedule[period-1].length; i++)
        System.out.println(i+" "+schedule[period-1][i]);
    }
    public int findFreeBlock(int period, int duration){
            int block =0;{
            for(int i =0; i<60; i++){
                if(isMinuteFree(period,i)){
                    block++;
                    if(block==duration){
                        return (i - duration + 1);
                    }
                    else block = 0;
                }
            }
            return -1;
        }
        }
     
}