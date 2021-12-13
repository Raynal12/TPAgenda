package agenda;

import java.time.LocalDate;
import java.util.*;

/**
 * Description : An agenda that stores events
 */
public class Agenda {

    public ArrayList<Event> agenda = new ArrayList<>();
    public Event event;

    public Agenda() {
        this.event = event;
        this.agenda = agenda;
    }
    
    

    /**
     * Adds an event to this agenda
     *
     * @param e the event to add
     */
    public void addEvent(Event e) {
        agenda.add(e);
    }

    /**
     * Computes the events that occur on a given day
     *
     * @param day the day toi test
     * @return and iteraror to the events that occur on that day
     */
    
    public List<Event> eventsInDay(LocalDate day) {
        List<Event> evenementDuJour = new ArrayList<>();
        for(Event e : this.agenda){
           if(e.isInDay(day)){
              evenementDuJour.add(e);
           }
        }
        return evenementDuJour;
    }

}
