/**
 * / JavaDoc: Represents Course in Year 2 IP 
 * Example: {@code Subject sb = new Subject();}
*@author Sathya 
*@author Chheng Kimter
*@since 2025-12
*/
class Subject{
    private String  name;
    private int totalCredits=1;
    private int totalHours =50;
    public static final double absenceScore = 10;
    public String toString(){
        return String.format("%s(%d credits, %d hours)", name, totalCredits, totalHours);
    }
    /**
     * Find the scores of absences
     * @param absences
     * @return
     */
    public double calcuateAbsenceScorer(int absences ){
        //If totalHour = 10, absences =1 => score = 9
        // if totalHour = 64, absences =10 => score = 9
        return (absences*absenceScore)/totalHours;}
         //MAX_ABSENSCE_SCORE - (absences/totalHours*10 
    public static void main (String[] args){
        Subject sb = new Subject();
        sb.name = "Intro to SE";
        sb.totalCredits = 3;
        sb.totalHours = 64;
        System.out.println(sb);

    }
}