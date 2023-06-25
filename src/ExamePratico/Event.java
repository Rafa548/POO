package ExamePratico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Event implements IEvent {
    private Client client;
    private static LocalDate l ;
    private Map<LocalDate,Activity> events = new TreeMap< LocalDate,Activity>();
    private Map<Client,Map<LocalDate, Activity>> client_date = new HashMap<Client,Map<LocalDate, Activity>>();


    public Event(LocalDate date){
        this.l = date;
    }

    public Event(Map<LocalDate,Activity> events){
        this.events = events;
    }


    @Override
    public Event addActivity(Activity activity) {
        events.put(l, activity);
        Event event = new Event(events);
        return event;
    }

    @Override
    public LocalDate getDate() {
        return null;
    }

    @Override
    public double totalCost() {
        return 0;
    }
    
}
