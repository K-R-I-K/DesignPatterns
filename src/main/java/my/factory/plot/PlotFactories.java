package my.factory.plot;

import java.util.Arrays;
import java.util.stream.Collectors;

class PlotFactories {

    public PlotFactory classicDisneyPlotFactory(Character hero, Character beloved, Character villain) {
        return () -> new Plot() {
            String str = hero.name() + " is great. " + hero.name() + " and " + beloved.name() + " love each other. " +
                    villain.name() + " interferes with their happiness but loses in the end.";

            @Override
            public String toString() {
                return str;
            }
        };
    }

    public PlotFactory contemporaryDisneyPlotFactory(Character hero, EpicCrisis epicCrisis, Character funnyFriend) {
        return () -> new Plot() {
            String str = hero.name() + " feels a bit awkward and uncomfortable. But personal issues fades, when a big trouble comes - " +
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

    public PlotFactory marvelPlotFactory(Character[] heroes, EpicCrisis epicCrisis, Character villain) {
        return () -> new Plot() {
            String str = epicCrisis.name() + " threatens the world. But brave " +
                    Arrays.asList(heroes).stream().map(n -> n.name()).collect(Collectors.joining(", brave ")) +
                    " on guard. So, no way that intrigues of " +
                    villain.name() + " overcome the willpower of inflexible heroes";

            @Override
            public String toString() {
                return str;
            }
        };
    }
}
