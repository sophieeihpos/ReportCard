import java.util.ArrayList;
public class ReportCard
{
    // instance variables
    private String name;
    private String ID;
    private ArrayList<String> courses = new ArrayList<String>();
    private ArrayList<Integer> scores = new ArrayList<Integer>();

    /**
     * Constructor for objects of class ReportCard
     */
    public ReportCard(String name,String ID)
    {
        // initialise instance variables
        this.name=name.trim().toLowerCase();
        this.ID=ID.trim().toLowerCase();
    }

    public void setScore(String course, int score)
    {
        course=course.trim().toLowerCase();
        boolean found = false;
        if (courses!=null){
            for (int i =0; i<courses.size(); i++){
                if(courses.get(i).compareTo(course)==0){
                    scores.set(i,score);
                    found = true;
                }
            }
            if (found ==false) {
                courses.add(course);
                scores.add(score);
            }
        }
    }

    public String getScore(String course)
    {
        course=course.trim().toLowerCase();
        String score="N/A";
        if (courses!=null ){
            for (int i =0; i<courses.size(); i++){
                if(courses.get(i).compareTo(course)==0){
                    score= scores.get(i).toString();
                }
            }
        }
        return score;
    }

    public String toString() {
        return String.format("ReportCard" +
            "%nname:    " + name +
            "%nID:    " + ID +
            "%ncourses:   " + courses +
            "%nscores:    " + scores);
    }
}