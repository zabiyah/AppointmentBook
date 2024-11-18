public class Main{
    public static void main(String[] args){
        boolean[][] schedule = new boolean[8][60];
        AppointmentBook a = new AppointmentBook(schedule);
        System.out.println(a);
        for(int i = 10; i<15; i++) schedule[1][i] = true;
        a.findFreeBlock(2, 15);
        
    }
}