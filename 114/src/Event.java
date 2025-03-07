public abstract class Event {

    public static final double insuranceCost = 1000.00;
    public static final double baseEventCost = 5000;
    public static final double tax = 0.3;
 
 
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String pointOfContact;
    private Double eventCost;
    private int totalParticipants;
    private int totalEventDays;
 
    public Event(){};
 
    public Event(String eventID, String eventName, String eventLocation, String pointOfContact, int totalParticipants, int totalEventDays) {
         this.eventID = eventID;
         this.eventName = eventName;
         this.eventLocation = eventLocation;
         this.pointOfContact = pointOfContact;    
         this.totalParticipants = totalParticipants;
         this.totalEventDays = totalEventDays;
     }
 
     public String getEventID() {
         return eventID;
     }
 
     public void setEventID(String eventID) {
         this.eventID = eventID;
     }
 
     public String getEventName() {
         return eventName;
     }
 
     public void setEventName(String eventName) {
         this.eventName = eventName;
     }
 
     public String getEventLocation() {
         return eventLocation;
     }
 
     public void setEventLocation(String eventLocation) {
         this.eventLocation = eventLocation;
     }
 
     public String getPointOfContact() {
         return pointOfContact;
     }
 
     public void setPointOfContact(String pointOfContact) {
         this.pointOfContact = pointOfContact;
     }
 
     public Double getEventCost() {
         return eventCost;
     }
 
     public int getTotalParticipants() {
         return totalParticipants;
     }
 
     public void setTotalParticipants(int totalParticipants) {
         this.totalParticipants = totalParticipants;
     }
 
     public int getTotalEventDays() {
         return totalEventDays;
     }
 
     public void setTotalEventDays(int totalEventDays) {
         this.totalEventDays = totalEventDays;
     }
 
     public String toString() {
         return "Event{" +
                 "eventID='" + eventID + '\'' +
                 ", eventName='" + eventName + '\'' +
                 ", eventLocation='" + eventLocation + '\'' +
                 ", pointOfContact='" + pointOfContact + '\'' +
                 ", eventCost=" + eventCost +
                 ", totalParticipants=" + totalParticipants +
                 ", totalEventDays=" + totalEventDays +
                 '}';
     }
 
     public void calculateEventCost() {
         this.eventCost = baseEventCost + (baseEventCost * tax) + insuranceCost;
     }
 
 }
 