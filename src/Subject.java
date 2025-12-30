/**
 * / JavaDoc: Represents Course in Year 2 IP 
 * Example: {@code Subject sb = new Subject();}
*@author Sathya 
*@author Chheng Kimter
*@since 2025-12
*/
class Subject{
    private String  Name;
    private int TotalCredits=1;
    private int TotalHours =50;
    public static final double ABSENCE_SCORE = 10;
    public String toString(){
        return String.format("%s(%d credits, %d hours)", Name, TotalCredits, TotalHours);
    }
    /**
     * Find the scores of absences
     * @param absences
     * @return
     */
    public double calcuateAbsenceScorer(int absences ){
        //If totalHour = 10, absences =1 => score = 9
        // if totalHour = 64, absences =10 => score = 9
        return (absences*ABSENCE_SCORE)/TotalHours;}
         //MAX_ABSENSCE_SCORE - (absences/totalHours*10 
    public static void main (String[] args){
        Subject sb = new Subject();
        sb.Name = "Intro to SE";
        sb.TotalCredits = 3;
        sb.TotalHours = 64;
        System.out.println(sb);

    }
}