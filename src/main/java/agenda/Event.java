package agenda;

import java.time.*;

public class Event {

    /**
     * The myTitle of this event
     */
    private String myTitle;
    
    /**
     * The starting time of the event
     */

    protected LocalDateTime start;

    /**
     * The durarion of the event 
     */
    private Duration myDuration;


    /**
     * Constructs an event
     *
     * @param title the title of this event
     * @param start the start time of this event
     * @param duration the duration of this event
     */
    public Event(String title, LocalDateTime start, Duration duration) {
        this.myTitle = title;
        this.start = start;
        this.myDuration = duration;
    }

    /**
     * Tests if an event occurs on a given day
     *
     * @param aDay the day to test
     * @return true if the event occurs on that day, false otherwise
     */
    public boolean isInDay(LocalDate aDay) {
        // TODO : implémenter cette méthode
        boolean b = false;
        long duree = myDuration.toDays();
        if ((this.getStart().toLocalDate().plusDays(duree).isAfter(aDay)) && (this.getStart().toLocalDate().isBefore(aDay))) {
                b = true;
        }
        else if (this.getStart().toLocalDate().plusDays(duree).isEqual(aDay)) {
                b = true;
        }
        else if (this.getStart().toLocalDate().isEqual(aDay)) {
                b = true;
        }
        return b;
    }
   
    /**
     * @return the myTitle
     */
    public String getTitle() {
        return myTitle;
    }

    /**
     * @return the myStart
     */
    public LocalDateTime getStart() {
        return start;
    }


    /**
     * @return the myDuration
     */
    public Duration getDuration() {
        return myDuration;
    }

   
    
}
