public class Location{
    public double longitude;
    public double latitude;
    public Location(double longitude, double latitude){
    this.longitude = longitude;
    this.latitude = latitude;
    }
    Public double distanceTo(Location destination){
    double RADIUS = 6371.01;
    double latA = this.latitude;
    double lonA = this.longitude;
    double latB = destination.latitude;
    double latB = destination.longitude;
    double temp = Math.cos(Math.toRadians(latA))
    * Math.cos(Math.toRadians(latB))
    * Math.cos(Math.toRadians((latB) - (latA)))
    + Math.sin(Math.toRadians(latA))
    * Math.sin(Math.toRadians(latB));
    return temp * RADIUS * Math.PI / 180;
    }
}
