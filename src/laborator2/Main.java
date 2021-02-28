package laborator2;

public class Main {

    public static void main(String[] args){
        Source[] sources = {new Source("Bro&co", SourceType.FACTORY),
                new Source("StoreToGo", SourceType.WAREHOUSE),
                new Source("MegaStore", SourceType.WAREHOUSE)};

        Destination[] destinations = {new Destination("Tom Hawk", DestinationType.CUSTOMER),
                new Destination("John's Shop", DestinationType.SHOP),
                new Destination("Walmart", DestinationType.SHOP)};
        int[] supply = {10, 35, 25};
        int[] demand = {20, 25, 25};
        int[][] cost = {
                {2, 3, 1},
                {5, 4, 8},
                {5, 6, 8}
        };

        System.out.println(sources[1].toString());
        System.out.println(destinations[0].toString());

        Problem problem = new Problem(sources, destinations, supply, demand, cost);


        System.out.println(problem.toString());
    }
}
