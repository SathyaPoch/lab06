class Subject{
    String  Name;
    int TotalCredits=1;
    int TotalHours =50;
    public String toString(){
        return String.format("%s(%d credits, %d hours)", Name, TotalCredits, TotalHours);
    }
    public static void main (String[] args){
        Subject sb = new Subject();
        sb.Name = "Intro to SE";
        sb.TotalCredits = 3;
        sb.TotalHours = 64;
        System.out.println(sb);

    }
}