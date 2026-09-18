package managers;

/**
 * RestaurantManager
 */
public class RestaurantManager {

    List<RestaurantManager> restaurants = new ArrayList<>();
    private static RestaurantManager restaurantManager;

    private RestaurantManager() {};

    public static RestaurantManager getInstance() {

        if (restaurantManager == null) {
            restaurantManager = new RestaurantManager();
        }

        return restaurantManager;
    }

   
    public void addRestaurant(Restaurant r) {
        restaurants.add(r);
    }

    public List<Restaurant> searchByLocation(String loc) {
        List<Restaurant> result = new ArrayList<>();
        loc = loc.toLowerCase();
        for (Restaurant r : restaurants) {
            String rl = r.getLocation().toLowerCase();
            if (rl.equals(loc)) {
                result.add(r);
            }
        }
        return result;
    }
}