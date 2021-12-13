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
        for (Event e : this.agenda) {
            if (e.isInDay(day)) {
                evenementDuJour.add(e);
            }
        }
        return evenementDuJour;
    }

    /**
     * Trouver les événements de l'agenda en fonction de leur titre
     *
     * @param title le titre à rechercher
     * @return les événements qui ont le même titre
     */
    /*public List<Event> findByTitle(String title) {
        // TODO : implémenter cette méthode
        List<Event> findByTitle = new ArrayList<>();
        for (Event e : this.agenda) {
            event.getTitle();
            findByTitle.add(e);
        }
        return findByTitle;
    }

    /**
     * Déterminer s’il y a de la place dans l'agenda pour un événement
     *
     * @param e L'événement à tester (on se limitera aux événements simples)
     * @return vrai s’il y a de la place dans l'agenda pour cet événement
     */
   /* public boolean isFreeFor(Event e) {
        boolean isFreeFor = false;
        if (e.getStart() == e.start) {
            isFreeFor = false;
        }
        return isFreeFor;
    }*/
}
