package Proxy;

// It is a structural design pattern that gives
// the ability to substitute special objects for real ones
// wildcards. These objects intercept calls to
// the original object, allowing you to do something before or after
// transfer the call to the original.
//
// Thanks to the same substitute interface can be
// passed to any code waiting for a service object.
//
// Advantages :
//      + Allows you to control the service object unnoticed by
//          client.
//      + Can control the life cycle of the service object.
//      + It can work even if the service object is not yet
//          created.
//
// Disadvantages :
//      - Complicates the program code due to the introduction of additional
//          classes.
//      - Increases the response time from the service.

public interface Proxy {
    public boolean add(String info);
    public StringBuilder selectAll();
    public boolean deleteAll();
    public boolean isActive();
    public void setStatus(boolean b);
}
