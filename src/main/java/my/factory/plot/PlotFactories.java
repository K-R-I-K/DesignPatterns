package my.factory.plot;

import my.Named;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Its main class of factory pattern that have methods to create different implementations of PlotFactory interface.
 * That lets produce families of related objects without specifying their concrete classes.
 */
class PlotFactories {
    /**
     * It's method that implements method plot() interface PlotFactory.
     * @param hero It's Character object with which we create new specific implementation of interface PlotFactory.
     * @param beloved It's Character object with which we create new specific implementation of interface PlotFactory.
     * @param villain It's Character object with which we create new specific implementation of interface PlotFactory.
     * @return Specific factory that creates a classic Disney plot
     */
    public PlotFactory classicDisneyPlotFactory(Character hero, Character beloved, Character villain) {
        return () -> new Plot() {
            final String str = hero.name() + " is great. " + hero.name() + " and " + beloved.name() + " love each other. " +
                    villain.name() + " interferes with their happiness but loses in the end.";

            @Override
            public String toString() {
                return str;
            }
        };
    }

    /**
     * It's method that implements method plot() interface PlotFactory.
     * @param hero It's Character object with which we create new specific implementation of interface PlotFactory.
     * @param epicCrisis It's EpicCrisis object with which we create new specific implementation of interface PlotFactory.
     * @param funnyFriend It's Character object with which we create new specific implementation of interface PlotFactory.
     * @return  Specific factory that creates a contemporary Disney plot
     */
    public PlotFactory contemporaryDisneyPlotFactory(Character hero, EpicCrisis epicCrisis, Character funnyFriend) {
        return () -> new Plot() {
            final String str = hero.name() + " feels a bit awkward and uncomfortable. But personal issues fades, when a big trouble comes - " +
                    epicCrisis.name() + ". " +
                    hero.name() + " stands up against it, but with no success at first.But putting self together and help of friends, including spectacular funny " +
                    funnyFriend.name() + " restore the spirit and " +
                    hero.name() + " overcomes the crisis and gains gratitude and respect";

            @Override
            public String toString() {
                return str;
            }
        };
    }

    /**
     * It's method that implements method plot() interface PlotFactory.
     * @param heroes It's array of Character objects with which we create new specific implementation of interface PlotFactory.
     * @param epicCrisis It's EpicCrisis object with which we create new specific implementation of interface PlotFactory.
     * @param villain It's Character object with which we create new specific implementation of interface PlotFactory.
     * @return Specific factory that creates a Marvel plot
     */
    public PlotFactory marvelPlotFactory(Character[] heroes, EpicCrisis epicCrisis, Character villain) {
        return () -> new Plot() {
            final String str = epicCrisis.name() + " threatens the world. But brave " +
                    Arrays.stream(heroes).map(Named::name).collect(Collectors.joining(", brave ")) +
                    " on guard. So, no way that intrigues of " +
                    villain.name() + " overcome the willpower of inflexible heroes";

            @Override
            public String toString() {
                return str;
            }
        };
    }
}
