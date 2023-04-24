import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Vote {

    private final Person voter;

    private final LocalDateTime date ;



    public Vote(Person voter) {
        this.voter = voter;

        date = LocalDateTime.now();
    }

    public Person getVoter() {
        return voter;
    }



    public String getDate() {


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                "yyyy-MM-dd hh:mm:ss a");


        LocalDateTime now = LocalDateTime.now();


        String dateTimeString = now.format(formatter);

        return dateTimeString;

    }


    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((voter == null) ? 0 : voter.hashCode());
        return result;
    }


    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vote other = (Vote) obj;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        if (voter == null) {
            if (other.voter != null)
                return false;
        } else if (!voter.equals(other.voter))
            return false;
        return true;
    }






}


