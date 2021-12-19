package agenda;

import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * Description : A repetitive Event
 */
public class RepetitiveEvent extends Event {
    
    protected ChronoUnit frequency;
    protected ArrayList<LocalDate> lesExceptions = new ArrayList<LocalDate>();
    /**
     * Constructs a repetitive event
     *
     * @param title the title of this event
     * @param start the start of this event
     * @param duration myDuration in seconds
     * @param frequency one of :
     * <UL>
     * <LI>ChronoUnit.DAYS for daily repetitions</LI>
     * <LI>ChronoUnit.WEEKS for weekly repetitions</LI>
     * <LI>ChronoUnit.MONTHS for monthly repetitions</LI>
     * </UL>
     */
    public RepetitiveEvent(String title, LocalDateTime start, Duration duration, ChronoUnit frequency) {
        super(title, start, duration);
        // TODO : implémenter cette méthode
        this.frequency = frequency;
    }

    /**
     * Adds an exception to the occurrence of this repetitive event
     *
     * @param date the event will not occur at this date
     */

    public void addException(LocalDate date) {
        
        
//        long j = frequency.DAYS.between((start.toLocalDate()), date);
//        j= Math.abs(j);
//        start.toLocalDate().plus(j, frequency)
//              
//        while( (start.toLocalDate().plus(j, frequency)).isEqual(date) || (start.toLocalDate().plus(j, frequency)).isBefore(date) ){
//            if((start.toLocalDate().plus(j, frequency)).isEqual(date)){
//                throw new Exception("L'évenement n'a pas lieu à cette date !");
//            }
//        }
        
//        long nb = 0;
//        while( !(start.toLocalDate().plus(nb, frequency)).isEqual(date)){
//            nb = nb +1;
//        }
//        throw new Exception("L'évenement n'a pas lieu à cette date ! ");

          lesExceptions.add(date);
    }

    /**
     *
     * @return the type of repetition 
     */
    public ChronoUnit getFrequency() {
        return frequency;    
    }

    public boolean isInDay(LocalDate aDay) {
        
        boolean resultat = false;
        int annee = start.getYear();
        int mois = start.getMonthValue();
        int jour = start.getDayOfMonth();

        
        if (super.isInDay(aDay)) {
            resultat = true;
            return resultat;
        }
        
        for( LocalDate date : lesExceptions){
            if(date.equals(aDay)){
                resultat = false;
                return resultat;
            }
        }
        
        while (aDay.isAfter(LocalDate.of(annee, mois, jour))) {
            if (super.isInDay(LocalDate.of(annee, mois, jour))) {
                resultat = true;
                return resultat;
            }
            else {
                if (ChronoUnit.MONTHS==frequency) {
                    mois = mois + 1;
                }
                if (ChronoUnit.WEEKS==frequency) {
                    jour = jour + 7;
                }
                if (ChronoUnit.DAYS==frequency) {
                    jour = jour + 1;
                }
            }
        }
        return resultat;
    }
}
