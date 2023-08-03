package excpetions;

public class EntityNotPresent extends  Exception {
    public EntityNotPresent(String errorMessage) {
        super(errorMessage);
    }
}
