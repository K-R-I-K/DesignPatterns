package my.factory.plot;

/**
 * Factory which create different Plots depends on implementation of this interface.
 */
public interface PlotFactory {
    /**
     * Method which we implement in methods of PlotFactories class.
     * @return Object which implementation depends on Factory method that was used.
     */
    Plot plot();
}
