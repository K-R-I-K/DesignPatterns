package ChainOfResponsibility;

// It is a behavioral pattern that allows you to pass a request
// to a chain of potential handlers until one of them processes it.
//
// Someone rightly remarked that it would be good to check the data,
// transmitted in the request before entering them into the system -
// suddenly the request contains data on the purchase of non-existent
// products.
//
// Advantages :
//      + Reduces dependency between client and handlers.
//
// Advantages :
//      - The request may not be processed by anyone.

public abstract class ChainOfResponsibility implements CommonInterface {

    private Container container;

    @Override
    public boolean checkWordsCount(String line) {
        return container.checkWordsCount(line);
    }
}
